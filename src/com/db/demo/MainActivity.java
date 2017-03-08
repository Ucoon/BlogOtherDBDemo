package com.db.demo;

import java.io.IOException;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.db.demo.db.DBController;
import com.db.demo.db.DaoSession;
import com.db.demo.db.Student;
import com.db.demo.db.StudentDao;
import com.db.demo.db.local.DBLocalController;
import com.db.demo.db.local.History;
import com.db.demo.db.local.HistoryDao;
import com.db.demo.utils.DBUtils;

public class MainActivity extends Activity
{
    private StringBuilder builder;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //创建默认的数据,并插入一条数据
        HistoryDao historyDao = DBLocalController.getDaoSession().getHistoryDao();
        History entity = new History();
        entity.setName("科罗拉多");
        entity.setImageUrl("http://www.baidu.com");
        historyDao.insert(entity);
        //拷贝外部DB文件到指定目录
        copyRawDB();
        //通过greendao查询外部db文件数据
        selDBData();
    }
    
    private void selDBData()
    {
        StudentDao student = DBController.getDaoSession(DBController.DATABASE_SCHOOL_NAME).getStudentDao();
        List<Student> students = student.queryBuilder().list();
        builder = new StringBuilder();
        for (int i = 0; i < students.size(); i++)
        {
            builder.append(students.get(i).getName() + "---");
        }
        Toast.makeText(MainActivity.this, builder.toString(), Toast.LENGTH_SHORT).show();
    }
    
    private void copyRawDB()
    {
        try
        {
            // 拷贝res/raw/xxxxdb.zip 到
            // /data/data/com.xinhang.mobileclient/databases/ 目录下面
            boolean isSuccess = DBUtils.copyRawDBToApkDb(MainActivity.this, R.raw.schooldb, DBUtils.APK_DB_PATH, DBUtils.ECMC_DB_NAME, false);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
}

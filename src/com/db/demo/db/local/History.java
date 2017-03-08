package com.db.demo.db.local;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "t_search_history".
 */
public class History {

    private Long id;
    private String name;
    private String url;
    private String action;
    private String imageUrl;
    private String sid;
    private String model;
    private String type;

    public History() {
    }

    public History(Long id) {
        this.id = id;
    }

    public History(Long id, String name, String url, String action, String imageUrl, String sid, String model, String type) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.action = action;
        this.imageUrl = imageUrl;
        this.sid = sid;
        this.model = model;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

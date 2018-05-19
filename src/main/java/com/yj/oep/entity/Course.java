package com.yj.oep.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Course {
    private Integer id;

    private String name;

    private String type;

    private String classify;

    private String classifyName;

    private String subClassify;

    private String subClassifyName;

    private String direction;

    private String username;

    private Boolean level;

    private Boolean free;

    private BigDecimal price;

    private String time;

    private Boolean onsale;

    private String picture;

    private Boolean recommend;

    private Integer weight;

    private Integer studyCount;

    private Date createTime;

    private String createUser;

    private Date updateTime;

    private String updateUser;

    private Boolean del;

    private String brief;

    public Course(Integer id, String name, String type, String classify, String classifyName, String subClassify, String subClassifyName, String direction, String username, Boolean level, Boolean free, BigDecimal price, String time, Boolean onsale, String picture, Boolean recommend, Integer weight, Integer studyCount, Date createTime, String createUser, Date updateTime, String updateUser, Boolean del) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.classify = classify;
        this.classifyName = classifyName;
        this.subClassify = subClassify;
        this.subClassifyName = subClassifyName;
        this.direction = direction;
        this.username = username;
        this.level = level;
        this.free = free;
        this.price = price;
        this.time = time;
        this.onsale = onsale;
        this.picture = picture;
        this.recommend = recommend;
        this.weight = weight;
        this.studyCount = studyCount;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.del = del;
    }

    public Course(Integer id, String name, String type, String classify, String classifyName, String subClassify, String subClassifyName, String direction, String username, Boolean level, Boolean free, BigDecimal price, String time, Boolean onsale, String picture, Boolean recommend, Integer weight, Integer studyCount, Date createTime, String createUser, Date updateTime, String updateUser, Boolean del, String brief) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.classify = classify;
        this.classifyName = classifyName;
        this.subClassify = subClassify;
        this.subClassifyName = subClassifyName;
        this.direction = direction;
        this.username = username;
        this.level = level;
        this.free = free;
        this.price = price;
        this.time = time;
        this.onsale = onsale;
        this.picture = picture;
        this.recommend = recommend;
        this.weight = weight;
        this.studyCount = studyCount;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.del = del;
        this.brief = brief;
    }

    public Course() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName == null ? null : classifyName.trim();
    }

    public String getSubClassify() {
        return subClassify;
    }

    public void setSubClassify(String subClassify) {
        this.subClassify = subClassify == null ? null : subClassify.trim();
    }

    public String getSubClassifyName() {
        return subClassifyName;
    }

    public void setSubClassifyName(String subClassifyName) {
        this.subClassifyName = subClassifyName == null ? null : subClassifyName.trim();
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }

    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Boolean getOnsale() {
        return onsale;
    }

    public void setOnsale(Boolean onsale) {
        this.onsale = onsale;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getStudyCount() {
        return studyCount;
    }

    public void setStudyCount(Integer studyCount) {
        this.studyCount = studyCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }
}
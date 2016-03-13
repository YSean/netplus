package com.net.plus.model;

public class MenuGroup {
    private String gmenuSeq;

    private String gmenuType;

    private String groupId;

    private String country;

    private String provincecode;

    private String citycode;

    private String language;

    private String cientPlat;

    private String sex;

    private String extention;

    public String getGmenuSeq() {
        return gmenuSeq;
    }

    public void setGmenuSeq(String gmenuSeq) {
        this.gmenuSeq = gmenuSeq == null ? null : gmenuSeq.trim();
    }

    public String getGmenuType() {
        return gmenuType;
    }

    public void setGmenuType(String gmenuType) {
        this.gmenuType = gmenuType == null ? null : gmenuType.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode == null ? null : provincecode.trim();
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getCientPlat() {
        return cientPlat;
    }

    public void setCientPlat(String cientPlat) {
        this.cientPlat = cientPlat == null ? null : cientPlat.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention == null ? null : extention.trim();
    }
}
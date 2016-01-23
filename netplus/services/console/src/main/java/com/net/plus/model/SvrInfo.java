package com.net.plus.model;

import java.util.Date;

public class SvrInfo {
    private String svrSeq;

    private String state;

    private String svrId;

    private String svrName;

    private String token;

    private String appId;

    private String appSecret;

    private String accessToken;

    private String urlSend;

    private String urlRecv;

    private String svrType;

    private String encodeingAeskey;

    private Date ctime;

    public String getSvrSeq() {
        return svrSeq;
    }

    public void setSvrSeq(String svrSeq) {
        this.svrSeq = svrSeq == null ? null : svrSeq.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getSvrId() {
        return svrId;
    }

    public void setSvrId(String svrId) {
        this.svrId = svrId == null ? null : svrId.trim();
    }

    public String getSvrName() {
        return svrName;
    }

    public void setSvrName(String svrName) {
        this.svrName = svrName == null ? null : svrName.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    public String getUrlSend() {
        return urlSend;
    }

    public void setUrlSend(String urlSend) {
        this.urlSend = urlSend == null ? null : urlSend.trim();
    }

    public String getUrlRecv() {
        return urlRecv;
    }

    public void setUrlRecv(String urlRecv) {
        this.urlRecv = urlRecv == null ? null : urlRecv.trim();
    }

    public String getSvrType() {
        return svrType;
    }

    public void setSvrType(String svrType) {
        this.svrType = svrType == null ? null : svrType.trim();
    }

    public String getEncodeingAeskey() {
        return encodeingAeskey;
    }

    public void setEncodeingAeskey(String encodeingAeskey) {
        this.encodeingAeskey = encodeingAeskey == null ? null : encodeingAeskey.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
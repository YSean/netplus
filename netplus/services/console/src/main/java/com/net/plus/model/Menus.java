package com.net.plus.model;

import java.util.Date;

public class Menus {
    private String menuSeq;

    private String menuName;

    private String menuType;

    private String gmenuSeq;

    private String parentMenu;

    private String orderId;

    private String key;

    private String def;

    private String mediaId;

    private Date ctime;

    private String state;

    public String getMenuSeq() {
        return menuSeq;
    }

    public void setMenuSeq(String menuSeq) {
        this.menuSeq = menuSeq == null ? null : menuSeq.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    public String getGmenuSeq() {
        return gmenuSeq;
    }

    public void setGmenuSeq(String gmenuSeq) {
        this.gmenuSeq = gmenuSeq == null ? null : gmenuSeq.trim();
    }

    public String getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(String parentMenu) {
        this.parentMenu = parentMenu == null ? null : parentMenu.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def == null ? null : def.trim();
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId == null ? null : mediaId.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}
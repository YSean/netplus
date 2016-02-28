package com.net.plus.model;

public class MetaImage {
    private String imgId;

    private Long imgSize;

    private String imgType;

    private Integer imgHeight;

    private Integer imgWidth;

    private String imgName;

    private byte[] imgData;

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId == null ? null : imgId.trim();
    }

    public Long getImgSize() {
        return imgSize;
    }

    public void setImgSize(Long imgSize) {
        this.imgSize = imgSize;
    }

    public String getImgType() {
        return imgType;
    }

    public void setImgType(String imgType) {
        this.imgType = imgType == null ? null : imgType.trim();
    }

    public Integer getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(Integer imgHeight) {
        this.imgHeight = imgHeight;
    }

    public Integer getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(Integer imgWidth) {
        this.imgWidth = imgWidth;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName == null ? null : imgName.trim();
    }

    public byte[] getImgData() {
        return imgData;
    }

    public void setImgData(byte[] imgData) {
        this.imgData = imgData;
    }
}
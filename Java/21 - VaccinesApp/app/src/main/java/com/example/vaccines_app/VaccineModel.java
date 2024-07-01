package com.example.vaccines_app;

public class VaccineModel {
    private String name;
    private int imgId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public VaccineModel(String name, int imgId) {
        this.name = name;
        this.imgId = imgId;
    }
}

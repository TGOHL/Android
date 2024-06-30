package com.example.worldcup;

import androidx.annotation.Nullable;

public class CountryModel {
    private String name,winCount;
    private int imgId;

    public CountryModel(String name, String winCount, int imgId) {
        this.name = name;
        this.winCount = winCount;
        this.imgId = imgId;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public @Nullable String getWinCount() {
        return winCount;
    }

    public void setWinCount(String winCount) {
        this.winCount = winCount;
    }

    public  @Nullable int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}

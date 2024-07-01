package com.example.fragments;

public enum PageModel {
    RED(R.string.red,R.layout.view_red),
    BLUE(R.string.blue,R.layout.view_blue),
    GREEN(R.string.green,R.layout.view_green);

    private int titleId;
    private int layoutId;

    PageModel(int titleId, int layoutId) {
        this.titleId = titleId;
        this.layoutId = layoutId;
    }

    public int getTitleId() {
        return titleId;
    }

    public int getLayoutId() {
        return layoutId;
    }
}

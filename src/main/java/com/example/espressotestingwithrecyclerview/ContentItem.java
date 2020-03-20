package com.example.espressotestingwithrecyclerview;

public class ContentItem {
    private int mImageResource;
    private String title;
    private String description;

    public ContentItem(int imageResource, String title, String description) {
        mImageResource = imageResource;
        this.title = title;
        this.description = description;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
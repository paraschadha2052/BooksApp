package com.example.android.booksapp;

/**
 * Created by paras on 1/10/17.
 */

public class Book {
    private String mTitle, mAuthor, mDesc, mimageUrl;

    public Book(String title, String author, String desc, String image){
        mTitle = title;
        mAuthor = author;
        mDesc = desc;
        mimageUrl = image;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDesc() {
        return mDesc;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getMimageUrl() {
        return mimageUrl;
    }
}

package com.example.android.booksapp;

/**
 * Created by paras on 1/10/17.
 */

public class Book {
    String mTitle, mAuthor, mDesc;

    public Book(String title, String author, String desc){
        mTitle = title;
        mAuthor = author;
        mDesc = desc;
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
}

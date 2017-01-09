package com.example.android.booksapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paras on 1/10/17.
 */

public class BookLoader extends AsyncTaskLoader<List<Book>> {
    private String mUrl;
    public BookLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    public List<Book> loadInBackground() {
        if(mUrl==null) return  null;
        ArrayList<Book> arr = QueryUtils.fetchBooks(mUrl);
        return arr;
    }
}

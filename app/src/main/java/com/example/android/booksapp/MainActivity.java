package com.example.android.booksapp;

import android.app.LoaderManager;
import android.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Book>>{

    private final String QUERY_URL = "https://www.googleapis.com/books/v1/volumes?q=flowers+inauthor:keyes&key=AIzaSyBCEthacW8d-SyhbykTp3EXAYDrZrORf2s";
    BookAdapter adapter;
    ArrayList<Book> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        arr = new ArrayList<>();
        adapter = new BookAdapter(MainActivity.this, arr);
        listView.setAdapter(adapter);

        getLoaderManager().initLoader(1, null, MainActivity.this);
    }

    @Override
    public Loader<List<Book>> onCreateLoader(int id, Bundle args) {
        return new BookLoader(MainActivity.this, QUERY_URL);
    }

    @Override
    public void onLoadFinished(Loader<List<Book>> loader, List<Book> data) {
        adapter.clear();
        if(data!=null && !data.isEmpty()){
            adapter.addAll(data);
        }

    }

    @Override
    public void onLoaderReset(Loader<List<Book>> loader) {
        adapter.clear();
    }
}

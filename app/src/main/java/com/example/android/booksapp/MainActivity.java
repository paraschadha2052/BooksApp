package com.example.android.booksapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayList<Book> arr = new ArrayList<>();
        arr.add(new Book("The Play of Daniel Keyes' Flowers for Algernon", "Bert Coules, Daniel Keyes - 1993", "The Heinemann Plays series offers contemporary drama and classic plays in durable classroom editions."));
        arr.add(new Book("The Play of Daniel Keyes' Flowers for Algernon", "Bert Coules, Daniel Keyes - 1993", "The Heinemann Plays series offers contemporary drama and classic plays in durable classroom editions."));

        BookAdapter adapter = new BookAdapter(MainActivity.this, arr);
        listView.setAdapter(adapter);
    }
}

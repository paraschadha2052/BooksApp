package com.example.android.booksapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by paras on 1/10/17.
 */

public class BookAdapter extends ArrayAdapter<Book>{
    public BookAdapter(Context context, List<Book> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, parent, false);
        }

        Book book = getItem(position);
        TextView title, author, desc;

        title = (TextView) convertView.findViewById(R.id.Title);
        author = (TextView) convertView.findViewById(R.id.author);
        desc = (TextView) convertView.findViewById(R.id.desc);

        title.setText(book.getmTitle());
        author.setText(book.getmAuthor());
        desc.setText(book.getmDesc());

        return convertView;
    }
}



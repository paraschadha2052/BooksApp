package com.example.android.booksapp;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

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

        final Book book = getItem(position);
        final TextView title, author, desc;
        ImageView image;

        title = (TextView) convertView.findViewById(R.id.Title);
        author = (TextView) convertView.findViewById(R.id.author);
        desc = (TextView) convertView.findViewById(R.id.desc);
        image = (ImageView) convertView.findViewById(R.id.bookImage);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(desc.getEllipsize()==null){
                    desc.setEllipsize(TextUtils.TruncateAt.END);
                    desc.setMaxLines(Integer.MAX_VALUE);
                }
                else{
                    desc.setEllipsize(null);
                    desc.setMaxLines(0);
                }
            }
        });

/*
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tx = (TextView) v;
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/search?tbm=bks&q="+book.getmTitle()));
                getContext().startActivity(in);
            }
        });

        desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tx = (TextView) v;
                if(tx.getEllipsize()==null){
                    tx.setEllipsize(TextUtils.TruncateAt.END);
                    tx.setMaxLines(3);
                }
                else {
                    tx.setEllipsize(null);
                    tx.setMaxLines(Integer.MAX_VALUE);
                }
            }
        });
*/
        title.setText(book.getmTitle());
        author.setText(book.getmAuthor());
        desc.setText(book.getmDesc());
        //desc.setEllipsize(TextUtils.TruncateAt.END);
        //desc.setMaxLines(3);
        desc.setEllipsize(null);
        desc.setMaxLines(0);

        Picasso.with(getContext()).load(book.getMimageUrl()).into(image);

        return convertView;
    }
}



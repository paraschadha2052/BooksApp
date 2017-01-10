package com.example.android.booksapp;

import android.app.LoaderManager;
import android.content.Context;
import android.content.Loader;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Book>>{

    private String QUERY_URL = "https://www.googleapis.com/books/v1/volumes";
    private String ACCESS_KEY="AIzaSyBCEthacW8d-SyhbykTp3EXAYDrZrORf2s";
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
        EditText topic = (EditText) findViewById(R.id.topic);
        topic.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId== EditorInfo.IME_ACTION_SEARCH){
                    send(v);
                    return true;
                }
                return false;
            }
        });
        getLoaderManager().initLoader(1, null, MainActivity.this);

    }

    public void send(View view){
        //Hide Keyboard
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);

        //For internet connection check
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        EditText topic = (EditText) findViewById(R.id.topic);
        TextView tx = (TextView) findViewById(R.id.error);
        String text = String.valueOf(topic.getText());
        tx.setText("");
        tx.setVisibility(View.VISIBLE);
        if (TextUtils.isEmpty(text)) {
            tx.setText("Please enter a valid topic");
        }
        else if (networkInfo != null && networkInfo.isConnected()) {
            adapter.clear();
            ProgressBar pb = (ProgressBar) findViewById(R.id.progress);
            pb.setVisibility(View.VISIBLE);
            getLoaderManager().restartLoader(1, null, MainActivity.this);
        }
        else{
            tx.setText("Internet not connected");
        }
    }

    @Override
    public Loader<List<Book>> onCreateLoader(int id, Bundle args) {
        EditText topic = (EditText) findViewById(R.id.topic);
        Uri base = Uri.parse(QUERY_URL);
        Uri.Builder uri = base.buildUpon();
        uri.appendQueryParameter("q", String.valueOf(topic.getText()));
        uri.appendQueryParameter("key", ACCESS_KEY);
        Log.v("paras", uri.build().toString());
        return new BookLoader(MainActivity.this, uri.build().toString());
    }

    @Override
    public void onLoadFinished(Loader<List<Book>> loader, List<Book> data) {
        ProgressBar pb = (ProgressBar) findViewById(R.id.progress);
        pb.setVisibility(View.GONE);

        adapter.clear();
        if(data!=null && !data.isEmpty()){
            adapter.addAll(data);
        }
        else{
            TextView tx = (TextView) findViewById(R.id.error);
            tx.setText("Some error occured. Try again after sometime");
        }

    }

    @Override
    public void onLoaderReset(Loader<List<Book>> loader) {
        adapter.clear();
    }
}

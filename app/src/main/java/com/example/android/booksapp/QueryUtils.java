package com.example.android.booksapp;

import android.text.TextUtils;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Created by paras on 1/10/17.
 */

public final class QueryUtils {

    public static ArrayList<Book> fetchBooks(String Url){
        ArrayList<Book> arr=null;
        String response=null;
        URL url = makeURL(Url);
        if(url!=null){
            response = makeHTTPConnection(url);
        }
        arr = extractBooks(response);
        return arr;
    }

    public static URL makeURL(String Url){
        URL url = null;
        try {
            url = new URL(Url);
        } catch (MalformedURLException e) {
            Log.e("Error:", "Problem building URL", e);
        }
        return url;
    }

    public static String makeHTTPConnection(URL url){
        Log.v("paras", "In httpConnection");
        String response="";
        HttpURLConnection connection=null;
        InputStream inputStream=null;
        try{
            connection = (HttpURLConnection) url.openConnection();
            connection.setReadTimeout(1000);
            connection.setConnectTimeout(1500);
            connection.setRequestMethod("GET");
            connection.connect();

            if(connection.getResponseCode()==200) {
                inputStream = connection.getInputStream();
                response = processResponse(inputStream);
            }
            else{
                Log.e("Error: ", "Response Code: "+connection.getResponseCode());
            }
        } catch (IOException e) {
            Log.e("Error: ", "Problem making a connection", e);
        }finally {
            if(connection!=null){
                connection.disconnect();
            }
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return response;
    }

    public static String processResponse(InputStream input){
        StringBuilder response = new StringBuilder();
        if(input!=null){
            InputStreamReader inputStreamReader = new InputStreamReader(input, Charset.forName("UTF-8"));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            try {
                String line = bufferedReader.readLine();
                while(line!=null){
                    response.append(line);
                    line = bufferedReader.readLine();
                }
            } catch (IOException e) {
                Log.e("Error: ", "Error reading line", e);
            }
        }
        return response.toString();
    }

    public static ArrayList<Book> extractBooks(String input){
        if(TextUtils.isEmpty(input)) return null;
        ArrayList<Book> ans = new ArrayList<>();
        try {
            JSONObject res = new JSONObject(input), item;
            JSONArray items = res.getJSONArray("items"), arr;
            StringBuilder author;
            String desc;

            for(int i=0;i<items.length();i++){
                Log.v("paras", "Processing item "+i);
                JSONObject item1 = items.getJSONObject(i).getJSONObject("volumeInfo");

                author = new StringBuilder();
                arr = item1.optJSONArray("authors");
                if(arr!=null && arr.length()>=1) {
                    author.append(arr.getString(0));
                    for (int j = 1; j < arr.length(); j++) {
                        author.append(", ");
                        author.append(arr.getString(j));
                    }
                }
                if(item1.optString("publishedDate", "").length()>=4) author.append(" - "+item1.optString("publishedDate", "").substring(0, 4));

                desc = item1.optString("description", "");
                ans.add(new Book(item1.getString("title"), author.toString(), desc, item1.getJSONObject("imageLinks").getString("thumbnail")));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return ans;
    }
}

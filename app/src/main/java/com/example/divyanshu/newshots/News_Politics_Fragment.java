package com.example.divyanshu.newshots;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class News_Politics_Fragment extends android.support.v4.app.Fragment {

    WebView webViewpolitics;
//I have used national news in this section however for naming used politics to avoid code errors!
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view =  inflater.inflate(R.layout.fragment_news__politics_, container, false);
        webViewpolitics = (WebView)view.findViewById(R.id.webViewpolitics);
        webViewpolitics.loadUrl("http://m.thehindu.com/news/national/");
        return view;
    }
}

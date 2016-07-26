package com.example.divyanshu.newshots;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class News_Sports_Fragment extends android.support.v4.app.Fragment {

    WebView webViewsports;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view =  inflater.inflate(R.layout.fragment_news__sports_, container, false);
        webViewsports = (WebView)view.findViewById(R.id.webViewsports);
        webViewsports.loadUrl("http://m.thehindu.com/sport/");
        return view;

    }
}
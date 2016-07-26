package com.example.divyanshu.newshots;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class News_general_Fragment extends android.support.v4.app.Fragment {

    WebView webViewgeneral;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

    View view =  inflater.inflate(R.layout.fragment_news_general_, container, false);
        webViewgeneral = (WebView)view.findViewById(R.id.webViewgeneral);
        webViewgeneral.loadUrl("http://m.thehindu.com/news/");
     return view;
    }

}

package com.example.divyanshu.newshots;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class Menu2_Fragment extends android.support.v4.app.Fragment {

    WebView webViewhoroscope;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.fragment_menu2_);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view =  inflater.inflate(R.layout.fragment_menu2_, container, false);
        webViewhoroscope = (WebView)view.findViewById(R.id.webViewhoroscope);
        webViewhoroscope.loadUrl("http://horoscope.mobi/");
        return view;
    }
}
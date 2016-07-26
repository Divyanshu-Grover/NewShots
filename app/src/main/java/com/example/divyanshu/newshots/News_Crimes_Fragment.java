package com.example.divyanshu.newshots;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class News_Crimes_Fragment extends android.support.v4.app.Fragment {

    WebView webViewcrime;
    //I have used bussiness news in this section however for naming used crime to avoid code errors!

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view =  inflater.inflate(R.layout.fragment_news__crimes_, container, false);
        webViewcrime = (WebView)view.findViewById(R.id.webViewcrime);
        webViewcrime.loadUrl("http://m.thehindu.com/business/");
        return view;

    }

}

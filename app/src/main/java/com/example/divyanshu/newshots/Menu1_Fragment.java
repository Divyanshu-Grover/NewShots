package com.example.divyanshu.newshots;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Menu1_Fragment extends Fragment{

    List<Fragment> NewsList;
    MyPagerAdapter myPagerAdapter;
    FragmentManager fragmentManager;
    ViewPager viewPager;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_menu1_);
    }

   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_menu1_, container, false);

       viewPager = (ViewPager)view.findViewById(R.id.Mypager);

       NewsList = new ArrayList<Fragment>();

       NewsList.add(new News_general_Fragment());
       NewsList.add(new News_Politics_Fragment());
       NewsList.add(new News_Sports_Fragment());
       NewsList.add(new New_Entertainment_Fragment());
       NewsList.add(new News_Crimes_Fragment());
       NewsList.add(new News_International_Fragment());

       fragmentManager = getFragmentManager();
       myPagerAdapter = new MyPagerAdapter(fragmentManager, NewsList);
       viewPager.setAdapter(myPagerAdapter);
       return view;
    }
}
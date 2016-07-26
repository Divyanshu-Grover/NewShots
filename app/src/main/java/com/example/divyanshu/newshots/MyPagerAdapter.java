package com.example.divyanshu.newshots;

        import android.app.Fragment;
        import android.app.FragmentManager;
        import android.support.v4.app.FragmentPagerAdapter;

        import java.util.List;

public class MyPagerAdapter extends FragmentPagerAdapter{

    List<android.support.v4.app.Fragment> NewsList;

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){

            case 0:
                return "NEWS";

            case 1:
                return "NATIONAL";

            case 2:
                return "SPORTS";

            case 3:
                return "ENTERTAINMENT";

            case 4:
                return "BUSSINESS";

            case 5:
                return "INTERNATIONAL";
            default:
            break;

        }
    return super.getPageTitle(position);
    }

    public MyPagerAdapter(android.support.v4.app.FragmentManager fm, List<android.support.v4.app.Fragment> NewsList) {
        super(fm);
        this.NewsList = NewsList;
    }

    public android.support.v4.app.Fragment getItem(int position){

        return NewsList.get(position);
    }

    public int getCount(){
        return NewsList.size();
    }
}
package me.abdullah.practiceone.ViewPager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import me.abdullah.practiceone.R;

public class ViewPagerActivity extends FragmentActivity {

    ViewPager viewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager = (ViewPager) findViewById(R.id.pager);

        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));

    }
}

class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment=null;
        if (position==0) {
            fragment = new FragmentA();
        } else if (position==1) {
            fragment = new FragmentB();
        } else if (position==2) {
            fragment = new FragmentC();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position==0) {
            return "Tab One";
        }
        if (position==1) {
            return "Tab Two";
        }
        if (position==2) {

            return "Tab Three";
        }
        return null;
    }
}
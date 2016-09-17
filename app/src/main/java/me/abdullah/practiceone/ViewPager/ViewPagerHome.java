package me.abdullah.practiceone.ViewPager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import me.abdullah.practiceone.R;

public class ViewPagerHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_home);
    }

    public void viewPagerActivityIntent(View view) {
        Intent intent = new Intent(this,ViewPagerActivity.class);
        startActivity(intent);
    }

    public void tabActivityIntent(View view) {
        Intent intent = new Intent(this,TabActivity.class);
        startActivity(intent);
    }

}
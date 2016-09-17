package me.abdullah.practiceone.FixedTab;



import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Fragment;

import me.abdullah.practiceone.R;


public class FixedTabFragmentActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }

    public void changeFragment(View view) {
        Fragment fragment;
        if (view==findViewById(R.id.fragmentOneBT)) {

            fragment = new FragmentOne();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentPlace,fragment);
            fragmentTransaction.commit();


        } if (view==findViewById(R.id.fragmentTwoBT)) {
            fragment = new FragmentTwo();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentPlace,fragment);
            fragmentTransaction.commit();
        }
    }



}

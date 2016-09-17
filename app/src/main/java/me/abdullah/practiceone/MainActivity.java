package me.abdullah.practiceone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import me.abdullah.practiceone.FixedTab.FixedTabFragmentActivity;
import me.abdullah.practiceone.ViewPager.ViewPagerHome;

public class MainActivity extends AppCompatActivity {

    TextView quantityTextView, priceTextView;
    int coffeeCount;
    final int coffeeAmount = 50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantityTextView = (TextView) findViewById(R.id.showQuantity);
        priceTextView = (TextView) findViewById(R.id.showPrice);
    }

    public void submitOrder(View view) {
        displayPrice(coffeeCount*coffeeAmount);
    }

    private void display(int number) {
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {

        priceTextView.setText("$"+number);

    }

    public void plusCoffee(View view) {
        coffeeCount++;
        display(coffeeCount);
    }

    public void minusCoffee(View view) {
        if (coffeeCount>0) {
            coffeeCount--;
            display(coffeeCount);
        } else {
            display(coffeeCount);
        }
    }



    public void fixedTabExample(View view) {
        Intent intent = new Intent(this,FixedTabFragmentActivity.class);
        startActivity(intent);
    }

    public void viewPagerExample(View view) {
        Intent intent = new Intent(this,ViewPagerHome.class);
        startActivity(intent);
    }
}

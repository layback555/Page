package com.example.asus.page;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewpager=(ViewPager)findViewById(R.id.viewpager);
        MyPageAdapter pageAdapter=new MyPageAdapter(getSupportFragmentManager());
        viewpager.setAdapter(pageAdapter);
        TabLayout tablayout=(TabLayout)findViewById(R.id.sliding_tabs);
        tablayout.setupWithViewPager(viewpager);
    }
}

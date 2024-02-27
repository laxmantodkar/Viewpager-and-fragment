package com.example.viewpager.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.viewpager.R;
import com.example.viewpager.viewpager.Adaptor;

public class MainActivity extends AppCompatActivity {


    ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2=findViewById(R.id.viewPager);

        Adaptor adaptor=new Adaptor(getSupportFragmentManager(),getLifecycle());

        viewPager2.setAdapter(adaptor);


    }
}
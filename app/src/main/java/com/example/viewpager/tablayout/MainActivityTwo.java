package com.example.viewpager.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.viewpager.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivityTwo extends AppCompatActivity {


    private TabLayout tablayoutTwo;
    private FrameLayout framlayoutTwo;


    private ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_two);

        tablayoutTwo=findViewById(R.id.tablayoutTwo);

       // framlayoutTwo=findViewById(R.id.framlayoutTwo);

        // set the item in TabLayout


        //First Tab
        TabLayout.Tab firstTab=tablayoutTwo.newTab();
        firstTab.setText("Chat");
        //firstTab.setIcon();
        tablayoutTwo.addTab(firstTab);

        //First Tab
        TabLayout.Tab secondTab=tablayoutTwo.newTab();
        secondTab.setText("Status");
        //firstTab.setIcon();
        tablayoutTwo.addTab(secondTab);


        //First Tab
        TabLayout.Tab thirdTab=tablayoutTwo.newTab();
        thirdTab.setText("Call");
        //firstTab.setIcon();
        tablayoutTwo.addTab(thirdTab);

//
//        Fragment fragment=new ChatFragment();
//        FragmentManager fragmentManager=getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.framlayoutTwo,fragment);
//        fragmentTransaction.commit();



//     tablayoutTwo.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//
//
//         @Override
//         public void onTabSelected(TabLayout.Tab tab) {
//
//             Fragment fragment=null;
//
//
//             switch (tab.getPosition()){
//                 case 0:
//                     fragment=new ChatFragment();
//                     break;
//
//                 case 1:
//                     fragment=new StatusFragment();
//                     break;
//
//                 case 2:
//                     fragment=new CallFragment();
//                     break;
//             }
//
//             FragmentManager fragmentManager=getSupportFragmentManager();
//             FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
//             fragmentTransaction.replace(R.id.framlayoutTwo,fragment);
//             fragmentTransaction.commit();
//
//         }
//
//         @Override
//         public void onTabUnselected(TabLayout.Tab tab) {
//
//         }
//
//         @Override
//         public void onTabReselected(TabLayout.Tab tab) {
//
//         }
//     });

               viewPager2=findViewById(R.id.viewPager);
               AdaptorTabLayout adaptorTabLayout=new AdaptorTabLayout(getSupportFragmentManager(),getLifecycle());
               viewPager2.setAdapter(adaptorTabLayout);


               viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
                   @Override
                   public void onPageSelected(int position) {
                       super.onPageSelected(position);
                       tablayoutTwo.selectTab(tablayoutTwo.getTabAt(position));
                   }
               });







    }
}
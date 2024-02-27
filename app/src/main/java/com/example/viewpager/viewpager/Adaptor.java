package com.example.viewpager.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Adaptor extends FragmentStateAdapter {


    public Adaptor(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        if(position==0){
            FragmentOne one=new FragmentOne();
            return one;

        }else if(position==1){
            FragmentTwo two=new FragmentTwo();
            return two;
        }else if(position==2){
            FragmentThree three=new FragmentThree();
            return three;
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

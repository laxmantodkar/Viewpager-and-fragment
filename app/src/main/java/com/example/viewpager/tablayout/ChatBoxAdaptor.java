package com.example.viewpager.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ChatBoxAdaptor extends FragmentStateAdapter
{
    public ChatBoxAdaptor(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){

            case 0:
                return  new ChatBoxFragment();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}

package com.example.task_3;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.task_3.Tab1Fragment;
import com.example.task_3.Tab2Fragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 1) {
            return new Tab2Fragment();
        }
        return new Tab1Fragment();
    }

    @Override
    public int getItemCount() {
        return 2; // Number of tabs
    }
}
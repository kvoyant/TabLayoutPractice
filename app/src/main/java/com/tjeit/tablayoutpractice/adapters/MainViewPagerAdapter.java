package com.tjeit.tablayoutpractice.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.tjeit.tablayoutpractice.fragments.ChatListFragment;
import com.tjeit.tablayoutpractice.fragments.HomeFragment;
import com.tjeit.tablayoutpractice.fragments.SearchFragment;

public class MainViewPagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public MainViewPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        mNumOfTabs = numOfTabs;

    }

    @Override
    public Fragment getItem(int position) {

        Fragment fr = null;

        if (position == 0) {
            fr = new HomeFragment();
        } else if (position == 1) {
            fr = new ChatListFragment();
        } else if (position == 2) {
            fr = new SearchFragment();
        }

        return fr;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}

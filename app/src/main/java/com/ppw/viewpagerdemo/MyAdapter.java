package com.ppw.viewpagerdemo;

import java.util.List;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * <pre>
 *     Created by ppW
 *     e-mail : wangpanpan05@163.com
 *     time   : 2019/03/27
 *     desc   : 适配器
 *     version: 1.0   初始化
 *     params:
 *  <pre>
 */
public class MyAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> mFragments;
    private List<CharSequence> mTitles;

    public MyAdapter (FragmentManager fm, List<Fragment> fragments, List<CharSequence> titles) {
        super(fm);
        mFragments = fragments;
        mTitles = titles;
    }


    public MyAdapter (FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        mFragments = fragments;
    }

    public MyAdapter (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem (int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount () {
        return mFragments == null ? 0 : mFragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle (int position) {
        return mTitles.get(position);
    }
}

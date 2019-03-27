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
public class MyAdapter2 extends FragmentStatePagerAdapter {
    private List<Integer> mIndex;
    private List<CharSequence> mTitles;

    public MyAdapter2 (FragmentManager fm, List<Integer> fragments, List<CharSequence> titles) {
        super(fm);
        mIndex = fragments;
        mTitles = titles;
    }


    public MyAdapter2 (FragmentManager fm, List<Integer> fragments) {
        super(fm);
        mIndex = fragments;
    }

    public MyAdapter2 (FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem (int position) {
        return TestFragment.newInstance(position);
    }

    @Override
    public int getCount () {
        return mIndex == null ? 0 : mIndex.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle (int position) {
        return mTitles.get(position);
    }
}

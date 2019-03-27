package com.ppw.viewpagerdemo;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

/**
 * <pre>
 *     Created by ppW
 *     e-mail : wangpanpan05@163.com
 *     time   : 2019/3/27 9:38
 *     desc   :
 *     version: 1.0     初始化
 *     params:  key:        value:
 *  <pre>
 */
public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private MyAdapter2 mAdapter;
//    private MyAdapter mAdapter;
    private List<CharSequence> mTitles;
    private List<Fragment> mFragments;
    private List<Integer> mIndex;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = findViewById(R.id.tb);
        mViewPager = findViewById(R.id.vp);
//        mFragments = new ArrayList<>();
        mTitles = new ArrayList<>();
        mIndex = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            mTitles.add("title" + (i + 1));
            mIndex.add(i + 1);
//            mFragments.add(TestFragment.newInstance(i));
        }
        mAdapter = new MyAdapter2(getSupportFragmentManager(), mIndex, mTitles);
        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.setOffscreenPageLimit(1);
    }
}

package com.hly.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import fragment.DandelionFragment;
import fragment.GuitarFragment;
import fragment.MappleleafFragment;
import fragment.OceanFragment;
import fragment.ThiredFrgment;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/9/14~~~~~~
 * ~~~~~~更改时间:2018/9/14~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class ThiredActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> fragmentList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thired_activity_layout);

        tabLayout = findViewById(R.id.thired_tablayout);
        viewPager = findViewById(R.id.thired_viewpager);

        for (int i = 0; i < 4; i++) {
            ThiredFrgment fragment = new ThiredFrgment();
            Bundle bundle = new Bundle();
            bundle.putInt("tab",i);
            fragment.setArguments(bundle);
            fragmentList.add(fragment);
        }

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), fragmentList));


        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.setupWithViewPager(viewPager);//关联viewpager
        tabLayout.getTabAt(0).setText("大海");
        tabLayout.getTabAt(1).setText("枫叶");
        tabLayout.getTabAt(2).setText("蒲公英");
        tabLayout.getTabAt(3).setText("吉他");

    }
}

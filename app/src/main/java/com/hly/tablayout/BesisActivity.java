package com.hly.tablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import fragment.DandelionFragment;
import fragment.GuitarFragment;
import fragment.MappleleafFragment;
import fragment.OceanFragment;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/9/14~~~~~~
 * ~~~~~~更改时间:2018/9/14~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class BesisActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> fragmentList = new ArrayList<>();

    int imageViewRes[] = {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.besis_activity_layout);
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        GuitarFragment guitarFragment = new GuitarFragment();
        MappleleafFragment mappleleafFragment = new MappleleafFragment();
        OceanFragment oceanFragment = new OceanFragment();
        DandelionFragment dandelionFragment = new DandelionFragment();
        fragmentList.add(guitarFragment);
        fragmentList.add(mappleleafFragment);
        fragmentList.add(oceanFragment);
        fragmentList.add(dandelionFragment);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), fragmentList));
        /**
         * 这里要注意顺序想addfragment 然后在addTab ,不让会不显示标题的
         */
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.setupWithViewPager(viewPager);//关联viewpager
        tabLayout.getTabAt(0).setText("吉他");
        tabLayout.getTabAt(1).setText("枫叶");
        tabLayout.getTabAt(2).setText("大海");
        tabLayout.getTabAt(3).setText("蒲公英");

        /**
         * 注释处修改tab以及获取tab的点击事件
         */

//        for (int i = 0; i < tabLayout.getTabCount(); i++) {
//            TabLayout.Tab tab=tabLayout.getTabAt(i);
//            if (tab!=null){
//                tab.setCustomView(getTabView(i)); //对应tab定制view
//                if (tab.getCustomView()!=null){
//                    View tabView=  (View)tab.getCustomView().getParent();//获得tab对应父item
//                    tabView.setTag(i);
//                    tabView.setOnClickListener(mTabOnClickListener);//设置点击事件
//                }
//            }
//        }

    }

//    public View getTabView(int position) {
//        View v = LayoutInflater.from(BesisActivity.this).inflate(R.layout.go, null); //获得view
//        ImageView img = v.findViewById(R.id.icon_item);
//        img.setImageResource(imageViewRes[position]);
//        return v;
//    }

//    private View.OnClickListener mTabOnClickListener = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            int position= (int) v.getTag();
//            if (position==0 &&tabLayout.getTabAt(position).isSelected()==true){
//                Toast.makeText(BesisActivity.this, "点击了第一个tab", Toast.LENGTH_SHORT).show();
//            }else if (position==1 && tabLayout.getTabAt(position).isSelected()==true){
//                Toast.makeText(BesisActivity.this, "点击了第二个tab", Toast.LENGTH_SHORT).show();
//            }else {
//                TabLayout.Tab tab = tabLayout.getTabAt(position);
//                if (tab != null) {
//                    tab.select();
//                }
//            }
//        }
//    };

}

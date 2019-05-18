package com.tjeit.tablayoutpractice;

import android.databinding.DataBindingUtil;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.tjeit.tablayoutpractice.adapters.MainViewPagerAdapter;
import com.tjeit.tablayoutpractice.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding act;
    MainViewPagerAdapter mvpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        //뷰페이저 이동시 처리
        act.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(act.tabLayout));

        //상단 TabLayout 버튼 클릭시 처리
        act.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                act.viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void setValues() {
        act.tabLayout.addTab(act.tabLayout.newTab().setText("홈").setIcon(R.mipmap.ic_launcher));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("채팅목록"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("검색"));
//        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
        //tabMode : fixed => scrollable
//        act.tabLayout.addTab(act.tabLayout.newTab().setCustomView(createCustomTabView("커스텀")));
//        act.tabLayout.addTab(act.tabLayout.newTab().setCustomView(createCustomTabView("커스텀2")));

        mvpa = new MainViewPagerAdapter(getSupportFragmentManager(), act.tabLayout.getTabCount());
        act.viewPager.setAdapter(mvpa);
    }

    View createCustomTabView(String tabName){
        View tabView = LayoutInflater.from(mContext).inflate(R.layout.custom_tab, null);

        TextView nameTxt = tabView.findViewById(R.id.nameTxt);
        nameTxt.setText(tabName);

        return tabView;
    }

    @Override
    public void bindViews() {
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}

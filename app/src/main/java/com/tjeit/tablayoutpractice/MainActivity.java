package com.tjeit.tablayoutpractice;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tjeit.tablayoutpractice.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        act.tabLayout.addTab(act.tabLayout.newTab().setText("홈").setIcon(R.mipmap.ic_launcher));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("채팅목록"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("검색"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
        //tabMode : fixed => scrollable
//        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
//        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
//        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
//        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
//        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
//        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}

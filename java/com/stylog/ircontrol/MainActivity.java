package com.stylog.ircontrol;

import android.content.Context;
import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

    static ConsumerIrManager consumerIrManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        consumerIrManager = (android.hardware.ConsumerIrManager) getSystemService(Context.CONSUMER_IR_SERVICE);

        PagerAdapter pagerAdapter = new CustomPagerAdapter(getSupportFragmentManager());

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(pagerAdapter);
    }

    private class CustomPagerAdapter extends FragmentStatePagerAdapter {
        CustomPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new LED();
            } else {
                return new TestFragment();
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }

}

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

    static ConsumerIrManager mConsumerIrManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConsumerIrManager = (android.hardware.ConsumerIrManager) getSystemService(Context.CONSUMER_IR_SERVICE);

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(getSupportFragmentManager()));
    }

    private class CustomPagerAdapter extends FragmentStatePagerAdapter {
        CustomPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new LEDFragment();
            } else if (position == 1) {
                return new PioneerCM35KFragment();
            } else if (position == 2) {
                return new PanasonicSCPM254Fragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

}

package com.stylog.ircontrol;

import android.content.Context;
import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

import com.stylog.ircontrol.fragments.LEDFragment;
import com.stylog.ircontrol.fragments.PanasonicSCPM254Fragment;
import com.stylog.ircontrol.fragments.PioneerCM35KFragment;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private static ConsumerIrManager mConsumerIrManager;

    private String mNextTitleText;
    private boolean mVisible = true;
    private TextView mTitle;
    private AlphaAnimation mAlphaAnimation;

    private LEDFragment mLedFragment;
    private PioneerCM35KFragment mPioneerCM35KFragment;
    private PanasonicSCPM254Fragment mPanasonicSCPM254Fragment;

    private void animate() {
        mTitle.startAnimation(mAlphaAnimation);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer);

        mConsumerIrManager = (android.hardware.ConsumerIrManager) getSystemService(Context.CONSUMER_IR_SERVICE);
        mLedFragment = new LEDFragment();
        mPioneerCM35KFragment = new PioneerCM35KFragment();
        mPanasonicSCPM254Fragment = new PanasonicSCPM254Fragment();

        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTitle = (TextView) toolbar.getChildAt(0); // Title TV

        mAlphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        mAlphaAnimation.setDuration(250);
        mAlphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (mVisible) {
                    mAlphaAnimation.setRepeatMode(Animation.REVERSE);
                } else {
                    mAlphaAnimation.setRepeatMode(Animation.RESTART);
                }
                mTitle.setText(mNextTitleText);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        final ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                if (position == 0) {
                    return mLedFragment;
                } else if (position == 1) {
                    return mPioneerCM35KFragment;
                } else if (position == 2) {
                    return mPanasonicSCPM254Fragment;
                }
                return null;
            }

            @Override
            public int getCount() {
                return 3;
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                if (position == 0) {
                    return getString(R.string.led_strip);
                } else if (position == 1) {
                    return getString(R.string.pioneer_cm35k);
                } else if (position == 2) {
                    return getString(R.string.panasonic_scpm254);
                } else return getString(R.string.app_name);
            }
        });

        viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        mNavigationView.setCheckedItem(R.id.nav_led_strip);
                        mNextTitleText = getString(R.string.led_strip);
                        animate();
                        break;

                    case 1:
                        mNavigationView.setCheckedItem(R.id.nav_pioneer_cm35k);
                        mNextTitleText = getString(R.string.pioneer_cm35k);
                        animate();
                        break;

                    case 2:
                        mNavigationView.setCheckedItem(R.id.nav_panasonic_scpm254);
                        mNextTitleText = getString(R.string.panasonic_scpm254);
                        animate();
                        break;
                }
            }
        });


        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        mDrawerLayout = findViewById(R.id.drawer_layout);

        mNavigationView = findViewById(R.id.nav_view);
        mNavigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);
                        mDrawerLayout.closeDrawers();

                        switch (menuItem.getItemId()) {
                            case R.id.nav_led_strip:
                                viewPager.setCurrentItem(0);
                                break;

                            case R.id.nav_pioneer_cm35k:
                                viewPager.setCurrentItem(1);
                                break;

                            case R.id.nav_panasonic_scpm254:
                                viewPager.setCurrentItem(2);
                                break;
                        }
                        return true;
                    }
                });
        mNavigationView.setCheckedItem(R.id.nav_led_strip);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static ConsumerIrManager getmConsumerIrManager() {
        return mConsumerIrManager;
    }
}

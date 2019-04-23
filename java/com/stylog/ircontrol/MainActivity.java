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

import com.stylog.ircontrol.fragments.LEDFragment;
import com.stylog.ircontrol.fragments.PanasonicSCPM254Fragment;
import com.stylog.ircontrol.fragments.PioneerCM35KFragment;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private static ConsumerIrManager mConsumerIrManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer);

        mConsumerIrManager = (android.hardware.ConsumerIrManager) getSystemService(Context.CONSUMER_IR_SERVICE);

        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
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
                        navigationView.setCheckedItem(R.id.nav_led_strip);
                        toolbar.setTitle(R.string.led_strip);
                        break;

                    case 1:
                        navigationView.setCheckedItem(R.id.nav_pioneer_cm35k);
                        toolbar.setTitle(R.string.pioneer_cm35k);
                        break;

                    case 2:
                        navigationView.setCheckedItem(R.id.nav_panasonic_scpm254);
                        toolbar.setTitle(R.string.panasonic_scpm254);
                        break;
                }
            }
        });


        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        drawerLayout = findViewById(R.id.drawer_layout);

        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);
                        drawerLayout.closeDrawers();

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
        navigationView.setCheckedItem(R.id.nav_led_strip);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static ConsumerIrManager getmConsumerIrManager() {
        return mConsumerIrManager;
    }
}

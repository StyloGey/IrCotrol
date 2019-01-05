package com.stylog.ircontrol;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import static com.stylog.ircontrol.MainActivity.consumerIrManager;

public class LED extends Fragment {

    final static class CustomContent {

        int id;
        int[] pattern;

        CustomContent(int id, int[] pattern) {
            this.id = id;
            this.pattern = pattern;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_led, container, false);

        List<CustomContent> list = new ArrayList<CustomContent>() {{
            add(new CustomContent(R.id.button_on, PatternStrip.ON));
            add(new CustomContent(R.id.button_off, PatternStrip.OFF));
            add(new CustomContent(R.id.button_up, PatternStrip.BRIGHTNESS_UP));
            add(new CustomContent(R.id.button_down, PatternStrip.BRIGHTNESS_DOWN));

            add(new CustomContent(R.id.button_flash, PatternStrip.FLASH));
            add(new CustomContent(R.id.button_strobe, PatternStrip.STROBE));
            add(new CustomContent(R.id.button_fade, PatternStrip.FADE));
            add(new CustomContent(R.id.button_smooth, PatternStrip.SMOOTH));

            add(new CustomContent(R.id.button_white, PatternStrip.WHITE));

            add(new CustomContent(R.id.button_red_1, PatternStrip.RED_1));
            add(new CustomContent(R.id.button_red_2, PatternStrip.RED_2));
            add(new CustomContent(R.id.button_orange_1, PatternStrip.ORANGE_1));
            add(new CustomContent(R.id.button_orange_2, PatternStrip.ORANGE_2));
            add(new CustomContent(R.id.button_yellow, PatternStrip.YELLOW));

            add(new CustomContent(R.id.button_green_1, PatternStrip.GREEN_1));
            add(new CustomContent(R.id.button_green_2, PatternStrip.GREEN_2));
            add(new CustomContent(R.id.button_light_blue, PatternStrip.LIGHT_BLUE));
            add(new CustomContent(R.id.button_turquoise, PatternStrip.TURQUOISE));
            add(new CustomContent(R.id.button_cyan, PatternStrip.CYAN));

            add(new CustomContent(R.id.button_dark_blue, PatternStrip.DARK_BLUE));
            add(new CustomContent(R.id.button_blue, PatternStrip.BLUE));
            add(new CustomContent(R.id.button_violet_1, PatternStrip.VIOLET_1));
            add(new CustomContent(R.id.button_violet_2, PatternStrip.VIOLET_2));
            add(new CustomContent(R.id.button_unicorn, PatternStrip.UNICORN));
        }};

        for (final CustomContent customContent : list) {
            View button = view.findViewById(customContent.id);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    consumerIrManager.transmit(36000, customContent.pattern);
                }
            });
        }
        return view;
    }
}

package com.stylog.ircontrol;

import android.content.Context;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import static com.stylog.ircontrol.MainActivity.mConsumerIrManager;

public class PanasonicSCPM254Fragment extends Fragment {

    private Vibrator mVibrator;

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

        mVibrator = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);

        View view = inflater.inflate(R.layout.layout_panasonic_scpm254, container, false);

        List<CustomContent> list = new ArrayList<CustomContent>() {{
            add(new CustomContent(R.id.button_scpm254_on_off, PatternPanasonicSCPM254.ON_OFF));
            add(new CustomContent(R.id.button_scpm254_cd_eject, PatternPanasonicSCPM254.CD_EJECT));
            add(new CustomContent(R.id.button_scpm254_input_bt, PatternPanasonicSCPM254.BT_AUDIO));
            add(new CustomContent(R.id.button_scpm254_input_usb, PatternPanasonicSCPM254.USB_CD));
            add(new CustomContent(R.id.button_scpm254_input_tuner, PatternPanasonicSCPM254.RADIO));
            add(new CustomContent(R.id.button_scpm254_setup, PatternPanasonicSCPM254.SETUP));
            add(new CustomContent(R.id.button_mute, PatternPanasonicSCPM254.MUTE));
            add(new CustomContent(R.id.button_vol_up, PatternPanasonicSCPM254.VOLUME_UP));
            add(new CustomContent(R.id.button_scpm254_ok, PatternPanasonicSCPM254.ALBUM_OK));
            add(new CustomContent(R.id.button_dimmer, PatternPanasonicSCPM254.DIMMER));
            add(new CustomContent(R.id.button_scpm254_album_up, PatternPanasonicSCPM254.ALBUM_UP));
            add(new CustomContent(R.id.button_scpm254_album_down, PatternPanasonicSCPM254.ALBUM_DOWN));
            add(new CustomContent(R.id.button_vol_down, PatternPanasonicSCPM254.VOLUME_DOWN));
            add(new CustomContent(R.id.button_previous, PatternPanasonicSCPM254.PREVIOUS));
            add(new CustomContent(R.id.button_stop, PatternPanasonicSCPM254.STOP));
            add(new CustomContent(R.id.button_play_pause, PatternPanasonicSCPM254.PLAY_PAUSE));
            add(new CustomContent(R.id.button_next, PatternPanasonicSCPM254.NEXT));
        }};

        for (final CustomContent customContent : list) {
            View button = view.findViewById(customContent.id);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mVibrator.hasVibrator()) {
                        mVibrator.vibrate(VibrationEffect.createOneShot(15, VibrationEffect.DEFAULT_AMPLITUDE));
                    }
                    mConsumerIrManager.transmit(36000, customContent.pattern);
                }
            });
        }
        return view;
    }
}

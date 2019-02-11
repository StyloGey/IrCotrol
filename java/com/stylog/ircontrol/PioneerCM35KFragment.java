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

public class PioneerCM35KFragment extends Fragment {

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

        View view = inflater.inflate(R.layout.layout_pioneer_cm35k, container, false);

        List<CustomContent> list = new ArrayList<CustomContent>() {{
            add(new CustomContent(R.id.button_cm35k_on_off, PatternPioneerCM35K.ON_OFF));
            add(new CustomContent(R.id.button_cm35k_cd_eject, PatternPioneerCM35K.CD_EJECT));

            add(new CustomContent(R.id.button_cm35k_input_cd, PatternPioneerCM35K.CD));
            add(new CustomContent(R.id.button_cm35k_input_usb, PatternPioneerCM35K.USB));
            add(new CustomContent(R.id.button_cm35k_input_tuner, PatternPioneerCM35K.TUNER));
            add(new CustomContent(R.id.button_cm35k_input_audio_in, PatternPioneerCM35K.AUDIO_IN));
            add(new CustomContent(R.id.button_cm35k_input_bt, PatternPioneerCM35K.BT_AUDIO));
            add(new CustomContent(R.id.button_cm35k_input_clock_timer, PatternPioneerCM35K.CLOCK_TIMER));
            add(new CustomContent(R.id.button_cm35k_input_sleep, PatternPioneerCM35K.SLEEP));

            add(new CustomContent(R.id.button_0, PatternPioneerCM35K.NUMBER_0));
            add(new CustomContent(R.id.button_1, PatternPioneerCM35K.NUMBER_1));
            add(new CustomContent(R.id.button_1, PatternPioneerCM35K.NUMBER_2));
            add(new CustomContent(R.id.button_3, PatternPioneerCM35K.NUMBER_3));
            add(new CustomContent(R.id.button_4, PatternPioneerCM35K.NUMBER_4));
            add(new CustomContent(R.id.button_5, PatternPioneerCM35K.NUMBER_5));
            add(new CustomContent(R.id.button_6, PatternPioneerCM35K.NUMBER_6));
            add(new CustomContent(R.id.button_7, PatternPioneerCM35K.NUMBER_7));
            add(new CustomContent(R.id.button_8, PatternPioneerCM35K.NUMBER_8));
            add(new CustomContent(R.id.button_9, PatternPioneerCM35K.NUMBER_9));

            add(new CustomContent(R.id.button_equalizer, PatternPioneerCM35K.EQUALIZER));
            add(new CustomContent(R.id.button_p_bass, PatternPioneerCM35K.P_BASS));
            add(new CustomContent(R.id.button_bass_treble, PatternPioneerCM35K.BASS_TREBLE));
            add(new CustomContent(R.id.button_clear, PatternPioneerCM35K.CLEAR));
            add(new CustomContent(R.id.button_repeat, PatternPioneerCM35K.REPEAT));
            add(new CustomContent(R.id.button_random, PatternPioneerCM35K.RANDOM));

            add(new CustomContent(R.id.button_tune_up, PatternPioneerCM35K.TUNE_UP));
            add(new CustomContent(R.id.button_tune_down, PatternPioneerCM35K.TUNE_DOWN));
            add(new CustomContent(R.id.button_arrow_left, PatternPioneerCM35K.LEFT));
            add(new CustomContent(R.id.button_arrow_right, PatternPioneerCM35K.RIGHT));
            add(new CustomContent(R.id.button_enter, PatternPioneerCM35K.ENTER));

            add(new CustomContent(R.id.button_display, PatternPioneerCM35K.DISPLAY));
            add(new CustomContent(R.id.button_folder, PatternPioneerCM35K.FOLDER));
            add(new CustomContent(R.id.button_menu, PatternPioneerCM35K.MENU));
            add(new CustomContent(R.id.button_memory_program, PatternPioneerCM35K.MEMORY_PROGRAM));

            add(new CustomContent(R.id.button_cm35k_up, PatternPioneerCM35K.PRESET_NEXT));
            add(new CustomContent(R.id.button_preset_down, PatternPioneerCM35K.PRESET_PREVIOUS));

            add(new CustomContent(R.id.button_mute, PatternPioneerCM35K.MUTE));
            add(new CustomContent(R.id.button_dimmer, PatternPioneerCM35K.DIMMER));

            add(new CustomContent(R.id.button_vol_up, PatternPioneerCM35K.VOLUME_UP));
            add(new CustomContent(R.id.button_vol_down, PatternPioneerCM35K.VOLUME_DOWN));

            add(new CustomContent(R.id.button_previous, PatternPioneerCM35K.PREVIOUS));
            add(new CustomContent(R.id.button_next, PatternPioneerCM35K.SKIP));
            add(new CustomContent(R.id.button_stop, PatternPioneerCM35K.STOP));
            add(new CustomContent(R.id.button_play_pause, PatternPioneerCM35K.PLAY_PAUSE));

            add(new CustomContent(R.id.button_cm35k_stereo_mono, PatternPioneerCM35K.ST_MONO));
            add(new CustomContent(R.id.button_cm35k_rds_aspm, PatternPioneerCM35K.ASPM));
            add(new CustomContent(R.id.button_cm35k_rds_pty, PatternPioneerCM35K.PTY));
            add(new CustomContent(R.id.button_cm35k_rds_display, PatternPioneerCM35K.RDS_DISPLAY));
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

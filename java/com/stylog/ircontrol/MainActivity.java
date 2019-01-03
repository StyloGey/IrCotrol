package com.stylog.ircontrol;

import android.content.Context;
import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ConsumerIrManager consumerIrManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        consumerIrManager = (android.hardware.ConsumerIrManager) getSystemService(Context.CONSUMER_IR_SERVICE);
    }

    // On-Off
    public void irOn(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_ON);
    }

    public void irOff(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_OFF);
    }

    // Brightness
    public void irUp(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_BRIGHTNESS_UP);
    }

    public void irDown(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_BRIGHTNESS_DOWN);
    }

    // Modes
    public void irFlash(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_FLASH);
    }

    public void irStrobe(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_STROBE);
    }

    public void irFade(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_FADE);
    }

    public void irSmooth(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_SMOOTH);
    }

    // White
    public void irWhite(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_WHITE);
    }

    // Red
    public void irRed1(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_RED_1);
    }

    public void irRed2(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_RED_2);
    }

    public void irOrange1(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_ORANGE_1);
    }

    public void irOrange2(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_ORANGE_2);
    }

    public void irYellow(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_YELLOW);
    }

    // Green
    public void irGreen1(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_GREEN_1);
    }

    public void irGreen2(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_GREEN_2);
    }

    public void irLightBlue(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_LIGHT_BLUE);
    }

    public void irTurquoise(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_TURQUOISE);
    }

    public void irCyan(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_CYAN);
    }

    // Blue
    public void irDarkBlue(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_DARK_BLUE);
    }

    public void irBlue(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_BLUE);
    }

    public void irViolet1(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_VIOLET_1);
    }

    public void irViolet2(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_VIOLET_2);
    }

    public void irUnicorn(View view) {
        consumerIrManager.transmit(36000, Pattern.STRIP_UNICORN);
    }
}

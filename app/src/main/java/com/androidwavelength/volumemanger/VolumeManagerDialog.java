package com.androidwavelength.volumemanger;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class VolumeManagerDialog extends Dialog {
    private TextView manage_volume, media_message, alarm_message, notification_message, ringtone_message;
    private SeekBar media_seekbar, alarm_seekbar, notification_seekbar, ringtone_seekbar;
    private Button btnSet;

    public VolumeManagerDialog(Context context) {
        super(context);
        setContentView(R.layout.volumemanager_dialog);

        initViews();
        setupListeners();
    }
    private void initViews() {
        manage_volume = findViewById(R.id.manage_volume);
        media_message = findViewById(R.id.media_message);
        alarm_message = findViewById(R.id.alarm_message);
        notification_message = findViewById(R.id.notification_message);
        ringtone_message = findViewById(R.id.ringtone_message);
        media_seekbar = findViewById(R.id.media_seekbar);
        alarm_seekbar = findViewById(R.id.alarm_seekbar);
        notification_seekbar = findViewById(R.id.notification_seekbar);
        ringtone_seekbar = findViewById(R.id.ringtone_seekbar);
        btnSet = findViewById(R.id.btnSet);
    }

    private void setupListeners() {
        media_seekbar.setOnSeekBarChangeListener(new Media_seekbarOnSeekBarChangeListener());
        alarm_seekbar.setOnSeekBarChangeListener(new Alarm_seekbarOnSeekBarChangeListener());
        notification_seekbar.setOnSeekBarChangeListener(new Notification_seekbarOnSeekBarChangeListener());
        ringtone_seekbar.setOnSeekBarChangeListener(new Ringtone_seekbarOnSeekBarChangeListener());

        btnSet.setOnClickListener(new BtnSetOnClickListener());
    }
    private class BtnSetOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
          dismiss();
        }
    }

    private class Media_seekbarOnSeekBarChangeListener implements SeekBar.OnSeekBarChangeListener{
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    private class Alarm_seekbarOnSeekBarChangeListener implements SeekBar.OnSeekBarChangeListener{
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        }
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    private class Notification_seekbarOnSeekBarChangeListener implements SeekBar.OnSeekBarChangeListener{
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        }
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    private class Ringtone_seekbarOnSeekBarChangeListener implements SeekBar.OnSeekBarChangeListener{
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        }
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }
}

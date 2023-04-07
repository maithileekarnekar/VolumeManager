package com.androidwavelength.volumemanger;

import android.app.Dialog;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button VolumeButton;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupListeners();
    }

    private void initViews(){
        VolumeButton = findViewById(R.id.VolumeButton);
    }

    private void setupListeners() {
        VolumeButton.setOnClickListener(new BtnVolumeDialogClickListener());
    }

    private class BtnVolumeDialogClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
         VolumeManagerDialog volumeManagerDialog = new VolumeManagerDialog(MainActivity.this);
         volumeManagerDialog.show();
        }
    }
}
/*public class VolumeManagerDialog extends Dialog implements SeekBar.OnSeekBarChangeListener {

    private AudioManager audioManager;
    private SeekBar media_SeekBar;
    private Context context;

    public VolumeManagerDialog(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = LayoutInflater.from(context).inflate(R.layout.activity_main, null);
        setContentView(view);

        audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);

        media_SeekBar = (SeekBar) view.findViewById(R.id.media_seekbar);
        media_SeekBar.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
        media_SeekBar.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));
        media_SeekBar.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // no implementation needed
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // no implementation needed
    }
}
*/
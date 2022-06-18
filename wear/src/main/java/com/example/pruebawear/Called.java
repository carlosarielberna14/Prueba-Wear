package com.example.pruebawear;

import static com.example.pruebawear.MainActivity.idNotification;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;
import android.widget.TextView;

import com.example.pruebawear.databinding.ActivityCalledBinding;


public class Called extends Activity {

    private TextView mTextView;
    private ActivityCalledBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalledBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.cancel(idNotification);
    }
}
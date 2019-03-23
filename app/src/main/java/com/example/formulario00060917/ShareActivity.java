package com.example.formulario00060917;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.formulario00060917.utils.AppConstants;

public class ShareActivity extends AppCompatActivity {
    private TextView tvSharedUser, tvSharedPassword, tvSharedEmail, tvSharedGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        tvSharedUser = findViewById(R.id.tv_shared_user);
        tvSharedPassword = findViewById(R.id.tv_shared_password);
        tvSharedEmail = findViewById(R.id.tv_shared_email);
        tvSharedGender = findViewById(R.id.tv_shared_gender);
        Intent mIntentShare = getIntent();
        if (mIntentShare != null) {
            tvSharedUser.setText(mIntentShare.getStringExtra(AppConstants.USER_KEY));
            tvSharedPassword.setText(mIntentShare.getStringExtra(AppConstants.PASSWORD_KEY));
            tvSharedEmail.setText(mIntentShare.getStringExtra(AppConstants.EMAIL_KEY));
            tvSharedGender.setText(mIntentShare.getStringExtra(AppConstants.GENDER_KEY));
        }
    }
}

package com.example.formulario00060917;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.formulario00060917.utils.AppConstants;

public class Main2Activity extends AppCompatActivity {
    private TextView tvUser, tvPassword, tvEmail, tvGender;
    private Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvUser = findViewById(R.id.tv_user);
        tvPassword = findViewById(R.id.tv_password);
        tvEmail = findViewById(R.id.tv_email);
        tvGender = findViewById(R.id.tv_gender);
        btnShare = findViewById(R.id.btn_share);
        Intent mIntent = getIntent();
        if (mIntent != null) {
            tvUser.setText(mIntent.getStringExtra(AppConstants.USER_KEY));
            tvPassword.setText(mIntent.getStringExtra(AppConstants.PASSWORD_KEY));
            tvEmail.setText(mIntent.getStringExtra(AppConstants.EMAIL_KEY));
            tvGender.setText(mIntent.getStringExtra(AppConstants.GENDER_KEY));
        }
        btnShare.setOnClickListener(v -> {
            String user = tvUser.getText().toString();
            String pass = tvPassword.getText().toString();
            String email = tvEmail.getText().toString();
            String gender = tvGender.getText().toString();
            Intent mIntentShare = new Intent();
            mIntentShare.setType("text/plain");
            mIntentShare.setAction(Intent.ACTION_SEND);

            mIntentShare.putExtra(AppConstants.USER_KEY, user);
            mIntentShare.putExtra(AppConstants.PASSWORD_KEY, pass);
            mIntentShare.putExtra(AppConstants.EMAIL_KEY, email);
            mIntentShare.putExtra(AppConstants.GENDER_KEY, gender);
            startActivity(mIntentShare);
        });
    }
}

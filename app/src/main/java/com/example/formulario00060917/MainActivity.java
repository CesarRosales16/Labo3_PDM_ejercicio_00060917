package com.example.formulario00060917;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.formulario00060917.utils.AppConstants;

public class MainActivity extends AppCompatActivity {
    private EditText etUser, etPassword, etEmail;
    private RadioGroup radioGenderGroup;
    private RadioButton radioGenderButton;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUser = findViewById(R.id.et_user);
        etPassword = findViewById(R.id.et_password);
        etEmail = findViewById(R.id.et_email);
        radioGenderGroup = findViewById(R.id.radio_gender);

        btnSubmit = findViewById(R.id.btn_submit);
        btnSubmit.setOnClickListener(v -> {
            String user = etUser.getText().toString();
            String pass = etPassword.getText().toString();
            String email = etEmail.getText().toString();
            int selectedId = radioGenderGroup.getCheckedRadioButtonId();
            String gender;
            if (selectedId != -1) {
                radioGenderButton = findViewById(selectedId);
                gender = radioGenderButton.getText().toString();
            } else {
                gender = "";
            }
            System.out.println("Variable: " + selectedId);

            Intent mIntent = new Intent(MainActivity.this, Main2Activity.class);
            mIntent.putExtra(AppConstants.USER_KEY, user);
            mIntent.putExtra(AppConstants.PASSWORD_KEY, pass);
            mIntent.putExtra(AppConstants.EMAIL_KEY, email);
            mIntent.putExtra(AppConstants.GENDER_KEY, gender);
            startActivity(mIntent);
        });
    }

}

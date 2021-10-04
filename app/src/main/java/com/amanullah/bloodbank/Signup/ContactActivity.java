package com.amanullah.bloodbank.Signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amanullah.bloodbank.R;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    public void bloodGroup(View view){
        Intent intent = new Intent(getApplicationContext(), BloodGroupActivity.class);
        startActivity(intent);
        finish();
    }
}
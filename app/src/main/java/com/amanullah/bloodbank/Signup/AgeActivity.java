package com.amanullah.bloodbank.Signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amanullah.bloodbank.R;

public class AgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
    }

    public void photo(View view){
        Intent intent = new Intent(getApplicationContext(), PhotoActivity.class);
        startActivity(intent);
        finish();
    }
}
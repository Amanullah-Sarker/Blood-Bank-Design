package com.amanullah.bloodbank.Signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amanullah.bloodbank.R;

public class BloodGroupActivity extends AppCompatActivity {

    Button oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_group);

        oneButton = findViewById(R.id.oneButtonId);
        twoButton = findViewById(R.id.twoButtonId);
        threeButton = findViewById(R.id.threeButtonId);
        fourButton = findViewById(R.id.fourButtonId);
        fiveButton = findViewById(R.id.fiveButtonId);
        sixButton = findViewById(R.id.sixButtonId);
        sevenButton = findViewById(R.id.sevenButtonId);
        eightButton = findViewById(R.id.eightButtonId);

        oneButton.setOnClickListener(new Click());
        twoButton.setOnClickListener(new Click());
        threeButton.setOnClickListener(new Click());
        fourButton.setOnClickListener(new Click());
        fiveButton.setOnClickListener(new Click());
        sixButton.setOnClickListener(new Click());
        sevenButton.setOnClickListener(new Click());
        eightButton.setOnClickListener(new Click());
    }

    public class Click implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            Intent intent;

            if (v.getId() == R.id.oneButtonId){
                intent = new Intent(getApplicationContext(), WeightActivity.class);
                startActivity(intent);
                finish();
            }if (v.getId() == R.id.twoButtonId){
                intent = new Intent(getApplicationContext(), WeightActivity.class);
                startActivity(intent);
                finish();
            }if (v.getId() == R.id.threeButtonId){
                intent = new Intent(getApplicationContext(), WeightActivity.class);
                startActivity(intent);
                finish();
            }if (v.getId() == R.id.fourButtonId){
                intent = new Intent(getApplicationContext(), WeightActivity.class);
                startActivity(intent);
                finish();
            }if (v.getId() == R.id.fiveButtonId){
                intent = new Intent(getApplicationContext(), WeightActivity.class);
                startActivity(intent);
                finish();
            }if (v.getId() == R.id.sixButtonId){
                intent = new Intent(getApplicationContext(), WeightActivity.class);
                startActivity(intent);
                finish();
            }if (v.getId() == R.id.sevenButtonId){
                intent = new Intent(getApplicationContext(), WeightActivity.class);
                startActivity(intent);
                finish();
            }if (v.getId() == R.id.eightButtonId){
                intent = new Intent(getApplicationContext(), WeightActivity.class);
                startActivity(intent);
                finish();
            }
        }
    }
}
package com.amanullah.bloodbank.Signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amanullah.bloodbank.R;

public class GenderActivity extends AppCompatActivity {

    Button maleButton, femaleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        maleButton = findViewById(R.id.maleButtonId);
        femaleButton = findViewById(R.id.femaleButtonId);

        maleButton.setOnClickListener(new Click());
        femaleButton.setOnClickListener(new Click());
    }

    public class Click implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent;

            if (v.getId() == R.id.maleButtonId){
                intent = new Intent(getApplicationContext(), AddressActivity.class);
                startActivity(intent);
                finish();
            }if (v.getId() == R.id.femaleButtonId){
                intent = new Intent(getApplicationContext(), AddressActivity.class);
                startActivity(intent);
                finish();
            }
        }
    }
}
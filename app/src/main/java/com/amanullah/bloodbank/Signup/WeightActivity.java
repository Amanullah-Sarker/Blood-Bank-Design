package com.amanullah.bloodbank.Signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.amanullah.bloodbank.R;

public class WeightActivity extends AppCompatActivity {

    Button overWeightButton, underWeightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        overWeightButton = findViewById(R.id.overWeightButtonId);
        underWeightButton = findViewById(R.id.underWEightButtonId);

        overWeightButton.setOnClickListener(new Click());
        underWeightButton.setOnClickListener(new Click());
    }

    public class Click implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent;

            if (v.getId() == R.id.overWeightButtonId){
                intent = new Intent(getApplicationContext(), GenderActivity.class);
                startActivity(intent);
                finish();
            }if (v.getId() == R.id.underWEightButtonId){
                intent = new Intent(getApplicationContext(), GenderActivity.class);
                startActivity(intent);
                finish();
            }
        }
    }

}
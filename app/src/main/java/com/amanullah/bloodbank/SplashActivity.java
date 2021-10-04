package com.amanullah.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIMER = 5000;

    ImageView splashImageView;
    TextView poweredByTextView;

    Animation sideAnim, bottomAnim;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        splashImageView = findViewById(R.id.splashImageViewId);
        poweredByTextView = findViewById(R.id.poweredByTextViewId);

        sideAnim = AnimationUtils.loadAnimation(this, R.anim.side_anim);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.botton_anim);

        splashImageView.setAnimation(sideAnim);
        poweredByTextView.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                sharedPreferences = getSharedPreferences("onBordingScreen", MODE_PRIVATE);

                boolean isFirstTime = sharedPreferences.getBoolean("firstTime", true);

                if (isFirstTime){
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("firstTime", false);
                    editor.commit();

                    Intent intent = new Intent(getApplicationContext(), OnBordingActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Intent intent = new Intent(getApplicationContext(), OnBordingActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        }, SPLASH_TIMER);
    }
}
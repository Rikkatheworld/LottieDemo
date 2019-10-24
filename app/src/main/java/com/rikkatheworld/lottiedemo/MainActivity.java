package com.rikkatheworld.lottiedemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView lottieView = findViewById(R.id.lottie_view);
        lottieView.setAnimation("genius-avatar.json");
        lottieView.loop(true);
        lottieView.playAnimation();
    }
}

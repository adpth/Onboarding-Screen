package com.adpth.slideview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class SlideViewActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("Meet Adpth")
                .setContent("A perfect platform to learn Android Development skills and UI Design interface")
                .setBackgroundColor(Color.parseColor("#ED0C44"))
                .setDrawable(R.drawable.img1)
                .build());

        addFragment(new Step.Builder().setTitle("UI Design")
                .setContent("UI design plays vital role where mobile developers put interaction animations on phone screens. Which will bring a lot of traffic toward his Application")
                .setBackgroundColor(Color.parseColor("#ED0C44"))
                .setDrawable(R.drawable.img2)
                .build());

        addFragment(new Step.Builder().setTitle("Design Implementation")
                .setContent("I will post tutorials based on Android Development. Which will help you in your Application Development")
                .setBackgroundColor(Color.parseColor("#ED0C44"))
                .setDrawable(R.drawable.img3)
                .setSummary("Do Follow us for more such content")
                .build());

    }

    //If you want to open another activity on clicking finish button then use this method

    @Override
    public void finishTutorial() {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void currentFragmentPosition(int position) {
       // Here we can toast the position number of the slide
    }

}

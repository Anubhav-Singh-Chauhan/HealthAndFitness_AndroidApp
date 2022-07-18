package com.example.healthfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TipsActivityDetails extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_details);

        textView = findViewById(R.id.text);
        String dstory = getIntent().getStringExtra("story");
        textView.setText(dstory);
    }

    public void tipsgoback(View view) {
        Intent intent = new Intent(TipsActivityDetails.this, TipsActivity.class);
        startActivity(intent);
        finish();
    }


    public void onBackPressed() {
        Intent intent = new Intent(TipsActivityDetails.this, TipsActivity.class);
        startActivity(intent);
        finish();
    }
}
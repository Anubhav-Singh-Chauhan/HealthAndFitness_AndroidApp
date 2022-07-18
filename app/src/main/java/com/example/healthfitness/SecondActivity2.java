package com.example.healthfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity2 extends AppCompatActivity {

    int [] arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        arr = new int[]{
                R.id.bow_pose, R.id.bridge_pose, R.id.chair_pose, R.id.chill_pose, R.id.cobbler_pose, R.id.cow_pose, R.id.playji_pose,
                R.id.pauseji_pose,R.id.plankji_pose,R.id.crunches_pose, R.id.situp_pose, R.id.rotation_pose, R.id.twist_pose, R.id.windmill_pose,  R.id.legup_pose
        };
    }


    public void ImageButtonClick(View view) {
        for(int i=0;i<arr.length;i++)
        {
            if(view.getId()== arr[i])
            {
                int value = i+1;
                Log.i("First", String.valueOf(value));
                Intent intent = new Intent(SecondActivity2.this, ThirdActivity2.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}
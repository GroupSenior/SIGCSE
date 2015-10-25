package com.example.owen.sigcsevolunteer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Owen on 10/19/15.
 */
public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
    }
    
    
     public void goMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


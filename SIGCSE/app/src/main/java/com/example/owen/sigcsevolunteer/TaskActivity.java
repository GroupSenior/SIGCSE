package com.example.owen.sigcsevolunteer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Owen on 10/19/15.
 */
public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
    }
    
    
     public void goSignIn(View view){
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }
}

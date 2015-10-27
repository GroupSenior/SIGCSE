package com.example.owen.sigcsevolunteer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/** This class provides the main Task display page of the application.
 * @author Owen Galvin, 10/19/2015
 * @modified Will Lewis 10/25/2015
 */
public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
    }

    //This method opens the Main activity
    //@param view, the Main Page button
     public void goMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


//This Class provides the central activity of the application, from which all of the other activities may be reached.
//This activity is called when the user signs in.

//@author Owen Galvin 10/17/2015
//@modified Will Lewis 10/25/2015

package com.example.owen.sigcsevolunteer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //This method opens the Task activity
    //@param view, the Tasks button
    public void goTasks(View view){
        Intent intent = new Intent(this, TaskActivity.class);
        startActivity(intent);
    }

    //This method opens the Option activity
    //@param view, the Options button
    public void goOptions(View view){
        Intent intent = new Intent(this, OptionActivity.class);
        startActivity(intent);
    }

    //This method opens the SignIn activity
    //@param view, the Sign In button
    public void goSignIn(View view){
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }
}

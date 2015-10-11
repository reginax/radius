package io.github.reginax.radiusapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.FacebookSdk;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_home);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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


    // Displays the messages receieved
    public void displayReceived(View view) {


    }
    // Displays the messages sent
    public void displaySent(View view) {

    }

    // Displays a map of everything ever received and sent
    public void displayMap(View view) {

    }

    // prep and send a new message
    public void sendNewMsg(View view) {
    }

    // display the current settings
    public void displaySettings(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    // show a list of friends
    // should allow deletion and addition of friends
    public void Friends(View view) {

    }

    // go back to the home menu!
    public void goHome(View view) {

    }
}

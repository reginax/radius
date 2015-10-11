package io.github.reginax.radiusapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
//        Intent intent = new Intent(this, SendNewMessageActivity.class);
//        Button buttonPressed = (EditText) findViewById(R.id.button);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
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

package com.castatech.activities;

// based on: https://www.learn2crack.com/2016/10/android-switching-between-activities-example.html

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    public static int LOGLEVEL = 5;
    //    SUPPRESS     ASSERT
    public static boolean ERROR = LOGLEVEL > 0;
    public static boolean WARN = LOGLEVEL > 1;
    public static boolean INFO = LOGLEVEL > 2;
    public static boolean DEBUG = LOGLEVEL > 3;
    public static boolean VERBOSE = LOGLEVEL > 4;
//        if (VERBOSE) Log.v(TAG, "V +++ ON CREATE +++");
//        if (VERBOSE) Log.d(TAG, "D +++ ON CREATE +++");
//        if (VERBOSE) Log.e(TAG, "E +++ ON CREATE +++");
//        if (VERBOSE) Log.w(TAG, "W +++ ON CREATE +++");

    private Button mBtLaunchActivity;
    private Integer iMachineState;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (VERBOSE) Log.i(TAG, "+++ MainActivity ON CREATE +++");

        mBtLaunchActivity = (Button) findViewById(R.id.bt_launch_activity);
        mBtLaunchActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });

        mainStateMachine();
    }










    @Override
    public void onStart() {
        super.onStart();
        if (VERBOSE) Log.i(TAG, "++ ON START ++");
    }

    @Override
    public void onResume() {
        super.onResume();
        if (VERBOSE) Log.i(TAG, "+ ON RESUME +");
    }

    @Override
    public void onStop() {
        super.onStop();
        if (VERBOSE) Log.i(TAG, "++ ON STOP ++");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (VERBOSE) Log.i(TAG, "+ ON DESTROY +");
    }




    private int mainStateMachine(){
        iMachineState = 0 ;

        if (VERBOSE) Log.i(TAG, "+++ start mainStateMachine +++");

        if (VERBOSE) Log.i(TAG, "+++ end mainStateMachine +++");
        return 1;
    }



    private void launchActivity() {

        Intent intent = new Intent(this, ProfileActivity.class);
        EditText text1 = (EditText) findViewById(R.id.editText);
        intent.putExtra("text1", text1.getText());
        //intent.putExtra("text2",text2.getText());
        if (VERBOSE) Log.i(TAG, "+++ launchActivity +++");
        startActivity(intent);
    }

} // class MainActivity

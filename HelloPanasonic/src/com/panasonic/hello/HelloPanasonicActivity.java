package com.panasonic.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class HelloPanasonicActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void onClick(View v) throws Exception {
    		throw new Exception("Died");
    }
}
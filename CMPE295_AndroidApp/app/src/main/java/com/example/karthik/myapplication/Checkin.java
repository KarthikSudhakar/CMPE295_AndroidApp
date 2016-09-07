package com.example.karthik.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Checkin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);
    }
    public void calc(View view) {
        Intent intent = new Intent(this, confirmation.class);
        startActivity(intent);
    }
}

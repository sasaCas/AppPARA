package com.example.mac.apppara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity_final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
    }


    public void eresfeliz(View view) {

        Toast.makeText(this, "Khritina's question", Toast.LENGTH_SHORT).show();

    }
}

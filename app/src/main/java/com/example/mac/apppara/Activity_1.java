package com.example.mac.apppara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }

    public void eres88 (View view) {
        Toast.makeText(this, "¿no se si eres muy listo?", Toast.LENGTH_SHORT).show();
    }



    public void eres72 (View view) {
        Toast.makeText(this, "creo que no llegaras al final", Toast.LENGTH_SHORT).show();
    }



    public void eres86 (View view) {
        Toast.makeText(this, "ya no se que que decir, de lo mal que lo haces", Toast.LENGTH_SHORT).show();
    }


}

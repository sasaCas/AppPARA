package com.example.mac.apppara;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numeroGanador(View view) {

        Intent intentQuePasaDeActividadDeGuay = new Intent(this, Activity_1.class);
        startActivity(intentQuePasaDeActividadDeGuay);
    }


    public void eresUnPocoTonto(View view) {
        Toast.makeText(this, "Eres un poco tonto, POR FAVORRRR", Toast.LENGTH_SHORT).show();
    }
}

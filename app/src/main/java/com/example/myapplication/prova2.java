package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class prova2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prova2);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        String stringa = b.getString("TESTO");
        TextView t = (TextView)findViewById(R.id.testo);
        t.setText("Il tuo nome è: "+stringa);

    }
}

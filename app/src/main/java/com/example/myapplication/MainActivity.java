package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bottone1,bottone2,bottone3;
    private EditText nome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottone1 = (Button)findViewById(R.id.button);
        bottone2 = (Button)findViewById(R.id.button2);
        bottone3 = (Button)findViewById(R.id.button3);
        nome = (EditText)findViewById(R.id.plain_text_input);
        bottone1.setOnClickListener(this);
        bottone2.setOnClickListener(this);
        bottone3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v==bottone1){
            nome.setText(null);
        }
        if(v==bottone2){
            System.out.println("prova");
            String testo = nome.getText().toString();
            Toast t = Toast.makeText(getApplicationContext(),"Ciao! "+testo,Toast.LENGTH_LONG);
            t.show();
        }
        if(v==bottone3){
            String testo = nome.getText().toString();
            Intent i = new Intent(getApplicationContext(),prova2.class);
            i.putExtra("TESTO",testo);
            startActivity(i);
        }
    }
}

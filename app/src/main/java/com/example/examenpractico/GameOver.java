package com.example.examenpractico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameOver extends AppCompatActivity {
    TextView txtans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);


        int respuestas = getIntent().getIntExtra("ans",0);

        txtans = (TextView) findViewById(R.id.txtans);
        String texto = "Preguntas respondidas: "+respuestas;
        txtans.setText(texto);

    }


    public void toPrincipal(View v){

        Intent intent = new Intent(GameOver.this, Principal.class);
        startActivity(intent);
        finish();
    }
}

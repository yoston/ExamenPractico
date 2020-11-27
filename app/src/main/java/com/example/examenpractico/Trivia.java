package com.example.examenpractico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Trivia extends AppCompatActivity {
    Button btOpcion1;
    Button btOpcion2;
    Button btOpcion3;
    Button btOpcion4;
    TextView tvPregunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);

        btOpcion1 = (Button) findViewById(R.id.btOpcion1);
        btOpcion2 = (Button) findViewById(R.id.btOpcion2);
        btOpcion3 = (Button) findViewById(R.id.btOpcion3);
        btOpcion4 = (Button) findViewById(R.id.btOpcion4);
        tvPregunta = (TextView) findViewById(R.id.tvPregunta);


        Random rand = new Random();
        int n = rand.nextInt(4) + 1;


       // pregunta1();
       // pregunta2();


    }

    public void pregunta1(){
        tvPregunta.setText(R.string.pregunta_1);
        btOpcion1.setText(R.string.opcion_1_1);
        btOpcion2.setText(R.string.opcion_1_2);
        btOpcion3.setText(R.string.opcion_1_3);
        btOpcion4.setText(R.string.opcion_1_4);
    }

    public void pregunta2(){
        tvPregunta.setText(R.string.pregunta_2);
        btOpcion1.setText(R.string.opcion_2_1);
        btOpcion2.setText(R.string.opcion_2_2);
        btOpcion3.setText(R.string.opcion_2_3);
        btOpcion4.setText(R.string.opcion_2_4);
    }

    public void pregunta3(){
        tvPregunta.setText(R.string.pregunta_3);
        btOpcion1.setText(R.string.opcion_3_1);
        btOpcion2.setText(R.string.opcion_3_2);
        btOpcion3.setText(R.string.opcion_3_3);
        btOpcion4.setText(R.string.opcion_3_4);
    }

    public void pregunta4(){
        tvPregunta.setText(R.string.pregunta_4);
        btOpcion1.setText(R.string.opcion_4_1);
        btOpcion2.setText(R.string.opcion_4_2);
        btOpcion3.setText(R.string.opcion_4_3);
        btOpcion4.setText(R.string.opcion_4_4);
    }

    public void pregunta5(){
        tvPregunta.setText(R.string.pregunta_5);
        btOpcion1.setText(R.string.opcion_5_1);
        btOpcion2.setText(R.string.opcion_5_2);
        btOpcion3.setText(R.string.opcion_5_3);
        btOpcion4.setText(R.string.opcion_5_4);
    }


    public void opciones(View v) {
        String opcion = v.getTag().toString();

        Toast.makeText(Trivia.this,opcion,Toast.LENGTH_SHORT).show();

    }

}
package com.example.examenpractico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.Random;

public class Trivia extends AppCompatActivity {
    Button btOpcion1;
    Button btOpcion2;
    Button btOpcion3;
    Button btOpcion4;
    TextView tvPregunta;
    int opcion=0;
    int correcto=0;
    int n=0;
    int respuestas=0;

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
        n = rand.nextInt(4) + 1;
        correcto = 0;
        getQuestion(n);



/*
        for (int i = 1; i <= 5; i++) {
            int n = rand.nextInt(4) + 1;
            correcto = 0;
            switch(n) {
                case 1:
                    correcto=pregunta1();
                    break;
                case 2:
                    correcto=pregunta2();
                    break;
                case 3:
                    correcto=pregunta3();
                    break;
                case 4:
                    correcto=pregunta4();
                    break;
                case 5:
                    correcto=pregunta5();
                    break;
            }

            opcion=0;
            while (opcion!=0){}

            if(opcion)
        }

*/

       // pregunta1();
       // pregunta2();


    }

    public void pregunta1(){
        tvPregunta.setText(R.string.pregunta_1);
        btOpcion1.setText(R.string.opcion_1_1);
        btOpcion2.setText(R.string.opcion_1_2);
        btOpcion3.setText(R.string.opcion_1_3);
        btOpcion4.setText(R.string.opcion_1_4);
        correcto= 2;
    }

    public void pregunta2(){
        tvPregunta.setText(R.string.pregunta_2);
        btOpcion1.setText(R.string.opcion_2_1);
        btOpcion2.setText(R.string.opcion_2_2);
        btOpcion3.setText(R.string.opcion_2_3);
        btOpcion4.setText(R.string.opcion_2_4);
        correcto= 2;
    }

    public void pregunta3(){
        tvPregunta.setText(R.string.pregunta_3);
        btOpcion1.setText(R.string.opcion_3_1);
        btOpcion2.setText(R.string.opcion_3_2);
        btOpcion3.setText(R.string.opcion_3_3);
        btOpcion4.setText(R.string.opcion_3_4);
        correcto= 3;
    }

    public void pregunta4(){
        tvPregunta.setText(R.string.pregunta_4);
        btOpcion1.setText(R.string.opcion_4_1);
        btOpcion2.setText(R.string.opcion_4_2);
        btOpcion3.setText(R.string.opcion_4_3);
        btOpcion4.setText(R.string.opcion_4_4);
        correcto= 4;
    }

    public void pregunta5(){
        tvPregunta.setText(R.string.pregunta_5);
        btOpcion1.setText(R.string.opcion_5_1);
        btOpcion2.setText(R.string.opcion_5_2);
        btOpcion3.setText(R.string.opcion_5_3);
        btOpcion4.setText(R.string.opcion_5_4);
        correcto= 1;
    }

    public void getQuestion(int n){
        switch(n) {
            case 1:
                pregunta1();
                break;
            case 2:
                pregunta2();
                break;
            case 3:
                pregunta3();
                break;
            case 4:
                pregunta4();
                break;
            case 5:
                pregunta5();
                break;
        }
    }



    public void opciones(View v) {
        String tag=v.getTag().toString();
        opcion = Integer.parseInt(tag);

        if (opcion==correcto){
            respuestas+=1;

            Random rand = new Random();
            n = rand.nextInt(4) + 1;
            correcto = 0;
            getQuestion(n);

            Toast.makeText(Trivia.this,"Correcto",Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(Trivia.this, GameOver.class);
            startActivity(intent);
            intent.putExtra("ans",respuestas);
            finish();
        }


    }

}
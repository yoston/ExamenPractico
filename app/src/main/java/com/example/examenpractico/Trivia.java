package com.example.examenpractico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Trivia extends AppCompatActivity {
    Button btOpcion1;
    Button btOpcion2;
    Button btOpcion3;
    Button btOpcion4;
    TextView tvPregunta;
    ImageView imbPregunta;
    int opcion=0;
    int correcto=0;
    int n=0;
    int respuestas=0;

    List<Integer> randomList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);

        btOpcion1 = (Button) findViewById(R.id.btOpcion1);
        btOpcion2 = (Button) findViewById(R.id.btOpcion2);
        btOpcion3 = (Button) findViewById(R.id.btOpcion3);
        btOpcion4 = (Button) findViewById(R.id.btOpcion4);
        tvPregunta = (TextView) findViewById(R.id.tvPregunta);
        imbPregunta = (ImageView) findViewById(R.id.imPregunta);


        getRandomList();

        correcto = 0;
        n= randomList.get(0);
        getQuestion(n);

    }

    public void pregunta1(){
        tvPregunta.setText(R.string.pregunta_1);
        btOpcion1.setText(R.string.opcion_1_1);
        btOpcion2.setText(R.string.opcion_1_2);
        btOpcion3.setText(R.string.opcion_1_3);
        btOpcion4.setText(R.string.opcion_1_4);
        imbPregunta.setImageResource(R.drawable.pregunta1);
        correcto= 2;
    }

    public void pregunta2(){
        tvPregunta.setText(R.string.pregunta_2);
        btOpcion1.setText(R.string.opcion_2_1);
        btOpcion2.setText(R.string.opcion_2_2);
        btOpcion3.setText(R.string.opcion_2_3);
        btOpcion4.setText(R.string.opcion_2_4);
        imbPregunta.setImageResource(R.drawable.pregunta2);
        correcto= 2;
    }

    public void pregunta3(){
        tvPregunta.setText(R.string.pregunta_3);
        btOpcion1.setText(R.string.opcion_3_1);
        btOpcion2.setText(R.string.opcion_3_2);
        btOpcion3.setText(R.string.opcion_3_3);
        btOpcion4.setText(R.string.opcion_3_4);
        imbPregunta.setImageResource(R.drawable.pregunta3);
        correcto= 3;
    }

    public void pregunta4(){
        tvPregunta.setText(R.string.pregunta_4);
        btOpcion1.setText(R.string.opcion_4_1);
        btOpcion2.setText(R.string.opcion_4_2);
        btOpcion3.setText(R.string.opcion_4_3);
        btOpcion4.setText(R.string.opcion_4_4);
        imbPregunta.setImageResource(R.drawable.pregunta4);
        correcto= 4;
    }

    public void pregunta5(){
        tvPregunta.setText(R.string.pregunta_5);
        btOpcion1.setText(R.string.opcion_5_1);
        btOpcion2.setText(R.string.opcion_5_2);
        btOpcion3.setText(R.string.opcion_5_3);
        btOpcion4.setText(R.string.opcion_5_4);
        imbPregunta.setImageResource(R.drawable.pregunta5);
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

    public void getRandomList(){
        randomList = Arrays.asList(1,2,3,4,5);
        Collections.shuffle(randomList);
    }


    public void opciones(View v) {
        String tag=v.getTag().toString();
        opcion = Integer.parseInt(tag);

        if (opcion==correcto){
            respuestas+=1;
            if (respuestas<5){
                n=randomList.get(respuestas);
                correcto = 0;
                getQuestion(n);
            }
            else {
                Intent intent = new Intent(Trivia.this, Ganador.class);
                startActivity(intent);
                finish();
            }
        }
        else {
            Intent intent = new Intent(Trivia.this, GameOver.class);
            intent.putExtra("ans",respuestas);
            startActivity(intent);
            finish();
        }

    }

}
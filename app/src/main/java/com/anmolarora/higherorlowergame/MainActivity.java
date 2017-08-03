package com.anmolarora.higherorlowergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void makeToast(String string){

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();

    }

    public void guess(View view){

        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if (guessInt>randomNumber){

            makeToast("Go Lower!!");

        }else if (guessInt<randomNumber){

            makeToast("Go Higher!!");
        }else{

            makeToast("Correct!! Play Again");

            Random rand = new Random();

            randomNumber = rand.nextInt(20) + 1;
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;
//between 20 and 1(Defined here so that random number is generated as soon as the app is run and not when user enters a number)

    }
}

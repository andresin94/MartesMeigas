package com.example.usuario.martesmeigas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup groupGenero = (RadioGroup) findViewById(R.id.radioGroup);
                String result ="";
                switch(groupGenero.getCheckedRadioButtonId()) {
                    case R.id.radioButtonHombre:
                        result = "Hombre";
                        break;
                    case R.id.radioButtonMujer:
                        result= "Mujer";
                        break;

                    case R.id.radioButtonOtro:
                        result ="Otro";
                        break;

                }
                //Mostramos el genero en un Toast
                Toast.makeText(MainActivity.this, "El genero es "+result, Toast.LENGTH_LONG).show();
            }

        });

    }
}

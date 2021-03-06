package com.example.usuario.martesmeigas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    List<String> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        lista.add("Matematicas");
        lista.add("Lengua");
        lista.add("Historia");
        lista.add("Ingles");

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.array_datos, android.R.layout.simple_spinner_dropdown_item);
        
        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, lista);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adaptador);

        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Asignatura: "+lista.get(position), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

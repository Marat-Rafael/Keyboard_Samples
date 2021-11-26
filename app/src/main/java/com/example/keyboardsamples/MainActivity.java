package com.example.keyboardsamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mostrarEditViewNumerico(View view){
        Intent intent = new Intent(this,EditViewNumerico.class);
        // por si queremos pasar datos de una actividad a otra

        //EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void mostrarEditViewCorreo(View view){
        Intent intent = new Intent(this,EditViewCorreo.class);
        // por si queremos pasar datos de una actividad a otra

        //EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void mostrarEditViewSpinner(View view){
        Intent intent = new Intent(this,EditViewSpinner.class);
        // por si queremos pasar datos de una actividad a otra

        //EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void mostrarDataTimerPicker(View view){
        Intent intent = new Intent(this,DataTimerPicker.class);
        // por si queremos pasar datos de una actividad a otra

        //EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void mostrarAlert(View view){
        Intent intent = new Intent(this,Alert.class);
        // por si queremos pasar datos de una actividad a otra

        //EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void mostrarDroidCafe(View view){
        Intent intent = new Intent(this,DroidCafe.class);
        // por si queremos pasar datos de una actividad a otra

        //EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
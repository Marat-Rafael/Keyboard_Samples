package com.example.keyboardsamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class EditViewSpinner extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText editText;
    // creamos objeto spinner
    private Spinner spiner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_view_spinner);
        setTitle("EditView con Spinner");
        abrirSpinner();
    }

    private void abrirSpinner() {
        // identificamos spinner
        spiner = findViewById(R.id.spinner);

        // creamos array de strings para usar en spiner
        String[] opcionesSpinner = {"telefono", "correo", "mayusculas", "texto"};

        // declaramos i iniciamos arrayAdapter , le pasamos como parametros context, tipo del spiner, i lista de opciones
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcionesSpinner);

        // al adapter declarado agregamos adapter
        spiner.setAdapter(arrayAdapter);

        // HAY QUE AÑADIR onItemSelectListener !!!!
        spiner.setOnItemSelectedListener(this);
    }


    /**
     * sobreescribimos metodo para detectar cambios en spinner
     * @param parent AdapterView
     * @param view vista
     * @param position posicion
     * @param id id?
     */
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Log.d("spinner","casos");
        editText =  findViewById(R.id.EditTextSpinner);
        switch (position) {
            case 0:
                editText.setInputType(InputType.TYPE_CLASS_PHONE);
                Log.d("spinner","caso 0");
                Toast.makeText(parent.getContext(), "intoducion del telefono", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                editText.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
                Log.d("spinner","caso 1");
                Toast.makeText(parent.getContext(), "introducion del correo", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                editText.setInputType(InputType.TYPE_TEXT_FLAG_CAP_WORDS);
                Log.d("spinner","caso 2");
                Toast.makeText(parent.getContext(), "introducion de mayusculas", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                editText.setInputType(InputType.TYPE_CLASS_TEXT);
                Log.d("spinner","caso 3");
                Toast.makeText(parent.getContext(), "introducion del simple texto", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
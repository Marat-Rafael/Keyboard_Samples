package com.example.keyboardsamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        setTitle("Envio");
    }

    /**
     * metodo para manejar RadioButton
     * @param view vista
     */
    public void onRadioBotonClick(View view) {
        // comprobas si boton esta pulsado
        boolean checked = ((RadioButton) view).isChecked();
        // comprobar cual boton esta pulsado
        switch (view.getId()) {
            case R.id.mismoDia:
                if (checked)
                    mostrarToast(getString(R.string.elegido) + getString(R.string.este_mismo_dia));
                break;
            case R.id.nextDia:
                if (checked)
                    mostrarToast(getString(R.string.elegido) + getString(R.string.dia_seguente));
                break;
            case R.id.pickUp:
                if (checked)
                    mostrarToast(getString(R.string.elegido) + getString(R.string.pick_up));
                break;
        }
    }

    /**
     * metodo para mostrar Toast
     *
     * @param mensaje string
     */
    public void mostrarToast(String mensaje) {
        Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();
    }
}
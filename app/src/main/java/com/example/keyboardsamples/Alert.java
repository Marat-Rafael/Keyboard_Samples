package com.example.keyboardsamples;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Alert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        setTitle("Probando Alert!");
    }
    
    public void onClickAlert(View view){
        AlertDialog.Builder myAlertDialogBuilder = new AlertDialog.Builder(this);
        myAlertDialogBuilder.setTitle("Alerta");
        myAlertDialogBuilder.setMessage("Pulsa OK para continuar, o Cancelar para terminar");
        
        myAlertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Pulsado OK", Toast.LENGTH_SHORT).show();
            }
        });

        myAlertDialogBuilder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Pulsado Cancelar", Toast.LENGTH_SHORT).show();
            }
        });
        myAlertDialogBuilder.show();
    }
}
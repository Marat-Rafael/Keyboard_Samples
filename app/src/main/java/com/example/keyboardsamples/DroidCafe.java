package com.example.keyboardsamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DroidCafe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droid_cafe);
        setTitle("Droid Cafe");
    }

    /**
     * metodo para mostrar un toast
     * @param mensaje string
     */
    protected void mostrarToast(String mensaje){
        Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();
    }

    /**
     * metodo para mostrar Toast y empezar OrderActivity
     * @param mensaje
     */
    public void showFoodOrder(String mensaje){
        mostrarToast(mensaje);
        // declaramos nuevo intent para OrderActivity
        Intent intent = new Intent(this,OrderActivity.class);
        // empezamos nuevo intent
        startActivity(intent);
    }

    public void mostrarDonutsOrder(View view){
        showFoodOrder(getString(R.string.donuts_order_mensaje));
    }

    public void mostrarIceOrder(View view){
        showFoodOrder(getString(R.string.ice_order_mensaje));
    }

    public void mostrarFroyoOrder(View view){
        showFoodOrder(getString(R.string.froyo_order_mensaje));
    }

    public void mostrarNatillaOrder(View view){
        showFoodOrder(getString(R.string.natilla_order_mensaje));
    }
}
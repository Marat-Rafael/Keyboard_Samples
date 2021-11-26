package com.example.keyboardsamples;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DataTimerPicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_timer_picker);

        setTitle("Data Timer Picker");
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new PickerFragmentData();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker));
    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new PickerFragmentTime();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_picker));
    }

    /**
     * metodo para procesar datos de fecha y hora
     * @param year
     * @param month
     * @param day
     */
    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        // concatenamos
        String dateMessage = (month_string + " | " + day_string + " | " + year_string);

        Toast.makeText(this, getString(R.string.fecha) + dateMessage, Toast.LENGTH_SHORT).show();
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        // convertimo tiempo en una cadena de string.
        String hour_string = Integer.toString(hourOfDay);
        String minute_string = Integer.toString(minute);
        // concatenamos dos cadenas junto
        String timeMessage = (hour_string + ":" + minute_string);
        // mostramos Toast
        Toast.makeText(this, getString(R.string.hora) + timeMessage, Toast.LENGTH_SHORT).show();
    }
}
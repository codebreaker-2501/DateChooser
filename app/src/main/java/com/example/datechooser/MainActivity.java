package com.example.datechooser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;

import com.google.android.material.textview.MaterialTextView;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * @author dhanush n
 * @version 1.0
 */

// Main activity implementing OnDateSetListener
public class MainActivity extends AppCompatActivity implements
        android.app.DatePickerDialog.OnDateSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // assigning button id
        Button btn = findViewById(R.id.datePicker);

        // Shows Date Picker Dialog on button click
        btn.setOnClickListener(view -> {
            // creating new DialogFragment
            DialogFragment dialogFragment = new DatePickerDialog();
            dialogFragment.show(getSupportFragmentManager(),"DatePicker");
        });
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
        // material text view
        MaterialTextView txt = findViewById(R.id.txt);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        // Formatting the data to print
        String date = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        txt.setText(date);
    }
}
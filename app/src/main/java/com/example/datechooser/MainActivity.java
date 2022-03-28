package com.example.datechooser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;

import com.google.android.material.textview.MaterialTextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity
        implements android.app.DatePickerDialog.OnDateSetListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = findViewById(R.id.datePicker);

        btn.setOnClickListener(view -> {
            DialogFragment dialogFragment = new DatePickerDialog();
            dialogFragment.show(getSupportFragmentManager(),"DatePicker");
        });
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {

        MaterialTextView txt = findViewById(R.id.txt);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

        String date = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        txt.setText(date);
    }
}
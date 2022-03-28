package com.example.datechooser;

import android.app.Dialog;
import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;



import java.util.Calendar;

public class DatePickerDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        return new android.app.DatePickerDialog(getActivity(),
                (android.app.DatePickerDialog.OnDateSetListener) getActivity(),year,month,day);
    }
}

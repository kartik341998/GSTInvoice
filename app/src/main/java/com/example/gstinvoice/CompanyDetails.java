package com.example.gstinvoice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;

public class CompanyDetails extends AppCompatActivity {

//    private static String Tag="Mainactivity";
//    private EditText textInputLayout;
//    private DatePickerDialog.OnDateSetListener mData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_details);

//        textInputLayout=(EditText) findViewById(R.id.name3);
//        textInputLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Calendar calendar=Calendar.getInstance();
//                int year=calendar.get(Calendar.YEAR);
//                int month=calendar.get(Calendar.MONTH);
//                int day=calendar.get(Calendar.DAY_OF_MONTH);
//
//                DatePickerDialog dialog= new DatePickerDialog(CompanyDetails.this
//                ,android.R.style.Theme_Holo_Light_Dialog_MinWidth,mData,year,month,day);
//
//                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//                dialog.show();
//
//
//            }
//        });
//
//        mData = new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//
//                month=month+1;
//
//
//                String date= dayOfMonth + "/" + month + "/" + year ;
//                textInputLayout.setText(date);
//
//            }
//        };

    }
}

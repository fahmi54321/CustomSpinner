package com.android.a2customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data();
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        SpinnerAdapter spinnerAdapter = new SpinnerAdapter(list,MainActivity.this);
        spinner.setAdapter(spinnerAdapter);

        //vertikal
        spinner.setDropDownVerticalOffset(500);
        //horizontal
        spinner.setDropDownHorizontalOffset(500);

    }

    private void data() {
        for (int i = 0;i<10;i++){
            list.add("Item "+i);
        }
    }
}
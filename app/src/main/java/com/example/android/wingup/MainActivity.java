package com.example.android.wingup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autocompleteFrom;
    AutoCompleteTextView autocompleteTo;

    String[] arr = { "RHO - Rhodes", "SKG - Thessaloniki", "ATH - Athens"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autocompleteFrom = (AutoCompleteTextView)
                findViewById(R.id.from_edit);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item, arr);

        autocompleteFrom.setThreshold(2);
        autocompleteFrom.setAdapter(adapter);

        autocompleteTo = (AutoCompleteTextView)
                findViewById(R.id.to_edit);

        autocompleteTo.setThreshold(2);
        autocompleteTo.setAdapter(adapter);
    }
}

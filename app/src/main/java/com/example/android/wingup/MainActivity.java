package com.example.android.wingup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autocompleteFrom;
    AutoCompleteTextView autocompleteTo;
    int adultsPassenger;
    int childrenPassenger;

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

        TextView adTxt = (TextView) findViewById(R.id.txtViewPassengerAd);
        adultsPassenger = Integer.parseInt(adTxt.getText().toString());

        TextView chTxt = (TextView) findViewById(R.id.txtViewPassengerCh);
        childrenPassenger = Integer.parseInt(chTxt.getText().toString());
    }

    public void increment1(View view) {
        if(adultsPassenger < 10) {
            adultsPassenger++;
            displayAdultsTxtView();
        }
        else {
            Toast.makeText(getApplicationContext(),"Big number of passengers!",Toast.LENGTH_SHORT).show();
        }
    }

    public void decrement1(View view) {
        if(adultsPassenger > 0) {
            adultsPassenger--;
            displayAdultsTxtView();
        }
        else {
            Toast.makeText(getApplicationContext(),"Small number of passengers!",Toast.LENGTH_SHORT).show();
        }
    }

    public void displayAdultsTxtView() {
        TextView adTxt = (TextView) findViewById(R.id.txtViewPassengerAd);
        adTxt.setText(adultsPassenger + "");
    }

    public void increment2(View view) {
        if(childrenPassenger < 10) {
            childrenPassenger++;
            displayChildrenTxtView();
        }
        else {
            Toast.makeText(getApplicationContext(),"Big number of passengers!",Toast.LENGTH_SHORT).show();
        }
    }

    public void decrement2(View view) {
        if(childrenPassenger > 0) {
            childrenPassenger--;
            displayChildrenTxtView();
        }
        else {
            Toast.makeText(getApplicationContext(),"Small number of passengers!",Toast.LENGTH_SHORT).show();
        }
    }

    public void displayChildrenTxtView() {
        TextView chTxt = (TextView) findViewById(R.id.txtViewPassengerCh);
        chTxt.setText(childrenPassenger + "");
    }
}

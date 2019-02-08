package com.tariq.autocompletetext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private static String[] Country = {
            "Afganistan","India", "USA", "NewYork","Canada", "Nepal", "Africa", "Egypt", "Saudi Arabia","Dubai"
    };

    private AutoCompleteTextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,Country);

        textView.setThreshold(1);
        textView.setAdapter(adapter);

    }
}

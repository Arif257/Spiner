package com.arif.spiner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] countryName;
    private Spinner spinner;
    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryName = getResources().getStringArray(R.array.countryName);
        spinner = findViewById(R.id.spinnerId);
        button = findViewById(R.id.buttonId);
        textView = findViewById(R.id.textViewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.sample_view,R.id.textViewSampleId,countryName);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = spinner.getSelectedItem().toString();
                textView.setText(value);
            }
        });


    }
}
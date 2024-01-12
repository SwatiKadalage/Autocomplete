package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] country={"MAD","MAN","EDE","ETI","PHP","PWP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,country);
        AutoCompleteTextView auto_view=(AutoCompleteTextView) findViewById(R.id.auto);
        auto_view.setThreshold(1);
        auto_view.setAdapter(adapter);
        auto_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Selected Item="+parent.getSelectedItem(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
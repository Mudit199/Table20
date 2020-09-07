package com.example.tabelzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SeekBar SEEKBAR;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SEEKBAR = findViewById(R.id.seekBar);
        listView = findViewById(R.id.listView);
        SEEKBAR.setMax(20);

        SEEKBAR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int Progress, boolean fromUser) {
                Toast toast = Toast.makeText(MainActivity.this, "Multiplication Table Of: " + Progress, Toast.LENGTH_SHORT);
                toast.show();
                Multiple(Progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
            public void Multiple(int tabel) {
                ArrayList<String> mulTab = new ArrayList<>();
                for(int i = 1; i<=10; i++){
                    mulTab.add(tabel + " X " + i + " = " + tabel*i);
                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mulTab);
                listView.setAdapter(arrayAdapter);
            }
}
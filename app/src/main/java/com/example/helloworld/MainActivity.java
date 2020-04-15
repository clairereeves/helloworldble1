package com.example.helloworld;


//import android.support.v7.app.AppCompatActivity;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDeviceScanActivity();
            }
        });
    }


    public void openDeviceScanActivity(){
        Intent intent = new Intent(this, DeviceScanActivity.class);
        startActivity(intent);
    }

    /*
     Button.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            Intent i = new Intent(PlacePickerActivity.this, PlacesActivity.class);
            PlacePickerActivity.this.startActivity(i);

        }
    }); */
}
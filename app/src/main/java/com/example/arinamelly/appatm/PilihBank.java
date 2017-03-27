package com.example.arinamelly.appatm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PilihBank extends AppCompatActivity {
    Button btnceksaldo, btntarik, btnsetor, btntransfer, btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_bank);
        btnceksaldo = (Button) findViewById(R.id.btnceksaldo);
        btnsetor = (Button) findViewById(R.id.btnsetor);
        btntarik = (Button) findViewById(R.id.btntarik);
        btntransfer = (Button) findViewById(R.id.btntransfer);
        btnexit = (Button) findViewById(R.id.btnexit);

        btntarik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PilihBank.this, Penarikan.class);
                startActivity(i);
            }
        });
        btnsetor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PilihBank.this, Penyetoran.class);
                startActivity(i);
            }
        });
    }
}

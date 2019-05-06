package com.app.saamisulaiman.sholatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tahajud, witir, rawatib, duha, istikharah, tahiyyatul, syuruk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tahajud = findViewById(R.id.tahajud);
        witir = findViewById(R.id.witir);
        rawatib = findViewById(R.id.rawatib);
        duha = findViewById(R.id.duha);
        istikharah = findViewById(R.id.istikharah);
        tahiyyatul = findViewById(R.id.tahiyyatul);
        syuruk = findViewById(R.id.syuruk);

        tahajud.setOnClickListener(this);
        witir.setOnClickListener(this);
        rawatib.setOnClickListener(this);
        duha.setOnClickListener(this);
        istikharah.setOnClickListener(this);
        tahiyyatul.setOnClickListener(this);
        syuruk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.tahajud:
                Intent gerak = new Intent(MainActivity.this , Deskripsi.class);
                gerak.putExtra("sunnah", "https://www.youtube.com/?hl=id&gl=ID");
                startActivity(gerak);
                break;

            case R.id.witir:
                Intent gerak2 = new Intent(MainActivity.this , Deskripsi.class);
                gerak2.putExtra("sunnah", "https://www.youtube.com/?hl=id&gl=ID");
                startActivity(gerak2);
                break;

            case R.id.rawatib:
                Intent gerak3 = new Intent(MainActivity.this , Deskripsi.class);
                gerak3.putExtra("sunnah", "https://www.youtube.com/?hl=id&gl=ID");
                startActivity(gerak3);
                break;

            case R.id.duha:
                Intent gerak4 = new Intent(MainActivity.this , Deskripsi.class);
                gerak4.putExtra("sunnah", "https://www.youtube.com/?hl=id&gl=ID");
                startActivity(gerak4);
                break;

            case R.id.istikharah:
                Intent gerak5 = new Intent(MainActivity.this , Deskripsi.class);
                gerak5.putExtra("sunnah", "https://www.youtube.com/?hl=id&gl=ID");
                startActivity(gerak5);
                break;

            case R.id.tahiyyatul:
                Intent gerak6 = new Intent(MainActivity.this , Deskripsi.class);
                gerak6.putExtra("sunnah", "https://www.youtube.com/?hl=id&gl=ID");
                startActivity(gerak6);
                break;

            case R.id.syuruk:
                Intent gerak7 = new Intent(MainActivity.this , Deskripsi.class);
                gerak7.putExtra("sunnah", "https://www.youtube.com/?hl=id&gl=ID");
                startActivity(gerak7);
                break;
        }
    }
}

package com.aji.userpc.ajirahmatmuhajir_1202154150_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //membuat objecct intent in,dengan method getIntent()
        Intent in = getIntent();

        //inisiasi variable
        int harga = in.getIntExtra("harga",0);
        int jumlah = in.getIntExtra("jumlah",0);
        int jumlahHarga = harga*jumlah;

        String namaMenu = in.getStringExtra("makanan");
        String tempatmakan = in.getStringExtra("tempatmakan");
        String toasttext = "Disini aja makan malamnya";

        TextView textView1 = findViewById(R.id.tempatMakan);
        TextView textView2 = findViewById(R.id.namaMenu);
        TextView textView3 = findViewById(R.id.jumlahPorsi);
        TextView textView4 = findViewById(R.id.jumlahHarga);

        //set value dari variable ke view
        textView1.setText(tempatmakan);
        textView2.setText(namaMenu);
        textView3.setText(""+jumlah);
        textView4.setText(""+jumlahHarga);

        //membuat toast
        if (jumlahHarga>60000){
            toasttext = "Jangan disini makan malamnya, uang kamu tidak cukup";
        }

        Toast toast = Toast.makeText(getApplicationContext(),toasttext,Toast.LENGTH_SHORT);
        toast.show();

    }
}

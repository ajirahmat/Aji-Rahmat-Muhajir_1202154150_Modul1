package com.aji.userpc.ajirahmatmuhajir_1202154150_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void pesanEatbus(View view) {

        //inisiasi variable
        EditText editText1 = findViewById(R.id.makanan);
        EditText editText2 = findViewById(R.id.jumlah);

        String makanan = editText1.getText().toString();
        String j = editText2.getText().toString();
        int jumlah = Integer.parseInt(j);


        Intent in = new Intent(this,SecondActivity.class );
        in.putExtra( "makanan",makanan);
        in.putExtra("jumlah",jumlah);
        in.putExtra("tempatmakan","Eetbus");
        in.putExtra("harga",50000);
        startActivity(in);

    }

    public void pesanAbnormal(View view) {

        //inisiasi variable
        EditText editText1 = findViewById(R.id.makanan);
        EditText editText2 = findViewById(R.id.jumlah);

        String makanan = editText1.getText().toString();
        String j = editText2.getText().toString();
        int jumlah = Integer.parseInt(j);


        Intent in = new Intent(this,SecondActivity.class );
        in.putExtra( "makanan",makanan);
        in.putExtra("jumlah",jumlah);
        in.putExtra("tempatmakan","Abnormal");
        in.putExtra("harga",30000);
        startActivity(in);

    }
}

package com.example.pertemuan9a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Txt_Nim;
    EditText Txt_Nama;
    EditText Txt_Kampus;
    TextView Lbl1;
    TextView Lbl2;
    TextView Lbl3;
    Button Btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Txt_Nim = findViewById(R.id.Txt_Nim);
        Txt_Nama = findViewById(R.id.Txt_Nama);
        Txt_Kampus = findViewById(R.id.Txt_Kampus);
        Lbl1 = findViewById(R.id.Lbl1);
        Lbl2 = findViewById(R.id.Lbl2);
        Lbl3 = findViewById(R.id.Lbl3);
        Btn1 = findViewById(R.id.Btn1);

    }

    public void getOK (View v){
        Lbl1.setText("Nim : "+Txt_Nim.getText());
        Lbl2.setText("Nama : "+Txt_Nama.getText());
        Lbl3.setText("Kampus : "+Txt_Kampus.getText());

    }
}

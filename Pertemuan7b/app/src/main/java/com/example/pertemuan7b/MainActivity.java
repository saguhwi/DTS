package com.example.pertemuan7b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText eTxt_Nama;
    Button bBtn1;
    TextView Lbl1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTxt_Nama = findViewById(R.id.Txt_Nama);
        bBtn1 = findViewById(R.id.Btn1);
        Lbl1 = findViewById(R.id.Lbl1);
    }
    public void getTampil (View v){
        Lbl1.setText("Nama Anda Adalah:"+eTxt_Nama.getText());
    }
}

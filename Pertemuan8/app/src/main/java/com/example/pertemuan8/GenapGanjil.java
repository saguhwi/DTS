package com.example.pertemuan8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GenapGanjil extends AppCompatActivity {

    EditText Txt_Bilangan;
    Button Btn_Hasil;
    TextView Lbl6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genap_ganjil);

        Txt_Bilangan = findViewById(R.id.Txt_Bilangan);
        Btn_Hasil = findViewById(R.id.Btn_Hasil);
        Lbl6 = findViewById(R.id.Lbl6);
    }
    public void getCek (View v){


        int masuk = Integer.parseInt(Txt_Bilangan.getText().toString());

        if((masuk % 2)== 0 ){
            Lbl6.setText("Nilai "+masuk+"Adalah Genap");
    }else {
            Lbl6.setText("Nilai "+masuk+"Adalah Ganjil");
        }

    }
}

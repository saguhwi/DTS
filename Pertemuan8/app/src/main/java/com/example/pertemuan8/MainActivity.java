package com.example.pertemuan8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Txt_Angka1, Txt_Angka2;
    Button Btn1, Btn2, Btn3, Btn4, Btn_Bersih;
    TextView Lbl1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Txt_Angka1 = findViewById(R.id.Txt_Angka1);
        Txt_Angka2 = findViewById(R.id.Txt_Angka2);
        Btn1 = findViewById(R.id.Btn_Hasil);
        Btn2 = findViewById(R.id.Btn2);
        Btn3 = findViewById(R.id.Btn3);
        Btn4 = findViewById(R.id.Btn4);
        Btn_Bersih = findViewById(R.id.Btn_Bersih);
        Lbl1 = findViewById(R.id.Lbl6);


    }
    public void getHasil (View v){
        if (Txt_Angka1.getText().length()>0&& Txt_Angka2.getText().length()>0){
            int input1 = Integer.parseInt(Txt_Angka1.getText().toString());
            int input2 = Integer.parseInt(Txt_Angka2.getText().toString());
            int hasil = input1 + input2;
            Lbl1.setText(Integer.toString(hasil));
        }else{
            Toast toast = Toast.makeText(getApplicationContext(), "Mohon Masukkan", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void getKurang (View v){
        if (Txt_Angka1.getText().length()>0&& Txt_Angka2.getText().length()>0){
            int input1 = Integer.parseInt(Txt_Angka1.getText().toString());
            int input2 = Integer.parseInt(Txt_Angka2.getText().toString());
            int hasil = input1 - input2;
            Lbl1.setText(Integer.toString(hasil));
        }else{
            Toast toast = Toast.makeText(getApplicationContext(), "Mohon Masukkan", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void getKali (View v){
        if (Txt_Angka1.getText().length()>0&& Txt_Angka2.getText().length()>0){
            int input1 = Integer.parseInt(Txt_Angka1.getText().toString());
            int input2 = Integer.parseInt(Txt_Angka2.getText().toString());
            int hasil = input1 * input2;
            Lbl1.setText(Integer.toString(hasil));
        }else{
            Toast toast = Toast.makeText(getApplicationContext(), "Mohon Masukkan", Toast.LENGTH_LONG);
            toast.show();
        }
    }



    public void getBagi (View v){
        if (Txt_Angka1.getText().length()>0&& Txt_Angka2.getText().length()>0){
            int input1 = Integer.parseInt(Txt_Angka1.getText().toString());
            int input2 = Integer.parseInt(Txt_Angka2.getText().toString());
            int hasil = input1 / input2;
            Lbl1.setText(Integer.toString(hasil));
        }else{
            Toast toast = Toast.makeText(getApplicationContext(), "Mohon Masukkan", Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void getBersih (View v){
        Txt_Angka1.setText(" ");
        Txt_Angka2.setText(" ");
        Lbl1.setText("0");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.menu1) {
            startActivity(new Intent(this, GenapGanjil.class));
        }
        return true;
    }

}

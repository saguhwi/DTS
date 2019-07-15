package com.example.pertemuan10a;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ExternalStorage extends AppCompatActivity implements View.OnClickListener {
    public static final String FILENAME = "namafile.txt";
    Button buatFile, ubahFile, bacaFile, hapusFile;
    TextView textBaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external_storage);
        buatFile = findViewById(R.id.Btn_Buat);
        ubahFile = findViewById(R.id.Btn_Ubah);
        bacaFile = findViewById(R.id.Btn_Baca);
        hapusFile = findViewById(R.id.Btn_Hapus);
        textBaca = findViewById(R.id.textBaca);

    }

    void buatFile(){
        String isiFile = "Coba Isi Data File Text";
        String Kondisi = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(Kondisi)){
            return;
        }
        File file = new File(getExternalFilesDir(null),FILENAME);

        FileOutputStream outputStream = null;
        try {
            file.createNewFile();
            outputStream = new FileOutputStream(file, true);
            outputStream.write(isiFile.getBytes());;
            outputStream.flush();
            outputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    void ubahFile(){
        String ubah = "Update Isi Data Text";
        File file = new File (getFilesDir(),FILENAME);

        FileOutputStream outputStream = null;
        try {
            file.createNewFile();
            outputStream = new FileOutputStream(file, false);
            outputStream.write(ubah.getBytes());;
            outputStream.flush();
            outputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    void bacaFile(){
        File sdcard = getFilesDir();
        File file = new File (sdcard, FILENAME);

        if (file.exists()){
            StringBuilder text = new StringBuilder();
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = br.readLine();
                while (line !=null){
                    text.append(line);
                    line = br.readLine();
                }
                br.close();
            } catch (IOException e) {
                System.out.println("Error"+e.getMessage());
            }
            textBaca.setText(text.toString());
        }


    }

    void hapusFile() {
        File file = new File(getFilesDir(),FILENAME);
        if (file.exists()){
            file.delete();
        }
    }

    @Override
    public void onClick (View v){jalankanPerintah(v.getId());}
    public void jalankanPerintah(int id){
        switch (id){
            case R.id.Btn_Buat:
                buatFile();
                break;
            case R.id.Btn_Baca:
                bacaFile();
                break;
            case R.id.Btn_Ubah:
                ubahFile();
                break;
            case R.id.Btn_Hapus:
                hapusFile();
                break;
        }
    }
}

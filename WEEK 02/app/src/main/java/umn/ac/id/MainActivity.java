package umn.ac.id;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
//import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

//Penambahan class-class yang harus diimport
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Deklarasi object(variabel) yang merepresentasikan komponen UI
    EditText angka1, angka2;
    TextView hasil;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Menghubungkan object(variabel) pada code java dengan object komponen UI pada layout .xml file
        angka1 = (EditText) this.findViewById(R.id.angka1);
        angka2 = (EditText) this.findViewById(R.id.angka2);
        hasil = (TextView) this.findViewById(R.id.hasil);
        btnTambah = (Button) this.findViewById(R.id.btnTambah);
        btnKurang = (Button) this.findViewById(R.id.btnKurang);
        btnKali = (Button) this.findViewById(R.id.btnKali);
        btnBagi = (Button) this.findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung(operator = '+');
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung(operator = '-');
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung(operator = '*');
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung(operator = '/');
            }
        });
    }

        protected void hitung ( char operator){
            if (angka1.getText().toString().isEmpty() || angka2.getText().toString().isEmpty()) {
                hasil.setText("Mohon masukkan angka dengan benar");
                return;
            }
            double operand1 = Double.parseDouble(angka1.getText().toString());
            double operand2 = Double.parseDouble(angka2.getText().toString());
            double result = 0.0;
            switch (operator) {
                case ('+'):
                    result = operand1 + operand2;
                    break;
                case ('-'):
                    result = operand1 - operand2;
                    break;
                case ('*'):
                    result = operand1 * operand2;
                    break;
                case ('/'):
                    result = operand1 / operand2;
                    break;
            }
            hasil.setText(String.valueOf(result));
    }
}
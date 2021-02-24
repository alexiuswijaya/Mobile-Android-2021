package umn.ac.id;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnHalaman1, btnHalaman2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHalaman1 = findViewById(R.id.main_button_change_1);
        btnHalaman2 = findViewById(R.id.main_button_change_2);

        btnHalaman1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentDua = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intentDua, 1);
            }
        });

        btnHalaman2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentDua = new Intent(MainActivity.this, ThirdActivity.class);
                startActivityForResult(intentDua, 1);
            }
        });


    }
}

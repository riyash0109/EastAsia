package com.example.eas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView i1,i2,i3,i4,i5,i6;
    private TextView t1,t2,t3,t4,t5,t6;
    private CardView cv1,cv2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv1 = (CardView) findViewById(R.id.china1);

        //calling the i1 function
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, ChinaActivity.class);
                startActivity(it);
            }
        });

        cv2 = (CardView) findViewById(R.id.japan1);
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, JapanActivity.class);
                startActivity(it);
            }
        });;
    }

}
package com.example.currenttimemillis;

import java.text.SimpleDateFormat;

import java.util.Date;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton img_btn;
    private TextView dateView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_btn=findViewById(R.id.img_btn);
        img_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long curtime = System.currentTimeMillis();
                Date date =new Date(curtime);

                SimpleDateFormat simpleDay = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat simpleTime = new SimpleDateFormat("HH:mm:ss");
                String getDay = simpleDay.format(date);
                String getTime = simpleTime.format(date);


                String getDate =getDay + "\n" + getTime;

                dateView = findViewById(R.id.dateView);
                dateView.setText(getDate);

            }
        });

    }
}
package com.example.androidflavours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Flavour_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flavour_info);


        int text = getIntent().getIntExtra("flavour_info",0);

        int img = getIntent().getIntExtra("flavour_img", 0);

        String name = getIntent().getStringExtra("flavour_name");


        TextView info_output = findViewById(R.id.info_about_flavour_text);
        info_output.setText(text);

        ImageView img_output = findViewById(R.id.info_about_flavour_img);
        img_output.setImageResource(img);

        setTitle(name);


    }
}
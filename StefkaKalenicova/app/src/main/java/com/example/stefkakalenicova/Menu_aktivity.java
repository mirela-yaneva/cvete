package com.example.stefkakalenicova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu_aktivity extends AppCompatActivity {

    ImageButton ImgBtnToDo3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__menu);

        ImgBtnToDo3 = (ImageButton)findViewById(R.id.ImgBtnToDo3);
        button  = (Button)findViewById(R.id.button);


        ImgBtnToDo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(Menu_aktivity.this, MainDom.class));
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(Menu_aktivity.this, MainActivity.class));
            }
        });

}
    }

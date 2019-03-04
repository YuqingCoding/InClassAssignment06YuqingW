package com.example.inclassassignment06_yuqingw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OwnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_own);

        Intent intent = getIntent();
        Animal a = (Animal)intent.getSerializableExtra(Keys.ANIMAL);

        TextView textView = findViewById(R.id.show_text_view);
        String b = "Animal Type/Name: "+a.getName()+"\nNumber of Legs: "+a.getLegs()+"\nDoes it have Fur? "+a.getHasFur()+"\nAny additional information: "+a.getInformation();
        textView.setText(b);

    }

}

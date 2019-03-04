package com.example.inclassassignment06_yuqingw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchActivity(View view){
        EditText nameField = findViewById(R.id.name_field);
        String name1 = nameField.getText().toString();

        EditText legsField = findViewById(R.id.legs_field);
        String legs1 = legsField.getText().toString();

        CheckBox hasFurCheckBox = findViewById(R.id.has_fur);
        boolean hasFur1 = hasFurCheckBox.isChecked();

        EditText informationField = findViewById(R.id.information_field);
        String information1 = informationField.getText().toString();


        Intent intent = new Intent(this,OwnActivity.class);
        Animal a = new Animal(name1,legs1,hasFur1,information1);
        intent.putExtra(Keys.ANIMAL,a);
        startActivity(intent);
    }
}

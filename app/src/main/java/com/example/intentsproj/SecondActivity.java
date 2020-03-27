package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private int Input1;
    private int Input2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        Input1 = extras.getInt("num1");
        Input2 = extras.getInt("num2");

        TextView textView1 = findViewById(R.id.editText);
        textView1.setText(Integer.toString(Input1));

        TextView textView2 = findViewById(R.id.editText2);
        textView2.setText(Integer.toString(Input2));
    }

    public void addition(View view) {
        int ans = Input1 +  Input2;

        TextView answertxt = findViewById(R.id.textView4);
        answertxt.setText(Integer.toString(Input1) + " + " + Integer.toString(Input2) + " = " + Integer.toString(ans));
    }

    public void subtractions(View view) {
        int ans = Input1 -  Input2;

        TextView answertxt = findViewById(R.id.textView4);
        answertxt.setText(Integer.toString(Input1) + " - " + Integer.toString(Input2) + " = " + Integer.toString(ans));
    }

    public void multiplication(View view) {
        int ans = Input1 *  Input2;

        TextView answertxt = findViewById(R.id.textView4);
        answertxt.setText(Integer.toString(Input1) + " * " + Integer.toString(Input2) + " = " + Integer.toString(ans));
    }

    public void division(View view) {
        int ans = Input1 /  Input2;

        TextView answertxt = findViewById(R.id.textView4);
        answertxt.setText(Integer.toString(Input1) + " / " + Integer.toString(Input2) + " = " + Integer.toString(ans));
    }
}
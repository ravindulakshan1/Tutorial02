package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button submit = (Button) findViewById(R.id.btnSubmit);
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                Bundle extras = new Bundle();

                EditText Input1 = (EditText) findViewById(R.id.editText);
                String num1 = Input1.getText().toString();
                EditText Input2 = (EditText) findViewById(R.id.editText2);
                String num2 = Input2.getText().toString();

                extras.putInt("num1", Integer.parseInt(num1));
                extras.putInt("num2", Integer.parseInt(num2));

                intent.putExtras(extras);

                Context context = getApplicationContext();

                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);

                toast.show();

                startActivity(intent);
            }
        });

    }

}
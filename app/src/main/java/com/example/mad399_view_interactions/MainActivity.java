package com.example.mad399_view_interactions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView answer = findViewById(R.id.textView_main_answer);
        final EditText firstInput = findViewById(R.id.editText_main_firstInput);
        final EditText secondInput = findViewById(R.id.editText_main_secondInput);
        Button buttonAdd = findViewById(R.id.button_main_add);
        Button buttonSubtract = findViewById(R.id.button_main_subtract);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstNumber = Double.parseDouble(firstInput.getText().toString());
                double secondNumber = Double.parseDouble(secondInput.getText().toString());

                double sum = firstNumber + secondNumber;

                answer.setText(String.valueOf(sum));
            }
        });
    }
}
package com.example.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.Model.Model;


public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;

    Model model = new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        editText = findViewById(R.id.plain_text_input);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            changeText(textView);
            }
        });
    }


    public void changeText(View view) {

        model.setText(editText.getText().toString());
        textView.setText(model.getText());
    }

}
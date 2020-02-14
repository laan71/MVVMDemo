package com.example.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // TODO: Husk at gøre fields private som udgangspunkt
    TextView textView;
    EditText editText;
    Button button;

    // TODO 3: Lav et field til at indeholde en instans af Model

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
        String inputText = textView.getText().toString();
        // TODO 4: inputText skal gemmes i instansen af Model som blev lavet i (3)
        
        // TODO 5: editText skal opdateres med data fra instansen af Model som blev lavet i (3) 
        //         i stedet for at bruge inputText direkte
        editText.setText(inputText);
    }


}

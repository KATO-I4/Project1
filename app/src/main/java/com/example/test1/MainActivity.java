package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.buttonChangeMessage);
        button.setOnClickListener(new MyOnClickListener());


    }

    class MyOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            TextView text = findViewById(R.id.textView2);
            text.setText("次のページ");

        }
    }
}
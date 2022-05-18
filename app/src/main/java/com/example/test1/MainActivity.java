package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//画面遷移用
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //画面遷移用のボタン
        Button changeButton = findViewById(R.id.change_btn1);

        //ボタン押下時
        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reviewupに画面遷移
                Intent intent = new Intent(getApplication(), reviewup.class);
                startActivity(intent);
            }

        });

    }

}
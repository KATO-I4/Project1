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

        //レビュー投稿への画面遷移用のボタン
        Button changeButton1 = findViewById(R.id.change_btn1);

        //ボタン押下時
        changeButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //loginに画面遷移
                Intent intent = new Intent(getApplication(), Login.class);
                startActivity(intent);
            }

        });

        //ランキングへの画面遷移用のボタン
        Button changeButton2 = findViewById(R.id.change_btn2);

        //ボタン押下時
        changeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Rankingに画面遷移
                Intent intent = new Intent(getApplication(), Ranking.class);
                startActivity(intent);
            }

        });

        //お問い合わせへの画面遷移用のボタン
        Button changeButton3 = findViewById(R.id.change_btn3);

        //ボタン押下時
        changeButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Contactに画面遷移
                Intent intent = new Intent(getApplication(), Contact.class);
                startActivity(intent);
            }

        });

        //ランキングへの画面遷移用のボタン
        Button changeButton4 = findViewById(R.id.change_btn4);

        //ボタン押下時
        changeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Reviewinspectionに画面遷移
                Intent intent = new Intent(getApplication(), Reviewinspection.class);
                startActivity(intent);
            }

        });

        //おすすめへの画面遷移用のボタン
        Button changeButton = findViewById(R.id.change_btn);

        //ボタン押下時
        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recommendに画面遷移
                Intent intent = new Intent(getApplication(), Recommend.class);
                startActivity(intent);
            }

        });

    }

}
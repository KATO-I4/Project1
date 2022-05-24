package com.example.test1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Reviewinspection  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //reviewinspectionレイアウトをセット
        setContentView(R.layout.reviewinspection);

        Button returnButton = findViewById(R.id.return_btn);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //レビュー詳細への画面遷移用のボタン
        Button Button_to_Read = findViewById(R.id.button_to_read);

        //ボタン押下時
        Button_to_Read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //readに画面遷移

                Intent intent = new Intent(getApplication(), Read.class);
                startActivity(intent);
            }

        });
    }

}

package com.example.test1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class FinishSend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //loginレイアウトをセット
        setContentView(R.layout.finish_send);

        Button returnButton = findViewById(R.id.return_btn);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //レビュー詳細への画面遷移用のボタン
        Button Button_to_Top = findViewById(R.id.button_to_top);

        //ボタン押下時
        Button_to_Top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //readに画面遷移

                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
            }

        });
    }

}

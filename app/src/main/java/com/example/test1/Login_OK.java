package com.example.test1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Login_OK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //loginレイアウトをセット
        setContentView(R.layout.login_ok);

        Button returnButton = findViewById(R.id.return_btn);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //レビュー詳細への画面遷移用のボタン
        Button Button_to_QR = findViewById(R.id.button3);

        //ボタン押下時
        Button_to_QR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //readに画面遷移

                Intent intent = new Intent(getApplication(), Read.class);
                startActivity(intent);
            }

        });
    }

}

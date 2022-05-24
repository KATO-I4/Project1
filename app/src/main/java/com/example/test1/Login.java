package com.example.test1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //loginレイアウトをセット
        setContentView(R.layout.login);

        Button returnButton = findViewById(R.id.return_btn);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //レビュー詳細への画面遷移用のボタン
        Button Button_to_Login = findViewById(R.id.sign_in_btn);

        //ボタン押下時
        Button_to_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //login_ok遷移
                Intent intent = new Intent(getApplication(), Login_OK.class);
                startActivity(intent);
            }

        });
    }

}
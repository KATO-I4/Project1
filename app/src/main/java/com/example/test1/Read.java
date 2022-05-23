package com.example.test1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Read  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //reviewinspectionレイアウトをセット
        setContentView(R.layout.read);

        Button returnButton = findViewById(R.id.return_btn);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        Button Change_Button1 = findViewById(R.id.change_btn1);
        Change_Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //readに画面遷移
                setContentView(R.layout.activity_main);
            }
        });
    }

}

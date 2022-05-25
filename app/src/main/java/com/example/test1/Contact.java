package com.example.test1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//入力チェック用

public class Contact  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //contactレイアウトをセット
        setContentView(R.layout.contact);

        //入力チェック
        /*
        final EditText editText = findViewById(R.id.edit_text);

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean flag) {
                if(!flag){
                    String str = editText.getText().toString().trim();
                    if(!str.matches("^[0-2]{2}[0-9]{2}[0-1]{1}[1-9]{1}[0-3]{1}[1-9]{1}$")){
                        Toast toast = Toast.makeText(Contact.this,"正しい入力値を入れてください",Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
            }
        });
        */

        Button Send_Firebase = findViewById(R.id.button_to_top);
        Send_Firebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), FinishSend.class);
                startActivity(intent);
            }


        });

        //戻る

        Button returnButton = findViewById(R.id.return_btn);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

}

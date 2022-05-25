package com.example.test1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Reviewup  extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //reviewupレイアウトをセット
        setContentView(R.layout.reviewup);

        // Adapterの作成
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Adapterにアイテムを追加
        adapter.add("red");
        adapter.add("green");
        adapter.add("blue");
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

// SpinnerにAdapterを設定
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner spinner = (Spinner) parent;
                // 選択したアイテムを取得
                String item = (String) spinner.getSelectedItem();

                // ログで確認
                Log.v("spinner item", item);
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {// アイテムを選択しなかったとき
            }
        });


        Button Send_Firebase = findViewById(R.id.button9);
        Send_Firebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), Read.class);
                startActivity(intent);
            }
        });

        Button returnButton = findViewById(R.id.return_btn);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }




}

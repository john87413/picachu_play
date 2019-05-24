package com.example.picachu2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        Button btStart = findViewById(R.id.begin);
        btStart.setOnClickListener(start);
    }

    private Button.OnClickListener start = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent gameStart = new Intent();
            gameStart.setClass(MainActivity.this,GameSpace.class);
            startActivity(gameStart);
        }
    };
}

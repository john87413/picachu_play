package com.example.picachu2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameSpace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_space);
    }

    private Button.OnClickListener mvLeft = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    private Button.OnClickListener mvRight = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    private Button.OnClickListener mvTop = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}

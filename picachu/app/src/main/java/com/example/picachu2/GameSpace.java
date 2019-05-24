package com.example.picachu2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class GameSpace extends AppCompatActivity {

    private ImageView iv_self,iv_enemy;
    private ImageButton ibt_left,ibt_right,ibt_top,ibt_bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_space);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        iv_self = findViewById(R.id.pica_left);
        iv_enemy = findViewById(R.id.pica_right);
        ibt_top = findViewById(R.id.bt_top);
        ibt_bottom = findViewById(R.id.bt_bottom);
        ibt_left = findViewById(R.id.bt_left);
        ibt_right = findViewById(R.id.bt_right);

        ibt_left.setOnClickListener(mvLeft);
    }

    private Button.OnClickListener mvLeft = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            System.out.println("self X" + iv_self.getX());
            System.out.println("self Y" + iv_self.getY());
            System.out.println("enemy X" + iv_enemy.getX());
            System.out.println("enemy X" + iv_enemy.getY());
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

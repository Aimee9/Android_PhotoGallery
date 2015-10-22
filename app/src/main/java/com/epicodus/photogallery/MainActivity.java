package com.epicodus.photogallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton mWildlifeButton;
    private ImageButton mSceneryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSceneryButton = (ImageButton) findViewById(R.id.sceneryButton);
        mWildlifeButton = (ImageButton)findViewById(R.id.wildlifeButton);

        mSceneryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SceneryActivity.class);
                startActivity(intent);
            }
        });

        mWildlifeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WildlifeActivity.class);
                startActivity(intent);
            }
        });
    }


}

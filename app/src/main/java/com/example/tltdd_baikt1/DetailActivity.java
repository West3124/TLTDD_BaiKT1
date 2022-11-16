package com.example.tltdd_baikt1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            TextView detail_level_info = (TextView) findViewById(R.id.detail_username);
            String level = extras.getString("level");
            TextView detail_username = (TextView) findViewById(R.id.detail_level_info);
            detail_username.setText(name);
            detail_level_info.setText(level);
        }
    }
}

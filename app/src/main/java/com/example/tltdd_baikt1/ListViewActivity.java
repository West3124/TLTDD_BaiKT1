package com.example.tltdd_baikt1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {
    private ListView listView;
    private String[] names = {"Nguyễn Văn A", "Nguyễn Văn B", "Nguyễn Văn C"};
    private String[] level = {"Thiếu Tá", "Trung Tá", "Đại Úy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_activity);

        Adapter itemsAdapter = new Adapter(this, names, level);

        listView = (ListView) findViewById(R.id.list_cops);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent detail = new Intent(ListViewActivity.this, DetailActivity.class);
                detail.putExtra("name", String.valueOf(itemsAdapter.getItem(i)));
                detail.putExtra("level", String.valueOf(itemsAdapter.getLevel(i)));
                ListViewActivity.this.startActivity(detail);
            }
        });
    }
}

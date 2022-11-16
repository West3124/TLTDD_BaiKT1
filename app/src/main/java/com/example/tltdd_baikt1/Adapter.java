package com.example.tltdd_baikt1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {
    private Activity activity;
    private String[] names;
    private String[] levels;

    public Adapter(Activity activity, String[] names, String[] levels) {
        this.activity = activity;
        this.names = names;
        this.levels = levels;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return names[i];
    }

    public Object getLevel(int i) {
        return levels[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.item, null);
        TextView tvName = (TextView) view.findViewById(R.id.item_name);
        tvName.setText(names[i]);
        TextView  tvDescription = (TextView) view.findViewById(R.id.item_level);
        tvDescription.setText(levels[i]);
        return view;
    }
}

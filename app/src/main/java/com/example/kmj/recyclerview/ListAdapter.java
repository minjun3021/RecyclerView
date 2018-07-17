package com.example.kmj.recyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseAdapter {
    public List<String> list = new ArrayList<>();

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.item_main, parent, false);
        TextView textView = v.findViewById(R.id.text_main);
        TextView subView = v.findViewById(R.id.text_sub);
        textView.setText(list.get(i));
        subView.setText(i + "");
        Log.d("good",i+" 번째 아이템 입니다.");
        return v;
    }
}

package com.example.kmj.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    ListView list;
    ListAdapter mAdapter;
    List<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.main_list);
        mAdapter = new ListAdapter();
        list.setAdapter(mAdapter);
        for(int i=1; i<=30; i++){
            mAdapter.list.add(i+" 번째 아이템");
        }


    }
}

package com.example.kmj.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    List<String> list=new ArrayList<>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v=inflater.inflate(R.layout.item_main,parent,false);
        ViewHolder viewholder=new ViewHolder(v);
        Log.d("good","view holder create");
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.text.setText(list.get(position));
        holder.subtext.setText(position+"번째");
        Log.d("good",position+" 번째 텍스트 넣기");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        TextView subtext;
        public ViewHolder(View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.text_main);
            subtext=itemView.findViewById(R.id.text_sub);
        }
    }
}

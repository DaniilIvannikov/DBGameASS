package ru.samsung.itschool.dbgame;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumbersRVAdapter extends RecyclerView.Adapter<NumbersRVAdapter.ViewHolder>{
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            this.textView = itemView.findViewById(android.R.id.text1);
        }

    }


    @NonNull
    @Override
    public NumbersRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, null);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NumbersRVAdapter.ViewHolder holder, int position) {
        String numberStr = position + 1 + "";
        TextView textView = holder.textView;
        TextView.setText(numberStr);
        if(numberStr.contains("3")){
            textView.setTextSize(30);
            textView.setTextColor(Color.RED);
        }
        else{
            textView.setTextSize(20);
            textView.setTextColor(Color.BLACK);
        }
    }

    @Override
    public int getItemCount() {
        return 100000;
    }
}

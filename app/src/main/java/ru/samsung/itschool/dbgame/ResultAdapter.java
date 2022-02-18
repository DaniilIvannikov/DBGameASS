package ru.samsung.itschool.dbgame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultAdapter extends BaseAdapter {

    ArrayList<Result> results;
    Context context;

    public ResultAdapter(Context context, ArrayList<Result> results){
        this.results = results;
        this.context = context;
    }


    @Override
    public int getCount() {
        return results.size();
    }

    @Override
    public Object getItem(int position) {
        return results.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_2, null);
        TextView nameTV = view.findViewById(android.R.id.text1);
        nameTV.setText(results.get(position).name);
        TextView scoreTV = view.findViewById(android.R.id.text1);
        scoreTV.setText(results.get(position).score +"");
        return view;
    }
}

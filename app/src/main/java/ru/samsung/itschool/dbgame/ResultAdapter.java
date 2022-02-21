package ru.samsung.itschool.dbgame;

import android.content.Context;
import android.graphics.Color;
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

    public ResultAdapter(MainActivity context) {

    }


    @Override
    public int getCount() {
        return results.size();
    }

    @Override
    public Object getItem(int position) {
        return position = 0;
    }

    @Override
    public long getItemId(int position) {
        return position + 1;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        class ViewHolder{
            TextView textView;
            public ViewHolder(TextView textView){
               this.textView = textView;
            }

        }

        if (convertView == null){
            convertView = LayoutInflater.from(context.getApplicationContext()).inflate(android.R.layout.simple_list_item_1, null);
            TextView TV = convertView.findViewById(android.R.id.text1);
            convertView.setTag(new ViewHolder(TV));
        }

        TextView numberTV = ((ViewHolder) (convertView.getTag())).textView;
        String string = position + "";
        String strNum = null;
        numberTV.setText(strNum);
        if (strNum.contains("3")){
            numberTV.setTextColor(Color.RED);
            numberTV.setTextSize(30);
        }
        else{
            numberTV.setTextColor(Color.BLACK);

        }

        return convertView;
    }
}

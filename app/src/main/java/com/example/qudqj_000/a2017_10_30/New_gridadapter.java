package com.example.qudqj_000.a2017_10_30;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by qudqj_000 on 2017-10-30.
 */

public class New_gridadapter extends BaseAdapter {
    Context context;
    ArrayList<News_Data> data = new ArrayList<>();

    New_gridadapter(Context context, ArrayList<News_Data> data){
        this.context = context;
        this.data = data;
    }
    @Override
    public int getCount() {
        return data.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.new_gridview,null);
        }
        ImageView iv1 = (ImageView)convertView.findViewById(R.id.news_image);
        TextView tv1 = (TextView)convertView.findViewById(R.id.news_title);
        iv1.setImageResource(data.get(position).getNews_img());
        tv1.setText(data.get(position).getNews_title());

        return convertView;
    }
}

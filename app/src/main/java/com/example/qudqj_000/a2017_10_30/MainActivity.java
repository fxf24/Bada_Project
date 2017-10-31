package com.example.qudqj_000.a2017_10_30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gv1;
    ArrayList<News_Data> data = new ArrayList<>();
    New_gridadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    void init(){
        gv1 = (GridView)findViewById(R.id.grid_view);
        data.add(new News_Data(R.mipmap.ic_launcher, "title1", "html"));
        data.add(new News_Data(R.mipmap.ic_launcher, "title2", "html"));
        data.add(new News_Data(R.mipmap.ic_launcher, "title3", "html"));
        data.add(new News_Data(R.mipmap.ic_launcher, "title4", "html"));

        adapter = new New_gridadapter(this, data);

        gv1.setAdapter(adapter);
    }
}

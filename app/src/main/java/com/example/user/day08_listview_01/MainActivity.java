package com.example.user.day08_listview_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView show;
    private int mItemLayou;//条目布局
   private ArrayList<String> mData; //数据源
   private ArrayAdapter mAdapter; //适配器
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show= (ListView) findViewById(R.id.listview);
        mItemLayou=R.layout.item_list;
        mData = new ArrayList<String>();
        for(int i=0;i<100;i++){
            mData.add("数据源===="+i);
        }
        mAdapter = new ArrayAdapter(
                this,//应用程序上下文
                 mItemLayou,//条目布局
                 R.id.item_1,//绑定数据的控件ID
                 mData//数据源
                );
        //绑定数据源
        show.setAdapter(mAdapter);
        show.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

package com.gjun.listview_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] func = {"餘額查詢", "交易明細", "最新消息", "投資理財", "離開"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list =(ListView)findViewById(R.id.list);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,func);
        list.setAdapter(adapter);

    }
}

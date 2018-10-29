package com.li002.testapplication.feature;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListTest extends AppCompatActivity {
    private String[] data={"WI-FI","Bluetooth","storage","developer","app manager"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_test);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ListTest.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.list_test);
        listView.setAdapter(adapter);
    }
}


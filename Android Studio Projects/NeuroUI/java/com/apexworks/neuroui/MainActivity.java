package com.apexworks.neuroui;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Instagram");
        list.add("Telegram");
        list.add("Facebook");
        list.add("Snapchat");

        // Use the custom layout for the list items
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.list_item, list);
        listView.setAdapter(arrayAdapter);
    }
}

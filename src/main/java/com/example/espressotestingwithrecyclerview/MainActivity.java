package com.example.espressotestingwithrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ContentAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final ArrayList<ContentItem> contentList = new ArrayList<>();
        contentList.add(new ContentItem(R.drawable.bus, "Bus", "Travelling by bus is a cheaper way but takes long time"));
        contentList.add(new ContentItem(R.drawable.train, "Train", "Travelling by train is cheaper and faster way than bus"));
        contentList.add(new ContentItem(R.drawable.plane, "Plane", "Plane is expensive and fastest way to travel"));
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new ContentAdapter(contentList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        adapter.setOnItemClickListener(new ContentAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {

                Toast.makeText(MainActivity.this, contentList.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

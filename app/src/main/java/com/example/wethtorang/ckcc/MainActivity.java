package com.example.wethtorang.ckcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("កំនាព្យខ្មែរ");
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
        ArrayList<Layout> layouts = new ArrayList<>();
        Layout layout1 = new Layout("បទពាក្យប្រាំពី");
        Layout layout2 = new Layout("បទពាក្យបូន");
        Layout layout3 = new Layout("បទព្រហ្មគិត");
        Layout layout4 = new Layout("បទភុជុង្គលីលា");
        Layout layout5 = new Layout("បង្កើតកំនាព្យថ្មី");
        Layout layout6 = new Layout("ចែករំលែក");
        layouts.add(layout2);
        layouts.add(layout3);
        layouts.add(layout1);
        layouts.add(layout4);
        layouts.add(layout5);
        layouts.add(layout6);

        LayoutAdapter layoutAdapter = new LayoutAdapter(layouts,this);
        recyclerView.setAdapter(layoutAdapter);
        recyclerView.setHasFixedSize(true);

    }
}

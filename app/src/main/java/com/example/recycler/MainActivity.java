package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //declare variable
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //take the data
        initData  ();

        //insert inside recycler view
        initRecyclerView ();




    }

    private void initData() {

        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.ic_launcher_background, "Name", "10.45 AM", "ajhskjn", "________________"));
        userList.add(new ModelClass(R.drawable.ic_launcher_foreground, "Name1", "11.45 AM", "###########", "________________"));
        userList.add(new ModelClass(R.drawable.ic_launcher_background, "Name2", "22.45 AM", "@@@@@@@@@@", "________________"));
        userList.add(new ModelClass(R.drawable.ic_launcher_foreground, "Name3", "13.45 AM", "!!!!!!!!!", "________________"));
        userList.add(new ModelClass(R.drawable.ic_launcher_background, "Name4", "34.45 AM", "%%%%%%%%%%%", "________________"));
        userList.add(new ModelClass(R.drawable.ic_launcher_foreground, "Name5", "67.45 AM", "@#$%!@#$@", "________________"));
        userList.add(new ModelClass(R.drawable.ic_launcher_background, "Name6", "90.45 AM", "AAAAAAAAAAA", "________________"));
        userList.add(new ModelClass(R.drawable.ic_launcher_foreground, "Name7", "88.45 AM", "QQQQQQQQQQQ", "________________"));
        userList.add(new ModelClass(R.drawable.ic_launcher_background, "Name8", "66.45 AM", "ZZZZZZZZZZZZZ", "________________"));


    }


    private void initRecyclerView() {

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter (userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
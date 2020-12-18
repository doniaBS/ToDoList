package com.donia.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    RecyclerView  mRecyclerView;

    ArrayList<getter_setter> ToDoList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        mRecyclerView = findViewById(R.id.rv_home);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Adapter adapter = new Adapter(getMyList(),getApplicationContext());
        mRecyclerView.setAdapter(new Adapter(getMyList(),getApplicationContext()));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }

    private ArrayList<getter_setter> getMyList(){



        ToDoList.add(new getter_setter("Home","this is home description..",R.drawable.home_icon));
        ToDoList.add(new getter_setter("Study","this is study description..",R.drawable.study_icon));

        ToDoList.add(new getter_setter("Supermarket","this is supermarket description..",R.drawable.supermarket_icon));

        ToDoList.add(new getter_setter("Friends","this is friends description..",R.drawable.friends_icon));
        ToDoList.add(new getter_setter("Family","this is family description..",R.drawable.family_icon));





        return ToDoList;
    }
}
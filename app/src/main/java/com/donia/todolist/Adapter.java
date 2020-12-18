package com.donia.todolist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ToDoViewHolder> {
    ArrayList<getter_setter> ToDoList;
    Context context;



    public Adapter(ArrayList<getter_setter> ToDoList, Context context)
    {
        this.ToDoList=ToDoList;
        this.context=context;
    }


    @NonNull
    @Override
    public Adapter.ToDoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        ToDoViewHolder todoviewholder=new ToDoViewHolder(view);
        return todoviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ToDoViewHolder holder, int position) {
        getter_setter todo=ToDoList.get(position);
        holder.img_todo.setImageResource(todo.getIcon());
        holder.tv_title.setText(todo.getTitle());
        holder.tv_detail.setText(todo.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Details.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return ToDoList.size();
    }


    public static  class ToDoViewHolder extends RecyclerView.ViewHolder {
        ImageView img_todo;
        TextView tv_title,tv_detail;

        public ToDoViewHolder(@NonNull View itemView) {
            super(itemView);
            img_todo=itemView.findViewById(R.id.iv_home);
            tv_title=itemView.findViewById(R.id.tv_home);
            tv_detail=itemView.findViewById(R.id.tv_d_home);
        }
    }
}

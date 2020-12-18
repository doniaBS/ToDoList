package com.donia.todolist;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    ImageView ImgView;
    TextView textTitle, textDetail;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.ImgView = itemView.findViewById(R.id.iv_home);
        this.textTitle = itemView.findViewById(R.id.tv_home);
        this.textDetail = itemView.findViewById(R.id.tv_d_home);
    }
}

package com.example.kino;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MiastaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView nazwa;
    private ItemclickListener itemClickListener;

    public  MiastaViewHolder(@NonNull View itemView)
    {
        super(itemView);
        nazwa = (TextView) itemView.findViewById(R.id.nazwa_miasta);

        itemView.setOnClickListener(this);

    }
    public void setItemClickListener(ItemclickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view, getAdapterPosition(), false);
    }
}

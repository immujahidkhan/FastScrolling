package com.justclack.fastscrolling;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;



public class StateViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView location;

    public StateViewHolder(View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.name);
        location = itemView.findViewById(R.id.location);
    }
}
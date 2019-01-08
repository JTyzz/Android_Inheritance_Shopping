package com.meterstoinches.earthdefensesystem.android_inheritance_shopping;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoppingItemAdapter extends RecyclerView.Adapter<ShoppingItemAdapter.ViewHolder> {
    static class ViewHolder extends RecyclerView.ViewHolder {
         TextView itemName, itemDetails;
         ViewGroup parentView;

         public ViewHolder(@NonNull View itemView){
             super(itemView);

             itemName = itemView.findViewById(R.id.item_element_name);
             itemDetails = itemView.findViewById(R.id.item_element_details);
             parentView = itemView.findViewById(R.id.item_element_layout);
         }
    }

    private ArrayList<ShoppingItem> dataList;
    private Context context;
    private Activity activity;

    ShoppingItemAdapter(ArrayList<ShoppingItem> dataList, Activity activity) {
        this.dataList = dataList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            context = viewGroup.getContext();
            View view = LayoutInflater.from(viewGroup.getContext()).
                    inflate(R.layout.item_element_layout, viewGroup, false);
            return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final ShoppingItem data = dataList.get(i);

        viewHolder.itemName.setText(data.getItemName());
        viewHolder.parentView.setBackgroundColor(data.getColorID());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
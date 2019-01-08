package com.meterstoinches.earthdefensesystem.android_inheritance_shopping;

import android.graphics.Color;

public class Dogs extends ShoppingItem{
    private static final int color = Color.CYAN;

    public Dogs(String item){
        super(item, color);
    }

    @Override
    public String getItemName(){
        return "A whole mound of dogs.";
    }
}


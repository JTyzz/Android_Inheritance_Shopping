package com.meterstoinches.earthdefensesystem.android_inheritance_shopping;

import android.graphics.Color;

public class Hats extends ShoppingItem{
    private static final int color = Color.RED;

    public Hats(String item){
        super(item, color);
    }

    @Override
    public String getItemName(){
        return "A whole pile of hats.";
    }
}

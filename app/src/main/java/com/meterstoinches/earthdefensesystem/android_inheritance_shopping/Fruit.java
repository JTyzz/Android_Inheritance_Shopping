package com.meterstoinches.earthdefensesystem.android_inheritance_shopping;

import android.graphics.Color;

public class Fruit extends ShoppingItem{
    private static final int color = Color.BLUE;

    public Fruit(String item){
        super(item, color);
    }

    @Override
    public String getItemName(){
        return "A whole mountain of fruit.";
    }
}


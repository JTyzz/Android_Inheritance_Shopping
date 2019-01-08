package com.meterstoinches.earthdefensesystem.android_inheritance_shopping;

public class ShoppingItem {
    String item;
    int colorId;

    protected ShoppingItem(String item, int colorId) {
        this.item = item;
        this.colorId = colorId;
    }

    public String getItemName() {
        return this.item;
    }

    public int getColorID() {
        return colorId;
    }
}

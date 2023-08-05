package com.example.thehungrydeveloper;

import androidx.annotation.NonNull;

public class Dish {

    String title;
    String Description;
    int price;

    Dish(String title,String description,int price){
        this.title=title;
        this.Description =description;
        this.price=price;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}

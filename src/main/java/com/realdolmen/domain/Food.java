package com.realdolmen.domain;

public class Food {
    //TODO: add id and foodName fields + constructor + getters
    private int id;
    private String foodName;

    public Food(int id, String foodName) {
        this.id = id;
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Food{ id= " + id + ", foodName= " + foodName + '}';
    }
}

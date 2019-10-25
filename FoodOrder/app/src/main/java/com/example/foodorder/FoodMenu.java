package com.example.foodorder;

public class FoodMenu {


    private int foodID;
    private String foodName;
    private String foodCost;
    private String foodDescription;
    private int imageDrawableId;


    public FoodMenu(int foodID, String foodName, String foodCost, String foodDescription, int imageDrawableId) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.foodCost = foodCost;
        this.foodDescription = foodDescription;
        this.imageDrawableId = imageDrawableId;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(String foodCost) {
        this.foodCost = foodCost;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }
}

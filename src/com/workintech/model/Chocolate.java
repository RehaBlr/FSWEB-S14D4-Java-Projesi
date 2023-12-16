package com.workintech.model;

public class Chocolate extends ProductForSale{
    private int calorie;

    public Chocolate(String type, double price, String description, int calorie) {
        super(type, price, description);
        this.calorie = calorie;
    }

    @Override
    public void showDetails() {
        System.out.println("this is a chocolate " + "\n");
        System.out.printf("type: " + this.getType() + "\n");
        System.out.printf("price: " + this.getPrice() + "\n");
        System.out.printf("description " + this.getDescription() + "\n");
        System.out.println("Calorie: " + this.getCalorie() + "\n");
    }

    public int getCalorie() {
        return calorie;
    }

}

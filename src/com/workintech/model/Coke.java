package com.workintech.model;
public class Coke extends ProductForSale {
    private int sugarRate;

    public Coke(String type, double price, String description,int sugarRate) {
        super(type, price, description);
        this.sugarRate=sugarRate;
    }

    public int getSugarRate() {
        return sugarRate;
    }

    @Override
    public void showDetails() {
        System.out.printf("this is a coke " + "\n");
        System.out.printf("type: " + this.getType() + "\n");
        System.out.printf("price: " + this.getPrice() + "\n");
        System.out.printf("description " + this.getDescription() + "\n");
        System.out.println("SugarRate: " + this.getSugarRate() + "\n");
    }
}

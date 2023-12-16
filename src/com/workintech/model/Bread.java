package com.workintech.model;

public class Bread extends ProductForSale {
    private String flour;

    public Bread(String type, double price, String description,String flour) {
        super(type, price, description);
        this.flour=flour;
    }

    public String getFlour() {
        return flour;
    }

    @Override
    public void showDetails() {
        System.out.printf("this is a bread " + "\n");
        System.out.printf("type: " + this.getType() + "\n");
        System.out.printf("price: " + this.getPrice() + "\n");
        System.out.printf("description " + this.getDescription() + "\n");
        System.out.println("Flour: " + this.getFlour() + "\n");

//        String result = super.toString();
//        StringBuilder builder = new StringBuilder();
//        builder.append("FlourType:"+flour+"\n");
//        builder.append("FlourType:"+flour+"\n");

    }
}

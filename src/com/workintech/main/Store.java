package com.workintech.main;

import com.workintech.model.Bread;
import com.workintech.model.Chocolate;
import com.workintech.model.Coke;
import com.workintech.model.ProductForSale;

public class Store {
    public static void main(String[] args) {

        ProductForSale []  products = new ProductForSale[10];
        products[0]=new Bread("home",30,"bread baked in straw","brown");
        products[1]=new Chocolate("bitter",20,"Ülker",1200);
        products[2]=new Coke("medium",45,"Pepsi",80);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null) {
            for (ProductForSale product : products) {
                if (product != null) {
                    product.showDetails();
//                product.getPrice();
//                System.out.println("price with sale:" + product.getSalesPrice(5));

                }
            }
        }else{
            System.out.println("products can't be null");
        }
    }
}
package com.softserve.TASK.Conditions.n4;

public class Product {

    private String name;
    private int price;
    private int quantity;

    public Product() {

    }

    public Product(String name, int price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }

    public Product mostExpensiveProduct(Product product1, Product product2, Product product3, Product product4) {

        if ((product1.getPrice() > product2.getPrice()) && (product1.getPrice() > product3.getPrice())
                && (product1.getPrice() > product4.getPrice())) {
            return product1;
        } else if ((product2.getPrice() > product3.getPrice()) && product2.getPrice() > product4.getPrice()) {
            return product2;
        } else if (product3.getPrice() > product4.getPrice()) {
            return product3;
        } else {
            System.out.println("The most expensive product is " + product4.getName());
        }

        return product4;
    }

    public void biggestQuantityProduct(Product product1, Product product2, Product product3, Product product4) {

        if ((product1.getQuantity() > product2.getQuantity()) && (product1.getQuantity() > product3.getQuantity())
                && (product1.getQuantity() > product4.getQuantity())) {
            System.out.println("The biggest quantity of product is " + product1.getName());
        } else if ((product2.getQuantity() > product3.getQuantity())
                && product2.getQuantity() > product4.getQuantity()) {
            System.out.println("The biggest quantity of product is " + product2.getName());
        } else if (product3.getQuantity() > product4.getQuantity()) {
            System.out.println("The biggest quantity of product is " + product3.getName());
        } else {
            System.out.println("The biggest quantity of product is " + product4.getName());
        }

    }

}


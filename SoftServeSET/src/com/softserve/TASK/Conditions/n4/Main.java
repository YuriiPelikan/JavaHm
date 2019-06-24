package com.softserve.TASK.Conditions.n4;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("computer", 15000, 7);
        Product product2 = new Product("TV", 9000, 5);
        Product product3 = new Product("Phone", 5000, 18);
        Product product4 = new Product("car", 200000, 2);

        product1.mostExpensiveProduct(product1, product2, product3, product4);

        product1.biggestQuantityProduct(product1, product2, product3, product4);

    }

}
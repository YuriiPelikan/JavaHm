package com.softserve.HOMEWORK.Inheritance.n1;

public class Main {
    public static void main(String[] args) {
        Bird[] br = new Bird[4];
        br[0] = new Eagle(true, false);
        br[1] = new Swallow(true, false);
        br[2] = new Penguin(true, false);
        br[3] = new Chicken(true, false);


        for (int i = 0; i < br.length; i++) {
            System.out.println(br[i]);
            br[i].fly();
        }

    }
}

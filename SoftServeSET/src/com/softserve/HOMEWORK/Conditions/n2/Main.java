package com.softserve.HOMEWORK.Conditions.n2;

public class Main {

    public static void main(String[] args) {
        BREEDDOG bd=null;
        Dog dog1=new Dog("Scharik", bd.BULLDOG, 8);
        Dog dog2=new Dog("Sirko", bd.BEAGLE, 5);
        Dog dog3=new Dog("Oleksandr", bd.HUSKY, 15);

        Dog.dogEquals(dog1, dog2, dog3);
        Dog.oldest(dog1, dog2, dog3);
    }



}


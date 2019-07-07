package com.softserve.HOMEWORK.Conditions.n2;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Scharik", BREEDDOG.BULLDOG, 8);
        Dog dog2 = new Dog("Sirko", BREEDDOG.BEAGLE, 5);
        Dog dog3 = new Dog("Oleksandr", BREEDDOG.HUSKY, 15);

        Dog.dogEquals(dog1, dog2, dog3);
        Dog.oldest(dog1, dog2, dog3);
    }


}


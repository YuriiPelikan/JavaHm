package com.softserve.HOMEWORK.Conditions.n2;

public class Dog {
    private String name;
    private BREEDDOG breed;
    private int age;

    public Dog() {

    }

    public Dog(String name, BREEDDOG breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BREEDDOG getBreed() {
        return breed;
    }

    public void setBreed(BREEDDOG breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void dogEquals(Dog dog1, Dog dog2, Dog dog3) {

        if ((dog1.getName() == (dog2.getName())) || (dog1.getName() == (dog3.getName()))) {
            System.out.println("Two dogs are presented with the same name");
        } else if ((dog2.getName() == (dog3.getName())) || (dog2.getName() == (dog1.getName()))) {
            System.out.println("Two dogs are presented with the same name");
        } else
            System.out.println("In list is not presented any dogs with two same name");
    }

    public static void oldest(Dog dog1, Dog dog2, Dog dog3) {

        if ((dog1.getAge() > (dog2.getAge())) && (dog1.getAge() > (dog3.getAge()))) {
            System.out.println(dog1.name + " " + dog1.breed + " " + "the oldest");
        } else if ((dog2.getAge() > (dog1.getAge())) && (dog2.getAge() > (dog3.getAge()))) {
            System.out.println(dog2.name + " " + dog2.breed + " " + "the oldest");
        } else if ((dog3.getAge() > (dog1.getAge())) && (dog3.getAge() > (dog2.getAge()))) {
            System.out.println(dog3.name + " " + dog3.breed + " " + "the oldest");
        }
    }
}

package com.softserve.HOMEWORK.Collections.n3;

import java.util.ArrayList;
import java.util.Comparator;

public class HW3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Olia", 3));
        students.add(new Student("Kolia", 4));
        students.add(new Student("Solia", 1));
        students.add(new Student("Liola", 2));
        students.add(new Student("Yarik", 3));

        System.out.println("Compare students by name");
        students.sort(new NameComparator());
        for (Student st : students)
            System.out.println(st);
        System.out.println();
        System.out.println("Compare students by course");
        students.sort(new CoursComparator());
        for (Student st : students)
            System.out.println(st);

        printStudent(students, 2);
    }

    private static void printStudent(ArrayList<Student> students, int i) {
    }
}

class Student {
    String name;
    int cours;

    public Student(String name, int cours) {
        this.name = name;
        this.cours = cours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    public static ArrayList<Student> printStudent(ArrayList<Student> st, int cours) {
        for (Student stud : st) {
            if (stud.cours == cours) {
                System.out.println(stud);
            }
        }

        return null;
    }

    public static boolean Compare(Student st1, Student st2) {

        return true;
    }

    @Override
    public String toString() {
        return "Student: " + name + "\tCours: " + cours;
    }

}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

class CoursComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.cours - o2.cours;
    }
}
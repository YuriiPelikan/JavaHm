package com.softserve.HOMEWORK.Collections.n3;

import java.util.ArrayList;

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




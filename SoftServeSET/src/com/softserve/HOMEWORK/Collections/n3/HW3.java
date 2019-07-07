package com.softserve.HOMEWORK.Collections.n3;

import java.util.ArrayList;

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

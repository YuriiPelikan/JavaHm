package com.softserve.HOMEWORK.Collections.n3;

import java.util.Comparator;

class CoursComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.cours - o2.cours;
    }
}

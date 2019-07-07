package com.softserve.HOMEWORK.Collections.n3;

import java.util.Comparator;

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
package model;

import java.util.Comparator;

public class ComparatorStudent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getDtb(),o2.getDtb());
    }

}

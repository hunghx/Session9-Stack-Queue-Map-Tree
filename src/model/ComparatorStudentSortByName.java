package model;

import java.util.Comparator;

public class ComparatorStudentSortByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMaSv().compareTo(o2.getMaSv());
    }
}

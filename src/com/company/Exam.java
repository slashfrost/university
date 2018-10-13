package com.company;

import java.util.HashMap;
import java.util.Map;

public class Exam {
    private String title;
    int mark;
    int id;
    public Map<Student, Integer> marks = new HashMap<Student, Integer>();

    public Map<Student, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<Student, Integer> marks) {
        this.marks = marks;
    }

    public void setId(int id) {
        this.id = id;
    }
}

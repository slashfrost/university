package com.company;

import model.BaseModel;

import java.util.HashMap;
import java.util.Map;

public class Exam extends BaseModel {
    private String title;

    public Map<Student, Integer> marks = new HashMap<Student, Integer>();

    public Map<Student, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<Student, Integer> marks) {
        this.marks = marks;
    }


}

package com.company;

import dao.ExamDAO;
import dao.impl.ExamDAOImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ExamDAO examDAO = new ExamDAOImpl();
        Exam newExam = new Exam();
        newExam.setId(1L);
        List<Exam> exams=new ArrayList<Exam>();
        Map<Student, Exam> marks = new HashMap<Student, Exam>();
        examDAO.create(newExam);
        newExam=null;
        Exam exam = examDAO.get(1L);
        Student student=new Student();
        examDAO.addMark(student,exam);
        System.out.println(examDAO.getMark(student,exam));
    }
}

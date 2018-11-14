package dao.impl;

import com.company.Exam;
import com.company.Student;
import dao.ExamDAO;

import java.util.Random;

public  class ExamDAOImpl extends AbstractDAOImpl<Exam> implements ExamDAO {



    @Override
    public void addMark(Student student, Exam exam) {
        Random random = new Random();
        exam.marks.put(student, random.nextInt((10 - 1) + 1) + 1);
    }

    @Override
    public int getMark(Student student,Exam exam) {
        return exam.marks.get(student);
    }


}

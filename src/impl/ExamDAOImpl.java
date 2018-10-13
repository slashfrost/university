package impl;

import com.company.Exam;
import com.company.Student;
import dao.ExamDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class ExamDAOImpl<T extends AbstractDAOImpl> implements ExamDAO<T> {



    @Override
    public void addMark(Student student, Exam exam) {
        Random random = new Random();
        exam.marks.put(student, random.nextInt((10 - 1) + 1) + 1);
    }

    @Override
    public void getMark(Student student,Exam exam) {
        exam.marks.get(student);
    }
}

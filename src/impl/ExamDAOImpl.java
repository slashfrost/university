package impl;

import com.company.Exam;
import com.company.Student;
import dao.ExamDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class ExamDAOImpl<T extends AbstractDAOImpl> implements ExamDAO<T> {
    List<Exam> exams= new <Exam>ArrayList();

    public List<Exam> getExams() {
        return exams;
    }

    public void addMark(Student student, Exam exam){
        Random random=new Random();
     return exam.marks.put()
    }

}

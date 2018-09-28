package impl;

import com.company.Exam;
import com.company.Student;
import dao.ExamDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class ExamDAOImpl extends AbstractDAOImpl implements ExamDAO {
    Random random=new Random();
    List<Exam> exam= new <Exam>ArrayList();
    public void addMark(Student student,ExamDAO exam){
       // exam.getMarks().add;
    }

}

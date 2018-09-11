package impl;

import com.company.Student;
import dao.ExamDAO;

import java.util.Random;

public abstract class ExamDAOImpl implements ExamDAO {
    Random random=new Random();
    public void addMark(Student student){
        //marks.put(student,random.nextInt(10));-?????
    }
}

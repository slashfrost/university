package impl;

import com.company.Exam;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDAOImpl {
    int mark;
    List<Exam>exam=new <Exam>ArrayList();

    public void setExam(List exam) {
        this.exam = exam;
    }
    public void add(List<Integer> exam){
        exam.add(mark);
    }
    public void delete(){
    exam.remove(mark);
    }
}

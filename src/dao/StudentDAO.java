package dao;

import com.company.Exam;
import com.company.ExamStagesEnum;
import com.company.Student;

public interface StudentDAO  extends BaseDAO<Student>{
ExamStagesEnum getExams(Student student, Exam exam);

}

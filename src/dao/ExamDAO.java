package dao;

import com.company.Exam;
import com.company.Student;

public interface ExamDAO extends BaseDAO<Exam> {
void addMark(Student student, Exam exam);
int getMark(Student student,Exam exam);




}

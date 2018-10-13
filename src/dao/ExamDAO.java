package dao;

import com.company.Exam;
import com.company.Student;

public interface ExamDAO<T>  {
void addMark(Student student, Exam exam);
void getMark(Student student0,Exam exam);




}

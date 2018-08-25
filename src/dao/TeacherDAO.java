package dao;

import com.company.Exam;
import com.company.Student;

public interface TeacherDAO {
    void addMark(Student student, Exam exam);
}

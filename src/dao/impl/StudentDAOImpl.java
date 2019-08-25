package dao.impl;

import com.company.Exam;
import com.company.ExamStagesEnum;
import com.company.Student;
import dao.StudentDAO;

public abstract class StudentDAOImpl implements StudentDAO {
    @Override
    public ExamStagesEnum getExams(Student student, Exam exam) {
        return student.passing.get(student);
    }
}

package service;

import com.company.Exam;
import dao.ExamDAO;
import dao.StudentDAO;

public interface ExamService extends BaseService<Exam>, ExamDAO {
    void setMarkToStudentInExam(Long idExam,Long idStudent);
}

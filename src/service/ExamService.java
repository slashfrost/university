package service;

import com.company.Exam;
import dao.ExamDAO;

public interface ExamService extends BaseService<Exam>{
    void setMarkToStudentInExam(Long idExam,Long idStudent);

}

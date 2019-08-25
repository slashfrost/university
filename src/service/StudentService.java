package service;

import com.company.Student;

public interface StudentService extends BaseService<Student> {
    void getSomeInfoAboutStudent(Long idStudent, Long idExam);

    void getAllStudentsAndExams(Long idStudent, Long idExam);
}

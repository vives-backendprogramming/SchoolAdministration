package be.vives.ti.service;

import be.vives.ti.dao.StudentDao;
import be.vives.ti.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    private StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public List<Student> findAllStudentsFromClass(String className) {
        return studentDao.findAllStudentsFromClass(className);
    }

    public List<Student> findAllStudents() {
        return studentDao.findAllStudents();
    }

    public Student findById(Integer toStudentId) {
        return studentDao.get(toStudentId);
    }
}

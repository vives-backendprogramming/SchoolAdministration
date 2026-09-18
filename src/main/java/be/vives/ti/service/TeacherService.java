package be.vives.ti.service;

import be.vives.ti.dao.TeacherDao;
import be.vives.ti.model.Student;
import be.vives.ti.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherService {

    private TeacherDao teacherDao;
    private StudentService studentService;
    private EmailService emailService;

    public TeacherService(TeacherDao teacherDao, StudentService studentService, EmailService emailService) {
        this.teacherDao = teacherDao;
        this.studentService = studentService;
        this.emailService = emailService;
    }

    public void sendMessage(Integer fromTeacherId, String message, Integer toStudentId) {

        Student student = studentService.findById(toStudentId);
        Teacher teacher = teacherDao.get(fromTeacherId);

        this.emailService.sendEmail(teacher, message, student);

    }

    public void sendMessageToAllStudentsOfClass(Integer fromTeacherId, String className, String message) {
        Teacher teacher = teacherDao.get(fromTeacherId);

        List<Student> allStudentsFromClass = studentService.findAllStudentsFromClass(className);

        allStudentsFromClass.stream().forEach(s -> {
            this.emailService.sendEmail(teacher, message, s);
        });
    }
}

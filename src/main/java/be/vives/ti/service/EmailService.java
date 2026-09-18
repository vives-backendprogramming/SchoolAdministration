package be.vives.ti.service;

import be.vives.ti.model.Student;
import be.vives.ti.model.Teacher;

public interface EmailService {
    void sendEmail(Teacher teacher, String message, Student student);
}

package be.vives.ti.service;

import be.vives.ti.model.Student;
import be.vives.ti.model.Teacher;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DummyEmailService implements EmailService {

    private TemplateService templateService;

    public DummyEmailService(TemplateService templateService) {
        this.templateService = templateService;
    }

    @Override
    public void sendEmail(Teacher teacher, String message, Student student) {
        StringBuilder sb = new StringBuilder();
        sb.append(templateService.getHeader());
        sb.append("\n");
        sb.append("Send mail");
        sb.append("\n");
        sb.append("From: ").append(teacher.getFirstName()).append(" ").append(teacher.getLastName());
        sb.append("\n");
        sb.append("To: ").append(student.getFirstName()).append(" ").append(student.getLastName());
        sb.append("\n");
        sb.append("Message: ").append(message);
        sb.append("\n");
        sb.append(templateService.getFooter());
        sb.append("\n");
        String result = sb.toString();
        System.out.println(result);
    }
}

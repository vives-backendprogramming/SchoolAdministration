package be.vives.ti.service;

import be.vives.ti.model.Student;
import be.vives.ti.model.Teacher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdEmailService implements EmailService {

    private static final Logger log = LoggerFactory.getLogger(ProdEmailService.class);

    @Override
    public void sendEmail(Teacher teacher, String message, Student student) {
        log.info("Email is sent");
    }
}

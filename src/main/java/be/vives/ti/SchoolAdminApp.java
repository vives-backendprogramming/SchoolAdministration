package be.vives.ti;

import be.vives.ti.config.ApplicationConfiguration;
import be.vives.ti.service.TeacherService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SchoolAdminApp {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        // get Bean by type
        TeacherService teacherService = context.getBean(TeacherService.class);

        teacherService.sendMessage(1, "Waarom was je afwezig?", 10);
        teacherService.sendMessageToAllStudentsOfClass(1, "3SD", "Afwerken tegen volgende les");
    }
}
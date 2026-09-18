package be.vives.ti.dao.util;

import be.vives.ti.model.Student;
import be.vives.ti.model.Teacher;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

// Geen aanpassingen nodig in deze klasse

/**
 * BELANGRIJK — wat deze klasse WEL en NIET doet:
 *
 * SchoolDatabaseStub IS de "database" voor deze oefening — maar dan volledig in het geheugen,
 * niet in een echte databank. Er is geen databank, geen SQL en geen bestand
 * dat wordt uitgelezen of weggeschreven: alle Student- en Teacher-objecten worden hier gewoon hardcoded aangemaakt
 * in Java-code (zie importStudents() / importTeachers()) en in een ArrayList bijgehouden.
 *
 * DummyDataSource (de andere "database"-gerelateerde klasse) simuleert enkel het JDBC-connectiegedeelte
 * (en geeft nooit echt een Connection terug) — de eigenlijke data zit dus wel degelijk hier, in deze klasse.
 *
 * @Component: deze klasse is vanaf deze branch (springcontextaware) een Spring-bean, zodat ze
 * via constructor injection in StudentDao/TeacherDao kan worden gestoken.
 */
@Component
public class SchoolDatabaseStub {

    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public SchoolDatabaseStub() {
        importStudents();
        importTeachers();
    }

    private void importStudents() {
        this.students = new ArrayList<>();
        students.add(new Student(20,"Kiara", "Nunez", "3SD"));
        students.add(new Student(21,"Iyla", "Pickett", "3SD"));
        students.add(new Student(22,"Oliver", "Chavez", "3SD"));
        students.add(new Student(23,"Madeleine", "Leigh", "3SD"));
        students.add(new Student(24,"Libbi", "Cousins", "3SD"));
        students.add(new Student(25,"Pippa", "Stone", "3SD"));
        students.add(new Student(10, "Correna","Edmund", "3NET"));
        students.add(new Student(13, "Wilow","Ronchetti", "3NET"));
        students.add(new Student(14, "Lani","Million", "3NET"));
        students.add(new Student(15, "Rahel","Dracey", "3NET"));
        students.add(new Student(16, "Boyce","VanCassel", "3NET"));
        students.add(new Student(17, "Patrizius","Potebury", "3NET"));
        students.add(new Student(18, "Nilson","Spurden", "3NET"));
        students.add(new Student(19, "Sara","Brunsen", "3NET"));
        students.add(new Student(10, "Kimmy","Alecock", "3BIT"));
        students.add(new Student(13, "David","Ronchetti", "3BIT"));
        students.add(new Student(14, "Danyelle","Lockner", "3BIT"));
        students.add(new Student(31, "Dian", "Gilbard", "3AI"));
        students.add(new Student(33, "Joshua","Blann","3AI"));
        students.add(new Student(35, "Nertie","Jain","3AI"));
        students.add(new Student(36, "Donnie","Loweth","3AI"));
        students.add(new Student(37, "Shanan","Newvell","3AI"));
        students.add(new Student(39, "Hymie","Caccavari","3AI"));
        students.add(new Student(41, "Halie","Ogle","3AI"));
    }

    private void importTeachers() {
        this.teachers = new ArrayList<>();
        teachers.add(new Teacher(1, "Valentin","Mengue"));
        teachers.add(new Teacher(2, "Max","Proschke"));
        teachers.add(new Teacher(3, "Shaw","Shoveller"));

    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}

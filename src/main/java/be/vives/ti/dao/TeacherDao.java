package be.vives.ti.dao;

import be.vives.ti.dao.util.DummyDataSource;
import be.vives.ti.dao.util.SchoolDatabaseStub;
import be.vives.ti.model.Teacher;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class TeacherDao {
    private DataSource ds;
    private SchoolDatabaseStub db;

    public TeacherDao() {
        this.ds = new DummyDataSource(); // nodig om een connectie op te vragen naar de (niet bestaande) database
        this.db = new SchoolDatabaseStub(); // simuleert de database
    }

    public Teacher get(int teacherId) {
        // dummy code
        try {
            Connection connection = ds.getConnection();
            return db.getTeachers().stream().filter(teacher -> teacher.getId() == teacherId).findFirst().orElse(null);

        } catch (SQLException e) {
            // not a great way to manage exceptions
            e.printStackTrace();
            return null;
        }
    }
}

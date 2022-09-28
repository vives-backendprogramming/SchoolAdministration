package be.vives.ti.model;

public class Student extends Person{

    private String className;

    public Student(Integer id, String firstName, String lastName, String className) {
        super(id, firstName, lastName);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public String getEmailaddress(){
        return getEmailAccount()+"@student.vives.be";
    }

}

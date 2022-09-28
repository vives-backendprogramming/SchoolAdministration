package be.vives.ti.model;

public class Teacher extends Person{

    public Teacher(Integer id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public String getEmail(){
        return getEmailAccount()+"@vives.be";
    }
}

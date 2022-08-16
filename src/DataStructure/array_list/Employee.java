package DataStructure.array_list;

public class Employee {

    private String firstname;
    private String lastname;
    private int id;

    public Employee (String firstname, String lastname, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    public String getFirstname () {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getId() {
        return id;
    }

    public void setFirstname() {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                '}';
    }
}

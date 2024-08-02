
package rent_a_car;


public class Employee {
    private int employee_id;
    private String employee_name;
    private int contact;
    private String designation;

    public Employee(int employee_id, String employee_name, int contact, String designation) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.contact = contact;
        this.designation = designation;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int empoyee_id) {
        this.employee_id = empoyee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
    
}

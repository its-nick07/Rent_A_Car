
package rent_a_car;




public class Rental {

    private int rental_id;
    private String start_date;
    private String end_date;
    private int payment;
    private String remarks;
    private int customer_id;
    private int car_id;
    private int employee_id;

    public Rental(int rental_id, String start_date, String end_date, int payment, String remarks, int customer_id, int car_id, int employee_id) {
        this.rental_id = rental_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.payment = payment;
        this.remarks = remarks;
        this.customer_id = customer_id;
        this.car_id = car_id;
        this.employee_id = employee_id;
    }

    public int getRental_id() {
        return rental_id;
    }

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    
    

}

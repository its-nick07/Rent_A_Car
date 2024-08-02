
package rent_a_car;


public class Customer {
    
    private int customer_id;
    private String customer_name;
    private int driver_license_num;
    private int phone;
    private String gender;
    private int age;
    private String address;

    public Customer(int customer_id, String customer_name, int driver_license_num, int phone, String gender, int age, String address) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.driver_license_num = driver_license_num;
        this.phone = phone;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getDriver_license_num() {
        return driver_license_num;
    }

    public void setDriver_license_num(int driver_license_num) {
        this.driver_license_num = driver_license_num;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   
    
    
    
}

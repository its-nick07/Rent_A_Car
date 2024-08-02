
package rent_a_car;


public class Broker {
    
    private int broker_id;
    private String broker_name;
    private String address;
    private int telephone;
    private String email;

    public Broker(int broker_id, String broker_name, String address, int telephone, String email) {
        this.broker_id = broker_id;
        this.broker_name = broker_name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public int getBroker_id() {
        return broker_id;
    }

    public void setBroker_id(int broker_id) {
        this.broker_id = broker_id;
    }

    public String getBroker_name() {
        return broker_name;
    }

    public void setBroker_name(String broker_name) {
        this.broker_name = broker_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}

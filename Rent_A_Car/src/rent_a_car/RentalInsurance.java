
package rent_a_car;


public class RentalInsurance {

    private int insurance_id;
    private String broker_name;
    private String description;
    private String policy;
    private int rental_id;
    private int broker_id;

    public RentalInsurance(int insurance_id, String broker_name, String description, String policy, int rental_id, int broker_id) {
        this.insurance_id = insurance_id;
        this.broker_name = broker_name;
        this.description = description;
        this.policy = policy;
        this.rental_id = rental_id;
        this.broker_id = broker_id;
    }

    public int getInsurance_id() {
        return insurance_id;
    }

    public void setInsurance_id(int insurance_id) {
        this.insurance_id = insurance_id;
    }

    public String getBroker_name() {
        return broker_name;
    }

    public void setBroker_name(String broker_name) {
        this.broker_name = broker_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public int getRental_id() {
        return rental_id;
    }

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
    }

    public int getBroker_id() {
        return broker_id;
    }

    public void setBroker_id(int broker_id) {
        this.broker_id = broker_id;
    }
    
    

}

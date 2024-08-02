
package rent_a_car;


public class Reserve {
    
    private int reserve_id;
    private String brand_name;
    private String pick_up_date;
    private int car_id;
    private int customer_id;

    public Reserve(int reserve_id, String brand_name, String pick_up_date, int car_id, int customer_id) {
        this.reserve_id = reserve_id;
        this.brand_name = brand_name;
        this.pick_up_date = pick_up_date;
        this.car_id = car_id;
        this.customer_id = customer_id;
    }

    public int getReserve_id() {
        return reserve_id;
    }

    public void setReserve_id(int reserve_id) {
        this.reserve_id = reserve_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getPick_up_date() {
        return pick_up_date;
    }

    public void setPick_up_date(String pick_up_date) {
        this.pick_up_date = pick_up_date;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    
    
    
}

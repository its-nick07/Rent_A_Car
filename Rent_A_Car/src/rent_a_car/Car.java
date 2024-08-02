
package rent_a_car;


public class Car {
    
    private int car_id;
    private String brand_name;
    private String model;
    private int product_year;
    private int mileage;
    private String color;

    public Car(int car_id, String brand_name, String model, int product_year, int mileage, String color) {
        this.car_id = car_id;
        this.brand_name = brand_name;
        this.model = model;
        this.product_year = product_year;
        this.mileage = mileage;
        this.color = color;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProduct_year() {
        return product_year;
    }

    public void setProduct_year(int product_year) {
        this.product_year = product_year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}


package rent_a_car;


public class Order {
    
    private int order_id;
    private String brand_ordered;
    private int quantity;
    private int supplier_phone;
    private int supplier_id;
    private int employee_id;
    private String car_model;

    

    public Order(int order_id, String brand_ordered, int quantity, int supplier_phone, int supplier_id, int employee_id, String car_model) {
        this.order_id = order_id;
        this.brand_ordered = brand_ordered;
        this.quantity = quantity;
        this.supplier_phone = supplier_phone;
        this.supplier_id = supplier_id;
        this.employee_id = employee_id;
        this.car_model = car_model;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getBrand_ordered() {
        return brand_ordered;
    }

    public void setBrand_ordered(String brand_ordered) {
        this.brand_ordered = brand_ordered;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSupplier_phone() {
        return supplier_phone;
    }

    public void setSupplier_phone(int supplier_phone) {
        this.supplier_phone = supplier_phone;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }
    
    
    
    
}

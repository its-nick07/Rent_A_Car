
package rent_a_car;


public class Supplier {
    
    private int supplier_id;
    private String supplier_name;
    private int supplier_contact;
    private String supplier_address;

    public Supplier(int supplier_id, String supplier_name, int supplier_contact, String supplier_address) {
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.supplier_contact = supplier_contact;
        this.supplier_address = supplier_address;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public int getSupplier_contact() {
        return supplier_contact;
    }

    public void setSupplier_contact(int supplier_contact) {
        this.supplier_contact = supplier_contact;
    }

    public String getSupplier_address() {
        return supplier_address;
    }

    public void setSupplier_address(String supplier_address) {
        this.supplier_address = supplier_address;
    }
    
    
    
}

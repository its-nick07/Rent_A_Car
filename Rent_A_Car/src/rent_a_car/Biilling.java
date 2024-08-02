
package rent_a_car;


public class Biilling {
    
    private int bill_id;
    private int bill_amount;
    private int customer_id;
    private int late_penalty;
    private int damage_penalty;

    public Biilling(int bill_id, int bill_amount, int customer_id, int late_penalty, int damage_penalty) {
        this.bill_id = bill_id;
        this.bill_amount = bill_amount;
        this.customer_id = customer_id;
        this.late_penalty = late_penalty;
        this.damage_penalty = damage_penalty;
    }

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public int getBill_amount() {
        return bill_amount;
    }

    public void setBill_amount(int bill_amount) {
        this.bill_amount = bill_amount;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getLate_penalty() {
        return late_penalty;
    }

    public void setLate_penalty(int late_penalty) {
        this.late_penalty = late_penalty;
    }

    public int getDamage_penalty() {
        return damage_penalty;
    }

    public void setDamage_penalty(int damage_penalty) {
        this.damage_penalty = damage_penalty;
    }
    
    
    
}

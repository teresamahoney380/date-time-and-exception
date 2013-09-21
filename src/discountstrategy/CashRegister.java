/*
 * Service Program to process a purchase
 */
package discountstrategy;

/**
 *
 * Teresa Mahoney
 */
public class CashRegister {
    private Purchase purch;
    private Receipt r;
    private FakeDataBase db;
    
    public enum discType{
        SEAS,
        MVP,
        STORE,
        QTY,
        NONE
    }

    public CashRegister(Purchase purch) {
        this.purch = purch;
        db= new FakeDataBase();
        r= new Receipt((db.getCustomerDbItem(purch.getCustIdx())));
    }
    
  
    
}

/*
 * Detail Object containing Receipt Information
 */
package discountstrategy;

/**
 *
 * Teresa Mahoney
 */
public class Receipt {
    private Customer c;
    private Purchase purch;
    private FakeDataBase db;
    private LineItem[] lineItem;
    
    public enum discType{
        SEAS,
        MVP,
        STORE,
        QTY,
        NONE
    }
// r= new Receipt((db.getCustomerDbItem(purch.getCustIdx())));
    public Receipt(Purchase p) {
        this.purch=p;
        db= new FakeDataBase();
        c= new Customer(db.getCustomerDbItem(purch.getCustIdx()));
        System.out.println(c.toString());
        lineItem = new LineItem[0];
        generateLineItems();
    }
    
    public void generateLineItems(){
        // add individual line item to LineItem Array
    }
  
    
    
    
}

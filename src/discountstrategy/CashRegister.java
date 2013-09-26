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
    private ReceiptWriter rw;
    private Receipt r;
    

    public CashRegister(Purchase purch) {
        this.purch = purch;     
         r=new Receipt(purch);
         rw=new ConsoleReceiptWriter();
         rw.WriteReceipt(r);
    }
 
    
}

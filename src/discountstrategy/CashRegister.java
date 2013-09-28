/*
 * Service Program to process a purchase and produce a receipt
 *  It receieves a Purchase object as a parameter which contains all the relevant sales 
 * transaction information (customer, products being purchased and qty) which it 
 * passes on to the receipt class to process the sale,  it then passes the
 * receipt produced to the writer
 */
package discountstrategy;

/**
 *
 * @ Teresa Mahoney
 */
public class CashRegister {
    private Purchase purch; // object with purchase transaction info
    private ReceiptWriter rw;
    private Receipt r;
    

    public CashRegister(Purchase purch) {
         setPurch(purch);     
         r=new Receipt(purch); // generates receipt
         rw=new ConsoleReceiptWriter();
         rw.WriteReceipt(r); // writes receipt
    }
/**
 * 
 * @param purch 
 */
    public final void setPurch(Purchase purch) {
        //validate that a purchase object has been passed in
        if (purch == null){
            // throw exception error
            return; // end prematurely
        }           
            this.purch = purch;
        
    }
    
 
    
}

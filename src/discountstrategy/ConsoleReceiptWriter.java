/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Owner
 */
public class ConsoleReceiptWriter implements ReceiptWriter{
    private Receipt r;
    private Customer c;
    private LineItem li;

       
    

    @Override
    public void WriteReceipt(Receipt r) {
        c=r.getCustomer();
        System.out.println(c.getCustFName()+" "+c.getCustLName());
        // print line items
        for (int i=0; i<r.getLineItem().length; i++){
            System.out.println(r.getLineItem()[i].toString());
        }
        
        
        
        
    }
    
}

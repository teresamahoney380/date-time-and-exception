/**
 * Implementation of Receipt Writer for Console Output
 */
package discountstrategy;

import java.text.NumberFormat;

/**
 *
 * @author Teresa Mahoney
 */
public class ConsoleReceiptWriter implements ReceiptWriter{
    
    private Customer c; // customer object receipt attribute
      
    
    /**
     *
     * @param r Receipt Object
     */
    @Override
    public  final void WriteReceipt(Receipt r) {
        c=r.getCustomer();
        System.out.println(c.toString());
        // print line items
        for (int i=0; i<r.getLineItem().length; i++){
            System.out.println(r.getLineItem()[i].toString());
        }
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("\nTotal Purchase:  \t"+nf.format(r.getTotalPurch()));
        System.out.println("Total Discounted:\t"+nf.format(r.getTotalDisc()));
        System.out.println("Total Amount Due:\t"+ (nf.format(r.getTotalPurch()-r.getTotalDisc())));
        
        
    }
    
}

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
    

    public CashRegister(Purchase purch) {
        this.purch = purch;
        
        
       // r= new Receipt((db.getCustomerDbItem(purch.getCustIdx())));
        r=new Receipt(purch);
        
    }
//    private void generateLineItems(){
//        for(int i=0; i<purch.getProdIdx().length; i++){
//            LineItem[] tempL=new LineItem[lineItem.length+1];
//            System.arraycopy(lineItem,0,tempL,0,lineItem.length);
//            lineItem=tempL;
//            lineItem[lineItem.length-1]=
//            
//        
//        
//    }
//    }
    
  
    
}

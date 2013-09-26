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
    private Product prod;
    
    
    
   
// r= new Receipt((db.getCustomerDbItem(purch.getCustIdx())));
    public Receipt(Purchase p) {
        this.purch=p;
        db= new FakeDataBase();
        c= new Customer(db.getCustomerDbItem(purch.getCustIdx()));
        //System.out.println(c.toString());
        lineItem = new LineItem[0];
        generateLineItems();
    }
    
    public void generateLineItems(){
        // add individual line item to LineItem Array
        for(int i=0; i<purch.getProdIdx().length; i++){
            
            prod= new Product(db.getProductDbItem(purch.getProductItem(i)));
            
            LineItem[] tempL=new LineItem[lineItem.length+1];
            System.arraycopy(lineItem,0,tempL,0,lineItem.length);
            lineItem=tempL;
            lineItem[lineItem.length-1]= new LineItem(prod.getProdId(),purch.getQtyAmtItm(i), 
                    prod.getProdUnitPrice(), prod.getProdDesc(), prod.getProdDiscCode());          
        
        }
    }

    public Customer getCustomer() {
        return c;
    }

    public LineItem[] getLineItem() {
        return lineItem;
    }
     
}

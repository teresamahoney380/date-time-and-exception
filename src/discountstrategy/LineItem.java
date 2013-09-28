/*
 * Detail Object pertaining to line items of a receipt with calculated discount
 * amount.
 * A toStrig method is also used for "quickie" output of the receipt but would
 * not be used for real situation
 */
package discountstrategy;

import java.text.NumberFormat;

/**
 *
 * Teresa Mahoney
 */
public class LineItem {
    private String itemProdId;
    private int itemQty;
    private double itemUnitPrice;
    private String itemDesc;
    private double discAmt;
    private String dType;
    private DiscountCalculator dc;
    
    public enum discType{
        SEAS,
        MVP,
        STORE,
        QTY,
        NONE
    }

    public LineItem() { //default constructor
    }
    
    

    public LineItem(String itemProdId, int itemQty, double itemUnitPrice, String itemDesc, String discType) {
    /* items are only set by the Constructor  -  they originate with the Receipt
     * object as a validated Product Attributes
     */
        this.itemProdId = itemProdId;
        this.itemQty = itemQty;
        this.itemUnitPrice = itemUnitPrice;
        this.itemDesc  = itemDesc;
        this.dType=discType;
        calcDisc(dType);
        discAmt=dc.calculateDiscount(itemQty, itemUnitPrice);
    }
    
    
    public String getItemProdId() {
        return itemProdId;
    }

    public int getItemQty() {
        return itemQty;
    }

    public double getItemUnitPrice() {
        return itemUnitPrice;
    }

    public double getItemDiscAmt() {
        return discAmt;
    }

    public String getItemDesc() {
        return itemDesc;
    }
    public double getDiscAmt(){
        return discAmt;
    }
    
    
    public final void calcDisc(String dType){
        // istatiates the correct implementation of the discountCalculator Strategy
        // based on the product discount type
        switch(dType){
            case "MVP":
                dc=new MvpDiscountCalculator();
                break;
            case "NONE":
                dc=new NoDiscountCalculator();
                break;
            case "QTY":
                dc=new QtyDiscountCalculator();
                break;
            case "SEAS":
                dc=new SeasDiscCalculator();
                break;
            case "STORE":
                dc=new StoreDiscountCalculator();
                break;
            default:
                dc=new NoDiscountCalculator();
                break;
        }
               
    }

    @Override
    public String toString() {
         // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return "\n" + itemProdId + "\t" + itemQty + 
                "\t" + nf.format(itemUnitPrice )+ "\t" + itemDesc + "\t\t" 
                +"\t"+nf.format(itemQty*itemUnitPrice)+"\t"+ nf.format(discAmt) ;
    }
    
    
    
    
}

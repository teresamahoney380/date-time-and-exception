/*
 * Detail Object pertaining to line items of a receipt
 */
package discountstrategy;

/**
 *
 * Teresa Mahoney
 */
public class LineItem {
    private String itemProdId;
    private int itemQty;
    private double itemUnitPrice;
    private double itemDiscAmt; // item discount amount

    public LineItem(String itemProdId, int itemQty, double itemUnitPrice, double itemDiscAmt) {
        this.itemProdId = itemProdId;
        this.itemQty = itemQty;
        this.itemUnitPrice = itemUnitPrice;
        this.itemDiscAmt = itemDiscAmt;
    }
    
    /* items are only set by the Constructor  -  they originate with the Cash Register
     * Serivce Program so they do not need validation
     */
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
        return itemDiscAmt;
    }
    
    
    
}

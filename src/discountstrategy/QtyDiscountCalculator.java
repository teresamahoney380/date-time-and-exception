/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Owner
 */
public class QtyDiscountCalculator implements DiscountCalculator{
    private double discAmt;
    private final double DISCPCT=.10;

    @Override
    public double calculateDiscount(int qty, double price) {
        if (qty>3){
        return qty*price*DISCPCT;
        }
        else{
            return 0;    
        }
    
    
}
}

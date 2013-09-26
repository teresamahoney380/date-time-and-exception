/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Owner
 */
public class SeasDiscCalculator implements DiscountCalculator{
    private double discAmt;
    private final double DISCPCT=.20;

    @Override
    public double calculateDiscount(int qty, double price) {
        return qty*price*DISCPCT;
    }

  
}

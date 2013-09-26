/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * Teresa Mahoney
 */
public class MvpDiscountCalculator implements DiscountCalculator{
    private double discAmt;
    private final double DISCPCT=.30;

    @Override
    public double calculateDiscount(int qty, double price) {
        return qty*price*DISCPCT;
    }
    
}

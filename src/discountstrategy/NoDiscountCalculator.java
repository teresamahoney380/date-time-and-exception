/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * Teresa Mahoney
 */
public class NoDiscountCalculator implements DiscountCalculator{
    private double discAmt;

    @Override
    public double calculateDiscount(int amt, double price) {
        discAmt=0;
        return discAmt;
    }
    
}

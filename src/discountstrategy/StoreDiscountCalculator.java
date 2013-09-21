/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * Teresa Mahoney
 */
public class StoreDiscountCalculator implements DiscountCalculator{
    private double discAmt;

    @Override
    public double calculateDiscount() {
        return discAmt;
    }
    
}

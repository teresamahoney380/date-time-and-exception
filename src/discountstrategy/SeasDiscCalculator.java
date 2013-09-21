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

    @Override
    public double calculateDiscount() {
        return discAmt;
    }
    
}

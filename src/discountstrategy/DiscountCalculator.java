/*
 * Calculates discount per line item
 */
package discountstrategy;

/**
 *
 * Teresa Mahoney
 */
public interface DiscountCalculator {
    /**
     *
     * @param amt
     * @param price
     * @return
     */
    public abstract double calculateDiscount(int amt, double price);
    
}

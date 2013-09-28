/*
 *  Strategy to Calculates discount per line item. Implementations are deteremined
 *  by porduct discount code
 */
package discountstrategy;

/**
 *
 *  @author Teresa Mahoney
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

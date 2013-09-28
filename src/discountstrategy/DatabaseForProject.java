/*
 * This is intended to be a DataBase Strategy for th project. It has not been fully
 * impemented yet
 */
package discountstrategy;

/**
 *
 * @author Teresa Mahoney
 */
public interface DatabaseForProject {
    public abstract Customer getCustomerByCustId(int CustId);
    public abstract Product getProductByProdId(String prodId);
    
}

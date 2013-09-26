/*
 * Detail Object pertaining to Product Information
 */
package discountstrategy;

/**
 *
 * Teresa Mahoney
 */
public class Product {
    private String prodId;
    private String prodDesc;
    private double prodUnitPrice;
    private String prodDiscCode;

    public Product(String prodId, String prodDesc, double prodUnitPrice, String prodDiscCode) {
        // convenience constructor for purpose of assignment
        setProdId(prodId);
        setProdDesc(prodDesc);
        setProdUnitPrice(prodUnitPrice);
        setProdDiscCode(prodDiscCode);
    }

    Product(Product productDbItem) {
        prodId=productDbItem.prodId;
        prodDesc=productDbItem.prodDesc;
        prodUnitPrice=productDbItem.prodUnitPrice;
        prodDiscCode=productDbItem.prodDiscCode;   
    }
    
    
    
    // getters and setters
    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        // validate for not null or blank
        this.prodId = prodId;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        // validate for not null or blank
        this.prodDesc = prodDesc;
    }

    public double getProdUnitPrice() {
        return prodUnitPrice;
    }

    public void setProdUnitPrice(double prodUnitPrice) {
        // validate to be greater than zero
        this.prodUnitPrice = prodUnitPrice;
    }

    public String getProdDiscCode() {
        return prodDiscCode;
    }

    public void setProdDiscCode(String prodDiscCode) {
        // validate with enum
        this.prodDiscCode = prodDiscCode;
    }
    
    
}

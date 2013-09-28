/**
 * Detail object pertaining to Customer Information for a retail sales transaction
 */
package discountstrategy;

/**
 *
 * @author Teresa Mahoney
 */
public class Customer {
    private int custNo;
    private String custFName;
    private String custLName;
    private String custAddress;
    private String custCity;
    private String custState;
    private int custZip;
    private int custPhone;

    /** constructor
     * 
     * @param custNo
     * @param custFName
     * @param custLName
     * @param custAddress
     * @param custCity
     * @param custState
     * @param custZip
     * @param custPhone 
     */
    public Customer(int custNo, String custFName, String custLName, String custAddress, String custCity, 
            String custState, int custZip, int custPhone) {
        // convenience construcotr for purpose of assignment
        // use setters to force validation
        setCustNo(custNo);
        setCustFName(custFName);
        setCustLName(custLName);
        setCustAddress(custAddress);
        setCustCity(custCity);
        setCustState(custState);
        setCustZip(custZip);
        setCustPhone(custPhone);
    }
/** this constructor needs to be used when an existing customer object attribute of
 *  the Purchase Transaction object is instantiated
 * @param customerDbItem 
 */
    
    Customer(Customer customerDbItem) {
        custNo=customerDbItem.custNo;
        custFName=customerDbItem.custFName;
        custLName=customerDbItem.custLName;
        custAddress=customerDbItem.custAddress;
        custCity=customerDbItem.custCity;
        custState=customerDbItem.custState;
        custZip=customerDbItem.custZip;
        custPhone=customerDbItem.custPhone;
    }
    
    
    
    // getter and setters
    /**
     *
     * @return
     */
    public final int getCustNo() {
        return custNo;
    }

    public  final void setCustNo(int custNo) {
        // validate for not less than or equal to zero
        this.custNo = custNo;
    }

    public final String getCustFName() {
         // validate for null or blank
        return custFName;
    }

    /**
     *
     * @param custFName
     */
    public final void setCustFName(String custFName) {
         // validate for null or blank
        this.custFName = custFName;
    }

    public final String getCustLName() {
        return custLName;
    }

    public final void setCustLName(String custLName) {
         // validate for null or blank
        this.custLName = custLName;
    }

    public final String getCustAddress() {
        return custAddress;
    }

    public final void setCustAddress(String custAddress) {
         // validate for null or blank
        this.custAddress = custAddress;
    }

    public final String getCustCity() {
        return custCity;
    }

    public final void setCustCity(String custCity) {
        // validate for null or blank
        this.custCity = custCity;
    }

    public final String getCustState() {
        return custState;
    }

    public final void setCustState(String custState) {
        // Validate via enum
        this.custState = custState;
    }

    public final int getCustZip() {
        return custZip;
    }

    public final void setCustZip(int custZip) {
        // validate for not less than or equal to zero
        this.custZip = custZip;
    }

    public final int getCustphone() {
        return custPhone;
    }

    public final void setCustPhone(int custPhone) {
        // validate for not less than or equal to zero
        this.custPhone = custPhone;
    }

    @Override
    public final String toString() {
        // this methods is strictly for the convenience of output for the receipt
        // and to verify data
        return "\nCustNo=" + custNo + "\n" + custFName + " " + custLName 
                + "\n" + custAddress + "\n" + custCity + ", " + custState + "  " + custZip; 
                
    }
    
    
    
}

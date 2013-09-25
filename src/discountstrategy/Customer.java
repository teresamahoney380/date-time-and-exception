/*
 * Detail object pertaining to Customer Information
 */
package discountstrategy;

/**
 *
 * Teresa Mahoney
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
    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        // validate for not less than or equal to zero
        this.custNo = custNo;
    }

    public String getCustFName() {
         // validate for null or blank
        return custFName;
    }

    public void setCustFName(String custFName) {
         // validate for null or blank
        this.custFName = custFName;
    }

    public String getCustLName() {
        return custLName;
    }

    public void setCustLName(String custLName) {
         // validate for null or blank
        this.custLName = custLName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
         // validate for null or blank
        this.custAddress = custAddress;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        // validate for null or blank
        this.custCity = custCity;
    }

    public String getCustState() {
        return custState;
    }

    public void setCustState(String custState) {
        // Validate via enum
        this.custState = custState;
    }

    public int getCustZip() {
        return custZip;
    }

    public void setCustZip(int custZip) {
        // validate for not less than or equal to zero
        this.custZip = custZip;
    }

    public int getCustphone() {
        return custPhone;
    }

    public void setCustPhone(int custPhone) {
        // validate for not less than or equal to zero
        this.custPhone = custPhone;
    }

    @Override
    public String toString() {
        return "Customer{" + "custNo=" + custNo + ", custFName=" + custFName + ", custLName=" + custLName + ", custAddress=" + custAddress + ", custCity=" + custCity + ", custState=" + custState + ", custZip=" + custZip + ", custPhone=" + custPhone + '}';
    }
    
    
    
}

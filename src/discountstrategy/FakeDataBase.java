/*
 * Creates an array of Customer Objects and Product Objects to simulate a
 * database of each
 */
package discountstrategy;

/**
 *
 * @author Owner
 */
public class FakeDataBase {
    private Customer[] customerDb;
    private Product[] productDb;

    public FakeDataBase() {
        setCustomerDb();
        setProductDb();
    }
    
private void setCustomerDb(){
    customerDb=new Customer[10];
    customerDb[1]= new Customer(11111,"Cust1","Customer","111 First Street","City1","WI",11111,111111111);
    customerDb[2]= new Customer(22222,"Cust2","Customer","222 First Street","City2","WI",22222,222222222);
    customerDb[0]= new Customer(00001,"Cust0","Customer","001 First Street","City0","WI",00001,100000000);
    customerDb[3]= new Customer(33333,"Cust3","Customer","333 First Street","City3","WI",33333,333333333);
    customerDb[4]= new Customer(44444,"Cust4","Customer","444 First Street","City4","WI",44444,444444444);
    customerDb[5]= new Customer(55555,"Cust5","Customer","555 First Street","City5","WI",55555,555555555);
    customerDb[6]= new Customer(66666,"Cust6","Customer","666 First Street","City6","WI",66666,666666666);
    customerDb[7]= new Customer(77777,"Cust7","Customer","777 First Street","City7","WI",77777,777777777);
    customerDb[8]= new Customer(88888,"Cust8","Customer","888 First Street","City8","WI",88888,888888888);
    customerDb[9]= new Customer(99999,"Cust9","Customer","999 First Street","City9","WI",99999,999999999);
    
}
private void setProductDb(){
    productDb = new Product[10];
    productDb[0]=new Product("P000","Women's Scarf",11.99,"SEAS");
    productDb[1]=new Product("P001","Women's Purse",39.99,"MVP");
    productDb[2]=new Product("P002","Men's Socks",6.99,"QTY");
    productDb[3]=new Product("P003","Women's Shoes",69.99,"STORE");
    productDb[4]=new Product("P004","Childre's Mittens",8.99,"SEAS");
    productDb[5]=new Product("P005","Men's Dress Shirt",40.99,"MVP");
    productDb[6]=new Product("P006","Xmas dish Set",101.99,"SEAS");
    productDb[7]=new Product("P007","Women's Panties",19.99,"QTY");
    productDb[8]=new Product("P008","Bath Towel",11.99,"STORES");
    productDb[9]=new Product("P009","Twin Sheet Set",59.99,"NONE");
    
}
public Customer getCustomerDbItem(int i){
    return customerDb[i];
}
public Product getProductDbItem(int i){
    return productDb[i];
}    

}

/*
 * sets up purchase parameters to drive sale processing
 */
package discountstrategy;
import java.util.Random;

/**
 *
 * Teresa Mahoney
 */
public class Startup {
     
    
    public static void main(String[] args) {
        
        Purchase p1=new Purchase();
        p1.setCustIdx(getRNum());
        CashRegister cr;
        
        // random number determines how many products will be part of purchase
        int r=getRNum();
        System.out.println("The number of products will be: "+r);
        for(int i=0; i<r; i++){
            int p=getRNum();
            int q=getRNum()+1;
            p1.setProdAndQty(p,q);
            System.out.println("Sent"+p+" and "+q);
            
        }
       
    
    System.out.println(p1.getCustIdx());
       
    /* will  create 3 purchase objects containing customer & items purchased
    *  to be used by Cash Register to produce Receipt
    */
    
    /* will instantiate cash register and pass in purchase object to generate receipt
     * 
     */
        cr=new CashRegister(p1);
    
     
}
    // random number generator
    private static int getRNum(){
        Random RValue=new Random();
        return RValue.nextInt(10);
    }
    
}
    


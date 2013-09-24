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
        
        // random number determines how many products will be part of purchase
        int r=getRNum();
        System.out.println("The number of products will be: "+r);
        for(int i=0; i<r; i++){
            p1.setProdAndQty(getRNum(), getRNum());
            System.out.println("you are here");
        }
        System.out.println("r="+r);
    
    System.out.println(p1.getCustIdx());
       // System.out.println(p1.getProdIdx());
        System.out.println("array length = "+p1.getProductLength());
        //System.out.println("The first product is"+p1.getProductItem(0));
        
    
    /* will  create 3 purchase objects containing customer & items purchased
    *  to be used by Cash Register to produce Receipt
    */
    
    /* will instantiate cash register and pass in purchase object to generate receipt
     * 
     */
    // random number generator
     
}
    private static int getRNum(){
        Random RValue=new Random();
        return RValue.nextInt(10)+1;
    }
    
}
    


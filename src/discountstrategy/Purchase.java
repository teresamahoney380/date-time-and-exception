/*
 * Helper Object set up by Start up with a randomly generated customer index
 * and randomly generated purchased product indexes
 */
package discountstrategy;

/**
 *
 * Teresa Mahoney
 */
public class Purchase {
    private int custIdx;
    private int[] prodIdx;
    private int[] qtyAmt;

    public Purchase() {
        prodIdx=new int[0];
        qtyAmt=new int[0];
    }

    public void setCustIdx(int custIdx) {
        this.custIdx = custIdx;
    }

    public void setProdAndQty(int p,int q) {
        //set index for part number retrieval
        int[] tempP=new int[prodIdx.length+1];
        System.out.println("Temp arry length is: "+tempP.length);
        System.arraycopy(prodIdx, 0, tempP, 0, prodIdx.length);
        prodIdx=tempP;
        prodIdx[prodIdx.length-1]=p;
        // set corresponding quantity amount for purchase
        int[] tempQ=new int[qtyAmt.length+1];
        System.arraycopy(qtyAmt, 0, tempP, 0, qtyAmt.length);
        qtyAmt=tempQ;
        qtyAmt[qtyAmt.length-1]=q;
    }
    
    

    public int getCustIdx() {
        return custIdx;
    }
    public int getProductItem(int i){
        return prodIdx[i];
    }
    public int getProductLength(){
        return prodIdx.length;
    }

    public int[] getProdIdx() {
        return prodIdx;
    }
    public int[] getQtyAmt() {
        return qtyAmt;
    }
    
    
    
}

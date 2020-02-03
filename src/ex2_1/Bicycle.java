 /*
        Bicycle
        Author: Asra Khan
        Date: jan 2020

        Description
       
    */

package ex2_1;

/**
 *
 * @author Asra
 */
public class Bicycle {
    //data members of bicycle
    private String tagNo;
   private Customer renter;

    public Bicycle() {
    }

    public Bicycle(String tagNo) {
        this.tagNo = "AAA-000";
    }

    public String getTagNo() {
        return tagNo;
    }

    public Customer getRenter() {
        return renter;
    }

    public void setTagNo(String tagNo) {
        
        if (tagNo.matches("^[A-Z]{3}-[0-9]{3}")){
        this.tagNo=tagNo;
        }
        else{ throw new IllegalArgumentException("The tag number must be inABC-000 format");
        
        }
        
    }

    public void setRenter(Customer renter) {
        this.renter = renter;
    }
   

}

 /*
        Customer
        Author:Asra Khan 
        Date: jan 2020

        Description
       
    */

package ex2_1;

/**
 *
 * @author Asra
 */
public class Customer {
    
    private String customerName;
    private String phone;
    private Bicycle bike;

    public Customer() 
    {customerName="unknown";
    phone="000-000-0000";
    }

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhone() {
        return phone;
    }

    public Bicycle getBike() {
        return bike;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhone(String phone) {
        if (phone.matches("^[0-9]{3}-[0-9]{3}-[0-9]{4}"))
            this.phone=phone;
        else{throw  new IllegalArgumentException("The phone number must have 000-000-0000");
                
        }
    }

    public void setBike(Bicycle bike) {
        this.bike = bike;
    }
    @Override
    public String toString(){
    return customerName+" \nphone: "+phone;
    }

}

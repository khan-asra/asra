/*
        Name:  Asra khan
       
        Program: BikeRegistration
        Date:  jan 2020
    
        Description:
        
 */
package ex2_1;

import java.util.*;

/**
 *
 * @author Asra
 */
public class BikeRegistration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        
        BikeRegistration register= new BikeRegistration();
        register.customer=register.getCustomer(input);
        register.bike=register.getBicycle(input);
        register.bike.setRenter(register.customer);
        System.out.println(register.toString());
        
    }
    private Customer customer;
    private Bicycle bike;
    private Date date;

    public BikeRegistration(Customer customer, Bicycle bike) {
        this.customer = customer;
        this.bike = bike;
    }

    public BikeRegistration() {
        customer=new Customer();
        bike=new Bicycle();
        date=new Date();
    }
    public Bicycle getBicycle(Scanner input){
    boolean valid= false;
    String tag;
    do{
    try{System.out.println("Enter bike number tag: ");
    
     tag=input.nextLine();
     bike.setTagNo(tag);
     valid=true;
    }
    catch(Exception e){
        System.out.println(e.getMessage());}
    }while (!valid);
    return bike;
    
    }
    public Customer getCustomer(Scanner input){
        // System.out.println("Enter customer name:");
          String name =input.nextLine();
          customer.setCustomerName(name);
        String phone_number;
        boolean valid=false;
        do{
        try{
            System.out.println("Enter customer name: ");
            phone_number=input.nextLine();
            customer.setPhone(phone_number);
            valid=true;
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        }
        while(!valid);
        
        
        return customer;
    }
    @Override
    public String toString(){
    return bike.toString()+" on "+date+"\n";
    }
    
   
    
    
    

}

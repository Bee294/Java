package CustomerRelationshipManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerController {
    public static List<Customer> customers = new ArrayList<Customer>();

    public static void addCustomer(String name, String email, String phone){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setPhone(phone);
        customers.add(customer);
    };
    public static void findCustomerByName(String name){
        for(int i = 0; i < customers.size();i++){
            if(customers.get(i).getName().contains(name)){
                System.out.println(customers.get(i));
            }else if(i == (customers.size()-1)){
                System.out.println("Không tìm thấy Customer");
            }
        }
    };
    public static void displayAll(){
        for(Customer customer: customers){
            System.out.println(customer);
        }
    };
}
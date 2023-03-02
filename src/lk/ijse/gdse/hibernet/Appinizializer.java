package lk.ijse.gdse.hibernet;

import lk.ijse.gdse.hibernet.embedded.CustName;
import lk.ijse.gdse.hibernet.embedded.MobileNo;
import lk.ijse.gdse.hibernet.entity.Customer;
import lk.ijse.gdse.hibernet.repository.CustomerRepository;
import lk.ijse.gdse.hibernet.util.SessionFactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Appinizializer {
    public static void main(String[] args) {
        //save
        CustomerRepository customerRepository = new CustomerRepository();
        Customer customer=getCustomerEntity();
        customerRepository.saveCustomer(customer);

        //update
//        CustomerRepository customerRepository = new CustomerRepository();
//        Customer customer=customerRepository.getCustomer(1L);
//        System.out.println("Customer Id: "+customer.getId());
//
//        customer.setAddress("Matara");
//
//        boolean isUpdated = customerRepository.updateCustomer(customer);
//        if (isUpdated){
//            System.out.println("Customer "+customer.getId()+"Updated Sucessfully");
//        }else {
//            System.out.println("Customer "+customer.getId()+"Not Updated ");

        //Delete
//            CustomerRepository customerRepository = new CustomerRepository();
//        Customer customer=customerRepository.getCustomer(1L);
//        System.out.println("Customer Id: "+customer.getId());
//
//        customer.setAddress("Matara");
//
//        boolean isDelete = customerRepository.deleteCustomer(customer);
//        if (isDelete){
//            System.out.println("Customer "+customer.getId()+"Deleted Sucessfully");
//        }else {
//        System.out.println("Customer "+customer.getId()+"Not Deletted ");
//        }




//        customerRepository.saveCustomer();
//        Customer customer = new Customer();
//        customer.setId(1L);

        //set Embedded object Data
//        CustName custName = new CustName();
//        custName.setFirstName("Jayani");
//        custName.setMiddleName("Arunika");
//        custName.setLastName("Dissanayake");
//
//        customer.setName(custName);
//        customer.setAddress("Galle");
//        customer.setSalary(3000.00);
//
//        customer.setAge(22);
//
//        List<MobileNo> phoneNos  = new ArrayList<>();
//        phoneNos.add(new MobileNo("MOBILE","0760942677"));
//        phoneNos.add(new MobileNo("HOME","0412345678"));
//        customer.setPhoneNos(phoneNos);
//        Session session = SessionFactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//        session.save(customer);
//
//        transaction.commit();
//        session.close();

    }
    private static Customer getCustomerEntity(){
        Customer customer = new Customer();
        customer.setId(1L);

        CustName custName = new CustName();
        custName.setFirstName("Jayani");
        custName.setMiddleName("Arunika");
        custName.setLastName("Dissanayake");

        customer.setName(custName);
        customer.setAddress("Galle");
        customer.setSalary(3000.00);

        customer.setAge(22);

        List<MobileNo> phoneNos  = new ArrayList<>();
        phoneNos.add(new MobileNo("MOBILE","0760942677"));
        phoneNos.add(new MobileNo("HOME","0412345678"));
        customer.setPhoneNos(phoneNos);
        Session session = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);

        transaction.commit();
        session.close();

        return customer;
    }

}

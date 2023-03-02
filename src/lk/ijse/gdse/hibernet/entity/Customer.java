package lk.ijse.gdse.hibernet.entity;

import lk.ijse.gdse.hibernet.embedded.CustName;
import lk.ijse.gdse.hibernet.embedded.MobileNo;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

//1.@Entity(name = "customer")
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
   // @Column(name = "customer_name")
    private CustName name;
    @Column(name = "customer_address")
    private String address;
    @Column(name = "customer_salary")
    private Double salary;
    @Column(name = "customer_age",columnDefinition = "SMALLINT")
    private int age;


    @ElementCollection
    @CollectionTable(name = "customer_mobile_nos",joinColumns = @JoinColumn(name = "customer_id"))
    private List<MobileNo> phoneNos = new ArrayList<>();

    @Transient
    private String dob;

    @CreationTimestamp
    private Date createDate;

    @CreationTimestamp
    private Time time;

    public Customer(long id, CustName name, String address, Double salary, int age, List<MobileNo> phoneNos) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.age = age;
        this.phoneNos = phoneNos;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CustName getName() {
        return name;
    }

    public void setName(CustName name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<MobileNo> getPhoneNos() {
        return phoneNos;
    }

    public void setPhoneNos(List<MobileNo> phoneNos) {
        this.phoneNos = phoneNos;
    }
}

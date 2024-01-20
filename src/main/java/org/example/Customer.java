package org.example;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "mycust")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private int id;
    @Column(name = "cName")private String Name;
    @Column(name = "cEmail")private String Email;
    @Column(name = "cPhone")private int phone;

//    @Version
//    private int version;
    @Version
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date time;



    public Customer()
    {

    }
    public Customer(String name, String email, int phone) {
        Name = name;
        Email = email;
        this.phone = phone;
    }
    public Customer(int id, String name, String email, int phone) {
        this.id = id;
        Name = name;
        Email = email;
        this.phone = phone;
    }
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

//    public int getVersion() {
//        return version;
//    }
//
//    public void setVersion(int version) {
//        this.version = version;
//    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", phone=" + phone +
                '}';
    }
}

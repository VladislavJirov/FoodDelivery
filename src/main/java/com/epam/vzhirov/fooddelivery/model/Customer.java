package com.epam.vzhirov.fooddelivery.model;

import java.io.Serializable;
import java.util.*;
import java.time.*;

public class Customer extends BaseEntity implements Serializable {

    private String login;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String address;
    private String contactNumber;
    private boolean validated;
    private LocalDate registrationDate;
    private LocalDate lastVisit;
    private List<Order> orders;
    private List<Discount> discounts;

    public Customer(String login, String password) {
        this.login = login;
        this.password = password;
        this.registrationDate = LocalDate.now();
    }

    @Override
    public String toString() {
        System.out.println(login);
        return null;
    }

    public LocalDate getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(LocalDate lastVisit) {
        this.lastVisit = lastVisit;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public Discount setDiscount(Discount discount) {
        if (this.discounts.contains(discount)){
            return null;
        }
        this.discounts.add(discount);
        return discount;
    }

    public void removeDiscount(Discount discount) {
        this.discounts.remove(discount);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

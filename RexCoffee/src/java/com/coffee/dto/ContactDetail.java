/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dto;

/**
 *
 * @author Rex
 */
public class ContactDetail {

    private String address;
    private String phoneNumber;
    private String email;
    private String openingHours;

    public ContactDetail() {
    }

    public ContactDetail(String address, String phoneNumber, String email, String openingHours) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.openingHours = openingHours;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    @Override
    public String toString() {
        return "ContactDetail{" + "address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", openingHours=" + openingHours + '}';
    }

}

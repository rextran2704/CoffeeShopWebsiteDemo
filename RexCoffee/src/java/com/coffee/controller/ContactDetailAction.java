/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.controller;

import com.coffee.dao.ContactDetailDB;
import com.coffee.dto.ContactDetail;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Rex
 */
public class ContactDetailAction extends ActionSupport {

    ContactDetail contact;

    public ContactDetailAction() {
    }

    @Override
    public String execute() throws Exception {
        ContactDetailDB contactDao = new ContactDetailDB();
        contact = contactDao.getContact();
        return SUCCESS;
    }

    public ContactDetail getContact() {
        return contact;
    }

    public void setContact(ContactDetail contact) {
        this.contact = contact;
    }
}

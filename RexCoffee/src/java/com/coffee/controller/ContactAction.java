/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.controller;

import com.coffee.dao.ContactMessageDB;
import com.coffee.dto.ContactMessage;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Rex
 */
public class ContactAction extends ActionSupport {

    private String name;
    private String email;
    private String message;

    public ContactAction() {
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String sendMessage() {
        ContactMessage contactMessage = new ContactMessage(name, email, message);
        if (ContactMessageDB.sendMessage(contactMessage)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    @Override
    public void validate() {
        if (name.isEmpty()) {
            addFieldError("name", "Name is required");
        }
        if (email.isEmpty()) {
            addFieldError("email", "Email is required");
        } else if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            addFieldError("email", "Email format is not correct");
        }
        if (message.isEmpty()) {
            addFieldError("message", "Please enter your message");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

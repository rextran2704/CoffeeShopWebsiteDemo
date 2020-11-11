/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.controller;

import com.coffee.dao.AccountDAO;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Rex
 */
public class AccountAction extends ActionSupport {

    private String username;
    private String password;

    public AccountAction() {
    }

    @Override
    public String execute() throws Exception {
        AccountDAO dao = new AccountDAO();
        if (dao.checkLogin(username, password)) {
//            HttpSession session = ServletActionContext.getRequest().getSession();
//            session.setAttribute("username", username);
            Map session = ActionContext.getContext().getSession();
            session.put("username", username);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String logout() throws Exception {
        Map session = ActionContext.getContext().getSession();
        if (session.get("username") != null) {
            session.remove("username");
        }
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

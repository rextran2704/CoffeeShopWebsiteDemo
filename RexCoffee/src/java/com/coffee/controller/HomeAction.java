/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.controller;

import com.coffee.dao.CoffeeShopInfoDB;
import com.coffee.dto.CoffeeShopInfo;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Rex
 */
public class HomeAction extends ActionSupport {

    CoffeeShopInfo info;

    public HomeAction() {
    }

    @Override
    public String execute() throws Exception {
        CoffeeShopInfoDB infoDao = new CoffeeShopInfoDB();
        info = infoDao.getInfo();
        return SUCCESS;
    }

    public String showLoginForm() throws Exception {
        return SUCCESS;
    }

    public String showContactForm() throws Exception {
        return SUCCESS;
    }

    public CoffeeShopInfo getInfo() {
        return info;
    }

    public void setInfo(CoffeeShopInfo info) {
        this.info = info;
    }

}

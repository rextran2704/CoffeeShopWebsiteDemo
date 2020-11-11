/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;

import com.coffee.dto.CoffeeShopInfo;

/**
 *
 * @author Rex
 */
public class TestDAO {
    public static void main(String[] args) {
        CoffeeShopInfoDB infoDAO = new CoffeeShopInfoDB();
        CoffeeShopInfo info = infoDAO.getInfo();
        System.out.println(info);
    }
}

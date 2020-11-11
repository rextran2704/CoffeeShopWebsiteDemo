/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;

import com.coffee.dto.CoffeeShopInfo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rex
 */
public class CoffeeShopInfoDB implements DatabaseInfo {

    public CoffeeShopInfo getInfo() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CoffeeShopInfoDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (Connection con = DriverManager.getConnection(dbURL, userDB, passDB)) {
            CoffeeShopInfo info = null;
            String query = "Select name, [description], [image], [owner] From CoffeeShopInfo";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getNString(1);
                String description = rs.getNString(2);
                String image = rs.getNString(3);
                String owner = rs.getNString(4);
                info = new CoffeeShopInfo(name, description, image, owner);
            }
            con.close();
            return info;
        } catch (SQLException ex) {
            Logger.getLogger(CoffeeShopInfoDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static void main(String[] args) {
        CoffeeShopInfoDB dao = new CoffeeShopInfoDB();
        CoffeeShopInfo info = dao.getInfo();
        System.out.println(info);
    }
}

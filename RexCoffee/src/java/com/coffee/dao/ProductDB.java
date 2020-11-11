/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;

import com.coffee.dto.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rex
 */
public class ProductDB implements DatabaseInfo {

    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> productList = new ArrayList<>();
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (Connection con = DriverManager.getConnection(dbURL, userDB, passDB)) {
            String query = "Select id, name, [description], [image], type From Products";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getNString(2);
                String description = rs.getNString(3);
                String image = rs.getNString(4);
                int type = rs.getInt(5);
                Product product = new Product(id, name, description, image, type);
                productList.add(product);
            }
            con.close();
            return productList;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<Product> getTop2Products() {
        ArrayList<Product> productList = new ArrayList<>();
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (Connection con = DriverManager.getConnection(dbURL, userDB, passDB)) {
            String query = "Select Top 2 id, name, [description], [image], type From Products Order By id DESC";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getNString(2);
                String description = rs.getNString(3);
                String image = rs.getNString(4);
                int type = rs.getInt(5);
                Product product = new Product(id, name, description, image, type);
                productList.add(product);
            }
            con.close();
            return productList;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean addProduct(Product product) {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (Connection con = DriverManager.getConnection(dbURL, userDB, passDB)) {
            String query = "Insert into Products(name, [description], [image], type) Values(?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, product.getName());
            pstmt.setString(2, product.getDescription());
            pstmt.setString(3, product.getImage());
            pstmt.setInt(4, product.getTypeInt());
            int rc = pstmt.executeUpdate();
            con.close();
            return rc == 1;
        } catch (SQLException ex) {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}

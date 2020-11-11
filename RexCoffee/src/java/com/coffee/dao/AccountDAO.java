/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;

import com.coffee.dto.Account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rex
 */
public class AccountDAO implements DatabaseInfo {

    public Account getAcccount(String username) {
        Account account = null;
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (Connection con = DriverManager.getConnection(dbURL, userDB, passDB)) {
            String query = "SELECT id, password, created_at FROM Accounts WHERE username='" + username + "'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt(1);
                String password = rs.getString(2);
                Date date_created = rs.getDate(3);
                account = new Account(id, username, password, date_created);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return account;
        }
    }

    public boolean checkLogin(String username, String password) {
        AccountDAO accountDAO = new AccountDAO();
        Account account = accountDAO.getAcccount(username);
        System.out.println(account.getPassword());
        return password.equals(account.getPassword());
    }
    
    public static void main(String[] args) {
        AccountDAO dao = new AccountDAO();
        Account account = dao.getAcccount("admin");
        System.out.println(account.getUsername());
        System.out.println(account.getPassword());
        System.out.println(dao.checkLogin("admin", "admin123"));
    }
}

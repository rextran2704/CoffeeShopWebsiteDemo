/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;

import com.coffee.dto.ContactDetail;
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
public class ContactDetailDB implements DatabaseInfo {

    public ContactDetail getContact() {
        ContactDetail contact = null;
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ContactDetailDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (Connection con = DriverManager.getConnection(dbURL, userDB, passDB)) {
            String query = "Select [address], phone_number, email, opening_hours From ContactDetail";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String address = rs.getNString(1);
                String phoneNumber = rs.getString(2);
                String email = rs.getString(3);
                String openingHours = rs.getNString(4);
                contact = new ContactDetail(address, phoneNumber, email, openingHours);
            }
            con.close();
            return contact;
        } catch (SQLException ex) {
            Logger.getLogger(ContactDetailDB.class.getName()).log(Level.SEVERE, null, ex);
            return contact;
        }
    }
    
}

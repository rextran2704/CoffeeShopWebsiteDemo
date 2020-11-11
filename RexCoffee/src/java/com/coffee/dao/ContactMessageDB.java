/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coffee.dao;

import com.coffee.dto.ContactMessage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rex
 */
public class ContactMessageDB implements DatabaseInfo {

    public static boolean sendMessage(ContactMessage contactMessage) {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ContactMessageDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        try (Connection con = DriverManager.getConnection(dbURL, userDB, passDB)) {
            String query = "INSERT INTO Contact_Messages (name, email, content) VALUES (?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setNString(1, contactMessage.getName());
            pstmt.setString(2, contactMessage.getEmail());
            pstmt.setNString(3, contactMessage.getMessage());
            int rc = pstmt.executeUpdate();
            con.close();
            return rc == 1;
        } catch (SQLException ex) {
            Logger.getLogger(ContactMessageDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}

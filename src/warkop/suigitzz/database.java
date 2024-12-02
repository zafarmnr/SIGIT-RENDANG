/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warkop.suigitzz;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class database {
    
    private final String url = "jdbc:mysql://localhost:3306/warkop"; // Sesuaikan jika port berbeda
    private final String user = "root"; // Sesuaikan jika username berbeda
    private final String pwd = ""; // Sesuaikan jika password berbeda
    private Connection con;  

    public void koneksi() {
        try {
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal: " + e.getMessage());
        }
    }

    public Connection getCon() {
        return con;
    }

    void connect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ranaufalmuha
 */
public class RegistrasiUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("Form Registrasi");
        
        // ------ Nama ------
        JLabel name = new JLabel();
        name.setText("Nama");
        name.setBounds(100,100,100,30);
        j.add(name);
        
        JTextField nameInput = new JTextField();
        nameInput.setBounds(200, 100, 200, 30);
        j.add(nameInput);
           
        // ------ Username ------
        // label
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(100, 140, 100, 30);
        j.add(username);
        
        // TexField
        JTextField usernameInput = new JTextField();
        usernameInput.setBounds(200, 140, 200, 30);
        j.add(usernameInput);
               
        // ------ Password ------
        // label
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(100, 180, 100, 30);
        j.add(password);
        
        // TexField
        JPasswordField passwordInput = new JPasswordField();
        passwordInput.setBounds(200, 180, 200, 30);
        j.add(passwordInput);
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(100, 220, 100, 30);
        j.add(email);
        
        JTextField emailInput = new JTextField();
        emailInput.setBounds(200, 220, 200, 30);
        j.add(emailInput);
        
        JLabel nohp = new JLabel();
        nohp.setText("Nomor Hp");
        nohp.setBounds(100, 260, 100, 30);
        j.add(nohp);
        
        JTextField nohpInput = new JTextField();
        nohpInput.setBounds(200, 260, 200, 30);
        j.add(nohpInput);
        
        // ------ Button ------
        JButton loginButton = new JButton();
        loginButton.setText("Login");
        loginButton.setBounds(150, 300, 100, 50);
        j.add(loginButton);
        
        // Set Layout (Decorate)
        j.setSize(800,800);
        j.setLayout(null);
        j.setVisible(true);
    }
    
}

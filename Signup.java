
package com;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Signup {
    public static void main(String[] args) {
        
        sign s=new sign();
    }
}
class sign extends JFrame
{

    public sign() {
        JButton b=new JButton("Signup");
        JTextField jt=new JTextField("Your Name");
        JTextField jt1=new JTextField("Username");
        JTextField jt2=new JTextField("Password");
        JLabel l=new JLabel();
        l.setText("Create Account");
        l.setBounds(75, 75, 200, 70);
        jt.setBounds(75, 125, 300, 30);
        jt1.setBounds(75, 175, 300, 30);
        jt2.setBounds(75, 225, 300, 30);
        b.setBounds(75, 275, 95, 30);
        Container c=getContentPane();
        c.setBackground(new java.awt.Color(255, 238, 204));
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String a=jt.getText();
                    String d=jt1.getText();
                    String f=jt2.getText();                   
                    String url="jdbc:derby://localhost:1527/sample";
                    String user="app";
                    String pass="app";
                    String q="insert into Register values(?,?,?)";
                    Connection con=null;
                    con=DriverManager.getConnection(url,user,pass);
                    PreparedStatement pst=con.prepareStatement(q);
                    pst.setString(1, a);
                    pst.setString(2,d);
                    pst.setString(3,f);
                    int aa=pst.executeUpdate();
                    new hom();
                    dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(sign.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
        
        add(b);
        add(jt);
        add(jt1);
        add(jt2);
        add(l);
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
    }
    
}

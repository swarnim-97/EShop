
package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Login {
    public static void main(String[] args) {
        log obj=new log();
    }
    
}
class log extends JFrame
{

    public log()
    {
        JButton b=new JButton("Login");
        JTextField jt=new JTextField("Enter Username");
        JTextField jt1=new JTextField("Password");
        JLabel l=new JLabel();
        JLabel l1=new JLabel();
        l.setText("Login");
        l.setBounds(75, 75, 200, 70);
        jt.setBounds(75, 125, 300, 30);
        jt1.setBounds(75, 175, 300, 30);
        b.setBounds(75, 225, 95, 30);
        l1.setBounds(75, 275, 300, 70);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String a=jt.getText();
                    String b=jt1.getText();
                    //System.out.println(a+"\n"+b);
                    String url="jdbc:derby://localhost:1527/sample";
                    String user="app";
                    String pass="app";
                    String q="Select * from register where username='"+ a +"'";
                    //l1.setText("UserName and Password are wrong");
                    //System.out.println(q);
                    Connection con=null;
                    con=DriverManager.getConnection(url, user, pass);
                    Statement st=con.createStatement();
                    ResultSet rs= st.executeQuery(q);
                    //System.out.println(rs);
                    while(rs.next()){
                        String p=rs.getString("username");
                        String r=rs.getString("password");
                        //System.out.println("*");
                        if(r.equals(b) && p.equals(a))
                        {
                            new hom1(a);
                            dispose();
                        }
                        else
                        {
                            //System.out.println("**");
                            l1.setText("UserName and Password are wrong");
                        }
                        //System.out.println("#");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(log.class.getName()).log(Level.SEVERE, null, ex);
                }               
            }
        });
        add(b);
        add(jt);
        add(jt1);
        add(l);
        add(l1);
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

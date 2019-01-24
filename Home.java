
package com;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home {
    public static void main(String[] args) {
        hom h=new hom();
    }
}
class hom extends JFrame
{

    public hom() 
    {
        JButton b=new JButton("Login");
        JButton b1=new JButton("Signup");
        BufferedImage logo=null;
        BufferedImage image=null;
        try {
            logo = ImageIO.read(new File("C:/Users/Swarnim/Desktop/logo.png"));
            image = ImageIO.read(new File("C:/Users/Swarnim/Desktop/image.png"));
        } catch (IOException ex) {
            Logger.getLogger(hom.class.getName()).log(Level.SEVERE, null, ex);
        }
        JLabel l=new JLabel(new ImageIcon(logo));
        JLabel l1=new JLabel(new ImageIcon(image));
        JLabel l2=new JLabel();
        Container c=getContentPane();
        c.setBackground(new java.awt.Color(0, 0, 255));
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new log();
                dispose();
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new sign();
                dispose();
            }
        });
        l2.setText("Welcome to E-Shop");
        b.setBounds(700, 80, 95, 30);
        b1.setBounds(830, 80, 95, 30);
        l.setBounds(50, 75, 168, 86);
        l2.setBounds(450, 100, 150, 125);
        l1.setBounds(0, 180, 1000, 378);
        add(l2);
        add(b);
        add(b1);
        add(l);
        add(l1);
        setSize(1000, 1000);
        setLayout(null);
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

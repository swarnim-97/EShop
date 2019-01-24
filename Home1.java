
package com;

import java.awt.Container;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home1 {
    public static void main(String[] args) {
        hom1 obj=new hom1(null);
    }
    
}
class hom1 extends JFrame
{

    public hom1(String username) 
    {
        BufferedImage logo=null;
        BufferedImage image=null;
        try {
            logo = ImageIO.read(new File("C:/Users/Swarnim/Desktop/logo.png"));
            image = ImageIO.read(new File("C:/Users/Swarnim/Desktop/image.png"));
        } catch (IOException ex) {
            Logger.getLogger(hom1.class.getName()).log(Level.SEVERE, null, ex);
        }
        JLabel l=new JLabel(new ImageIcon(logo));
        JLabel l1=new JLabel(new ImageIcon(image));
        JLabel l2=new JLabel();
        JLabel l3=new JLabel();
        Container c=getContentPane();
        c.setBackground(new java.awt.Color(0, 0, 255));
        l2.setText("Welcome to E-Shop");
        l3.setText(username);
        l.setBounds(50, 75, 168, 86);
        l1.setBounds(0, 180, 1000, 378);
        l2.setBounds(450, 100, 150, 125);
        l3.setBounds(700, 60, 150, 125);
        add(l);
        add(l1);
        add(l2);
        add(l3);
        setSize(1000, 1000);
        setLayout(null);
        setVisible(true);
    }
    
}

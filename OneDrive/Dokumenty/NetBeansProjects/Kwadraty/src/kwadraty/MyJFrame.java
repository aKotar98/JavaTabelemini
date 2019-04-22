/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwadraty;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author kotar
 */
public class MyJFrame extends JFrame {
    
    public MyJFrame(){
        this.setLayout(new GridLayout(2,1));
    setSize(600, 400);
    setLocation(50,50);
    JPanel myPanel = new JPanel();
    JPanel square = new JPanel();
    square.setPreferredSize(new Dimension(200,200)); // ustawienie rozmiaru
    square.setBorder(LineBorder.createGrayLineBorder());
    this.add(square);
    this.add(myPanel);
    myPanel.setLayout(new GridLayout(1,5));
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    myPanel.add(button1);
    myPanel.add(button2);
    myPanel.add(button3);
    myPanel.add(button4);
    myPanel.add(button5);
    
    
    
    button1.addActionListener((java.awt.event.ActionEvent evt) -> {
        square.setBackground(Color.RED);
        });
    button2.addActionListener((java.awt.event.ActionEvent evt) -> {
        square.setBackground(Color.BLACK);
        });
    button3.addActionListener((java.awt.event.ActionEvent evt) -> {
        square.setBackground(Color.YELLOW);
        });
    button4.addActionListener((java.awt.event.ActionEvent evt) -> {
        square.setBackground(Color.BLUE);
        });
    button5.addActionListener((java.awt.event.ActionEvent evt) -> {
        square.setBackground(Color.GREEN);
        });
    
    setTitle("Kolory");
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    }
  
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zmianatlaanimacja;

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
    MyJPanel myJPanel;
    public MyJFrame(){
    
    this.setLayout(new GridLayout(2,1));
    setSize(600, 400);
    
     
    myJPanel = new MyJPanel();
    JPanel myPanel = new JPanel();
    this.add(myJPanel);
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
    addRectangle();
    
    
    button1.addActionListener((java.awt.event.ActionEvent evt) -> {
        myJPanel.setBackground(Color.ORANGE);
        });
    button2.addActionListener((java.awt.event.ActionEvent evt) -> {
        myJPanel.setBackground(Color.BLACK);
        });
    button3.addActionListener((java.awt.event.ActionEvent evt) -> {
        myJPanel.setBackground(Color.YELLOW);
        });
    button4.addActionListener((java.awt.event.ActionEvent evt) -> {
        myJPanel.setBackground(Color.BLUE);
        });
    button5.addActionListener((java.awt.event.ActionEvent evt) -> {
        myJPanel.setBackground(Color.GREEN);
        });
    
    setTitle("Kolory");
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    }
     public void addRectangle() 
    {
       Kwadrat k = new Kwadrat(); // tworzymy obiekt klasy Kwadrat
       myJPanel.add(k); // dodajemy go do panelu
       
       MyRunnable r = new MyRunnable(k,myJPanel); // tworzymy obiekt MyRunnable 
       
       Thread t = new Thread(r); // tworzymy wątek na podstawie obiektu Runnable
       t.start(); // uruchamiamy wątek
       
    }
}

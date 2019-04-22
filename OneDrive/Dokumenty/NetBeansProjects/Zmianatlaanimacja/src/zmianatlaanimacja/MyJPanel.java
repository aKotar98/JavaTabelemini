/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zmianatlaanimacja;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author kotar
 */
public class MyJPanel extends JPanel {
    
    private ArrayList <Kwadrat>kwadraty = new ArrayList<Kwadrat>(); // utworzenie arrayList
    
    public MyJPanel() {
    }
    public void add(Kwadrat k){
    kwadraty.add(k); // dodanie obiektu do arraylist
    }
    public void paintComponent(Graphics g)
    {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g; // rzutowanie obiektu 
    for(Kwadrat k : kwadraty)   
    {   g2.setColor(Color.red); // ustawienie koloru
        g2.fill(k.getShape()); // wypełnienie prostokąta
    }
    
    }
}

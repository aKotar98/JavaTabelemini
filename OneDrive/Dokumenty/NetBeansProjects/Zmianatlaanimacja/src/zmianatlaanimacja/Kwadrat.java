/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zmianatlaanimacja;

import java.awt.geom.Rectangle2D;

/**
 *
 * @author kotar
 */
public class Kwadrat {
    private static final int XSIZE = 50;
    private static final int YSIZE = 50;
    private double x = 50;
    private double y = 50;
    private double dx =2;
    private double dy =2;
    
    public void move(Rectangle2D bounds)
    {
        x+= dx;
        y+= dy;
        if(x<bounds.getMinX())
        {
        x = bounds.getMinX();//współrzędna x lewego górnego wierzchołka
        dx= -dx;
        }
        if(x + XSIZE >= bounds.getMaxX())
        {
        x = bounds.getMaxX() - XSIZE; //współrzędna x prawego dolnego wierzchołka
        dx = - dx;
        }
        if(y< bounds.getMinY())
        {
        y = bounds.getMinY(); //współrzędna y lewgo górnego  wierzchołka
        dy =  - dy;
        }
        if(y + YSIZE >= bounds.getMaxY())
        {
        y = bounds.getMaxY() - YSIZE; //współrzędna y prawego dolnego  wierzchołka
        dy = - dy;
        }
    }
    public Rectangle2D getShape() // określa współrzędne prostokąta w układzie współrzędnych
    {
    return new Rectangle2D.Double(x, y, XSIZE, YSIZE); 
    }
}

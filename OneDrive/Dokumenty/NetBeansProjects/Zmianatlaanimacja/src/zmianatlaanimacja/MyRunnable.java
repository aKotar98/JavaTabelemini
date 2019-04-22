/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zmianatlaanimacja;

import java.awt.Component;

/**
 *
 * @author kotar
 */
public class MyRunnable implements Runnable {
    public static final int STEPS = 5000;
    public static final int DELAY = 5;
    private Kwadrat k;
    private Component component;
  
    public MyRunnable(Kwadrat ak, Component aComponent) {
        k = ak;
        component = aComponent;
       
        
    }
    @Override
    public void run(){
      try
        {
    
   while(true) //for(int i = 1; i <=STEPS;i++) //pętla animacji 
    {
    k.move(component.getBounds()); //poruszanie się kwadratu
    component.repaint(); // wywoluje metode paintComponent
    Thread.sleep(DELAY); // opóźnia wątek
    }
        }
    catch(InterruptedException e)// wyrzuca wyjatek kiedy watek spi lub oczekuje
        {
        }
    
    }
    
}

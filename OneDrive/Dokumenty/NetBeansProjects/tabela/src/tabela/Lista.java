/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabela;

import java.util.ArrayList;

/**
 *
 * @author kotar
 */
public class Lista {
    ArrayList<Pracownik> pracownicy = new ArrayList<>();
    
    
  

    public Lista() {
        pracownicy.add(new Pracownik(1000,"Imie1", "nazwisko1"));
        Pracownik p = new Pracownik(2000,"Adam","Kotarski");
        pracownicy.add(p);
    }

    public Lista(Pracownik p) {
        pracownicy.add(p);
    }
   
    public Pracownik getDane(int index){
     return pracownicy.get(index);
    }
    
    public int getSize(){
        return pracownicy.size();
    }
    
    public void addDane (Pracownik p){
        pracownicy.add(p);
    }
    
    public void setDane (Pracownik p, int row){
        pracownicy.set(row, p);
    }
    
}

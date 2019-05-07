/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelewypozyczalnia;

import java.util.ArrayList;

/**
 *
 * @author kotar
 */
class Lista {
    ArrayList<Samochod> samochody = new ArrayList<>();
    
    public Lista() {
        samochody.add(new Samochod("marka","model","imie","nazwisko"));   // Konstruktor dodajacy samochod do arraylist
        
    }

    public Lista(Samochod s) {
        samochody.add(s);           // konstruktor przyjmujący obiekt Samochod 
    }
   
    public Samochod getDane(int index){
     return samochody.get(index);           //getter zwracajacy obiekt o danym indeksie
    }
    
    public int getSize(){
        return samochody.size();    // zwraca rozmiar listy 
    }
    
    public void addDane (Samochod s){  //dodaje dane do listy
        samochody.add(s);
    }
    
    public void setDane (Samochod s, int row){
        samochody.set(row, s);      //Ustanawia dane na podstawie obiektu w danej kolumnie
    }
    
}

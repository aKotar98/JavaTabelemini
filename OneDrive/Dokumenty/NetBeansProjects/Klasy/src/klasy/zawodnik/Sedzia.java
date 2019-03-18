/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klasy.zawodnik;

/**
 *
 * @author kotar
 */
public class Sedzia extends Zawodnik {
    private int zolta;
    private int czerwona;
    public Sedzia(){}
    public Sedzia(String name,String surename,int age){
    super(name, surename,age);
    zolta = 0;
    czerwona = 0;
    }
    public int IleZoltych(){
    return zolta;
    }
    public int IleCzerwonych(){
    return czerwona;
    }
    public void KolejnaZolta(){
    zolta++;
    }
    public void KolejnaCzerwona(){
    czerwona++;
    }
    public void Wyswietl(){
    System.out.println(" Imie: "+ Imie()+" Nazwisko: "+Nazwisko()+" Wiek: "+Wiek()+" Żółta: "+zolta+" Czerwona: "+czerwona);
    }
    
}

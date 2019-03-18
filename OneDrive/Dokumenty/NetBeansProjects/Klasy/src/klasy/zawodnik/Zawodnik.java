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
public abstract class Zawodnik {
      private String imie;
    private String nazwisko;
    private int wiek;
    public Zawodnik(){}
    public Zawodnik(String name, String surename, int age){
        imie = name;
        nazwisko = surename;
        wiek = age;
    }
    public String Imie(){
    return imie;
    }
    public String Nazwisko(){
    return nazwisko;
    }
    public int Wiek(){
    return wiek;
    }
    public abstract void Wyswietl();
        
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klasy.zawodnik;

import java.util.Scanner;

/**
 *
 * @author kotar
 */
public class Gracz extends Zawodnik {
    
    static Scanner scan = new Scanner(System.in);
    private String nazwa_klubu;
    
    public Gracz(String name,String surename,int age,String nazwa){
        super(name, surename,age);
        nazwa_klubu = nazwa;
    }
    public String Klub(){
    return nazwa_klubu;
    }
    public void ZmienKlub()
    {
      nazwa_klubu = scan.nextLine();
    }
    public void Wyswietl()
    {
        System.out.println(" Imie: "+ Imie()+" Nazwisko: "+Nazwisko()+" Wiek: "+Wiek()+" Klub: "+ nazwa_klubu);
    }
}

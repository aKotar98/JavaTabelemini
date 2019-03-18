/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klasy;
import klasy.zawodnik.Gracz;
import klasy.zawodnik.Zawodnik;
import klasy.zawodnik.Sedzia;
/**
 *
 * @author kotar
 */
public class Klasy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sedzia s =  new Sedzia("Adam", "Kotarski",21);
        Sedzia s2 =  new Sedzia("Paweł", "Grabowski",22);
        Sedzia s3 =  new Sedzia("Andrzej", "Tokarz",21);
       s.Wyswietl();
       s2.Wyswietl();
       s3.Wyswietl();
        for(int i =0;i<4;i++)
       s.KolejnaZolta();
       for(int i =0;i<6;i++)
       s2.KolejnaCzerwona();
       for(int i =0;i<4;i++){
       s3.KolejnaCzerwona(); 
       s3.KolejnaZolta();}
        
       s.Wyswietl();
       s2.Wyswietl();
       s3.Wyswietl();
       
       Gracz g =  new Gracz("Adam", "Kotarski",21,"Górnik Zabrze");
       Gracz g2 =  new Gracz("Paweł", "Grabowski",22,"Klub2");
       Gracz g3 =  new Gracz("Andrzej", "Tokarz",21,"klub3");
        
       g.Wyswietl();
       g2.Wyswietl();
       g3.Wyswietl();
       g.ZmienKlub();
       g3.ZmienKlub();
      
       g.Wyswietl();
       g2.Wyswietl();
       g3.Wyswietl();
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie1.laborki.obecne;
import java.util.Scanner;
  
    public class Zadanie1LaborkiObecne {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int number=0;// tworzymy obiekt klasy scanner
            String decyzja, wys;
            boolean check = true;
            while(check)
            { 
            System.out.println("Podaj liczbę słupków wykresów:");
             number = scanner.nextInt();
            if(number > 4 || number < 1){
                System.out.println("Niepoprawna wartość!");
            System.out.println("Czy chcesz ponownie uruchomić program(t/n)?");
             decyzja = scanner.next();
            }
            else break;
            
            switch(decyzja){
                case "t":
                {   System.out.println("t!");
                    check = true;
                }break;
               
                case "n":
                {
                System.out.println("n!");
                check = false;
                }
                break;
                default:
                {
                  System.out.println("Niepoprawna wartość2!"); 
                  check = true;
                }
                break;
            }
            }
            if(check==false)
            {
            System.exit(0);
            }
            int[] pomocnicza = new int[number];
            for(int i = 1; i <= number; i++){
            System.out.println("Podaj wartość słupka nr." + i +":");    
            int number2 = scanner.nextInt();
            if(number2 >= 60)
            {
            number2 = 60;
            }
            else if(number2 <=0)
            {
                number2 = 0;
            }
            pomocnicza[i-1] = number2;
        }
            
            for(int i = 1; i <= number; i++)
            {   wys = "";
                for(int j =1; j <= pomocnicza[i-1];j++)
                {
                    
                    wys = wys+"0";
                    
                }
                
            System.out.println("  |");    
            System.out.println("  | "+ wys);
            if(pomocnicza[i-1] >=10)
            {
            System.out.println(pomocnicza[i-1] + "| "+wys); 
            }
            else
            {
            System.out.println(pomocnicza[i-1] + " | " + wys); 
            }
            System.out.println("  | "+ wys);
            }
        }
    }

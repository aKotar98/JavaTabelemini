/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.macierze;
import java.util.Scanner;

/**
 *
 * @author kotar
 */
public class JavaMacierze {

    public static double[][]  WprowadzDane(){
        int w,k;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy:");
        do{
       w  = scan.nextInt();
        } while(w < 1);
       System.out.println("Podaj liczbę kolumn:");
       do{
       k  = scan.nextInt();
       }while(k < 1);
       double[][]tab = new double[w][k];
       return tab;
    }
    public static void main(String[] args) {
        double[][] tab = WprowadzDane();
    }
    
}

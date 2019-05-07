/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabela;

/**
 *
 * @author kotar
 */
public class Pracownik {

    int pay;
    String name, surname;

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surname;
    }

    public Pracownik(int payy, String namee, String surnamee) {
        this.name = namee;
        this.surname = surnamee;
        this.pay = payy;

    }

}

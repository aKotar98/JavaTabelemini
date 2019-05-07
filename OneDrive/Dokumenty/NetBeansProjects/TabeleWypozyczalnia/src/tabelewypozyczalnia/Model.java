/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelewypozyczalnia;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kotar
 */
class Model extends AbstractTableModel {

    Lista listadanych = new Lista();

    @Override
    public int getRowCount() {
        return listadanych.getSize(); // zwraca rozmiar listy danych tzn. liczbę wierszy
    }

    @Override
    public int getColumnCount() {
        return 5; //zwraca liczbę kolumn
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { // pobiera wartość komórki

        if (columnIndex == 0) {
            return rowIndex + 1;
        } else if (columnIndex == 1) {
            return listadanych.getDane(rowIndex).getMark();
        } else if (columnIndex == 2) {
            return listadanych.getDane(rowIndex).getModel();
        } else if (columnIndex == 3) {
            return listadanych.getDane(rowIndex).getName();
        } else if (columnIndex == 4) {
            return listadanych.getDane(rowIndex).getSurname();
        } else {
            return null;
        }
    }

    @Override
    public String getColumnName(int i) {  //zwraca nazwę kolumny

        if (i == 0) {
            return "lp.";
        } else if (i == 1) {
            return "Marka";
        } else if (i == 2) {
            return "Model";
        } else if (i == 3) {
            return "Imie";
        } else if (i == 4) {
            return "Nazwisko";
        } else {
            return null;
        }
    }

}

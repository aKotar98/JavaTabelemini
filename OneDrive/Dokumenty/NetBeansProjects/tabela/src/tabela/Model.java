/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabela;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kotar
 */
public class Model extends AbstractTableModel {
    
    Lista o = new Lista();
    

    @Override
    public int getRowCount() {
        return o.getSize();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {

            return rowIndex + 1;
        } else if (columnIndex == 1) {
            return o.getDane(rowIndex).getName();
        } else if (columnIndex == 2) {
            return o.getDane(rowIndex).getSurName();
        } else if (columnIndex == 3) {
            return o.getDane(rowIndex).getPay();
        } else {
            return null;
        }
    }

    @Override
    public String getColumnName(int i) {
        if (i == 0) {
            return "lp.";
        } else if (i == 1) {
            return "Imie";
        } else if (i == 2) {
            return "Nazwisko";
        } else if (i == 3) {
            return "Płaca minimalna";
        } else {
            return null;
        }
    }
public static void main(String[] args) {
        NewJFrame j = new NewJFrame();
        

        j.setVisible(true);
    }
    
}

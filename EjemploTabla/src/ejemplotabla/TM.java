/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotabla;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author andresbaezrincon
 */
public class TM implements TableModel {
    Form interfaz = new Form();
    int filas=3;
    int columnas=5;

    TM(){
        
    }
    @Override
    public int getRowCount() {
        return interfaz.filas;
    }

    @Override
    public int getColumnCount() {
        return interfaz.columnas;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String valor=null;
        if(columnIndex==0)
            valor = "Nombres";
        else
            valor = "Nota "+columnIndex;
        
        return valor;
            
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
      
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    
}

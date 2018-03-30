/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.modelo;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Eduardo Sanchez
 */
public class ModeloTablaDato implements TableModel {

    private ArrayList<Dato> data;

    public ModeloTablaDato(ArrayList<Dato> data) {
        super();
        this.data = data;
    }

    public ModeloTablaDato() {
        data = new ArrayList<>();
    }

    public ArrayList<Dato> getData() {
        return data;
    }

    public void setData(ArrayList<Dato> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombreColumna = "";
        switch (columnIndex) {
            case 0:
                nombreColumna = "ID";
                break;
            case 1:
                nombreColumna = "Accesos";
                break;
            case 2:
                nombreColumna = "Peso";
                break;
            case 3:
                nombreColumna = "Prioridad";
                break;
            default:
                break;
        }
        return nombreColumna;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {

            case 0:
                return String.class;// ID
            case 1:
                return String.class;// Accesos
            case 2:
                return String.class;// Peso
            case 3:
                return Double.class;// Prioridad
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dato temp = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return temp.getName();
            case 1:
                return temp.getAccesos().toString();
            case 2:
                return temp.getTamano()+" Kb";
            case 3:
                return temp.getPrioridad();
            default:
        }
        return temp;
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


package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FlightTableModel extends AbstractTableModel{
    private String[] columns = {"From","To","Depart","Return"};
    private List<Flight> fligts;


    
    public FlightTableModel(List<Flight> fligts){
        this.fligts = fligts;
    }
    
    @Override
    public int getRowCount() {
        return fligts.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Flight flight = fligts.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return flight.getFromDestination();
            case 1:
                return flight.getToDestination();
            case 2:
                return flight.getDepartDate();
            case 3:
                return flight.getReturnDate();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    
    
}

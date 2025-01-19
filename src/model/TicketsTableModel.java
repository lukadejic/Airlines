
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TicketsTableModel extends AbstractTableModel {
    private List<Ticket> tickets;
    String[] columns = {"ID","From","To","Depart","Return","Baggage","Insurance","Class","Passengers","Price","Customer"};
    
    public TicketsTableModel(List<Ticket> tickets){
        this.tickets = tickets;
    }
    
    @Override
    public int getRowCount() {
        return tickets.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Ticket ticket = tickets.get(rowIndex);
        
        return switch (columnIndex) {
            case 0 -> ticket.getId();
            case 1 -> ticket.getFrom();
            case 2 -> ticket.getTo();
            case 3 -> ticket.getDepartTime();
            case 4 -> ticket.getReturnTime();
            case 5 -> ticket.getBaggage();
            case 6 -> ticket.getInsurance();
            case 7 -> ticket.getTravelClass();
            case 8 -> ticket.getPassengers();
            case 9 -> ticket.getPrice();
            case 10 -> ticket.getCustomer();
            default -> "N/A";
        };
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    
    
}

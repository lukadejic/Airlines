
package forms;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Passenger;

public class PassengerTableModel extends AbstractTableModel{

    private List<Passenger> passengers;
    private String[] columns = {"id","First Name","Last Name",
        "Address","Birthday","State","Gender","Phone","Passport","Picture"};
    
    public PassengerTableModel(List<Passenger> passengers){
        this.passengers = passengers;
    }
    
    
    @Override
    public int getRowCount() {
        return passengers.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Passenger passenger = passengers.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return passenger.getId();
            case 1: return passenger.getFirstName();
            case 2: return passenger.getLastName();
            case 3: return passenger.getAddress();
            case 4: 
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
                    return dateFormat.format(passenger.getBirthDate());
            case 5: return passenger.getState();
            case 6: return passenger.getGender();
            case 7: return passenger.getPhoneNumber();
            case 8: return passenger.getPassport();
            case 9: return passenger.getUserimage();
            default: return "N/A";
        }
    }
    
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
}

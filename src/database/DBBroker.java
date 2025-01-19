
package database;
import java.awt.Image;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import model.Passenger;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import model.Airline;
import model.Flight;
import model.Ticket;



public class DBBroker {

    public static String getPutnikId() {
        try {
            String querry = "select MAX(jmbg) from ABP.putnik";
            
            Statement st = DBConnection.getInstance().getConnection().createStatement();
            ResultSet rs = st.executeQuery(querry);
            rs.next();
            
            String id = rs.getString("MAX(jmbg)");
            
            if (id == null){
                return "P001";
            }else{
                int id1 = Integer.parseInt(id.substring(2,id.length()));
                id1++;
                return String.format("%03d", id1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }

    public int addPassangerToDataBase(String firstName, String lastName, String passport, String address, String date,String state, String gender, String phoneNumber,byte[] userimage) {
        String querry = "insert into ABP.Passenger(name,lastname,address,date,state,gender,phoneNumber,passport,picture)"
                + " values (?,?,?,?,?,?,?,?,?)";
        String checkQuery = "SELECT COUNT(*) FROM ABP.Passenger WHERE passport = ? and name = ?";
        try {
            
            PreparedStatement checkPs = DBConnection.getInstance().getConnection().prepareStatement(checkQuery);
            checkPs.setString(1, passport);
            checkPs.setString(2, firstName);
            ResultSet checkRs = checkPs.executeQuery();
            if (checkRs.next() && checkRs.getInt(1) > 0) {
                return 0;
            }
            
            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, address);
            ps.setString(4, date);
            ps.setString(5, state);
            ps.setString(6, gender);
            ps.setString(7, phoneNumber);
            ps.setString(8, passport);
            ps.setBytes(9, userimage);
            ps.executeUpdate();
            DBConnection.getInstance().getConnection().commit();
            return 1;
        } catch (SQLException ex) {
            System.out.println("Error while adding passanger to the database...");
        }
        return 0;
    }

    public Passenger fetchPassenger(String id) {
//        String querry = "select * from ABP.Passenger where jmbg=?";
//        
//        try {
//            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
//            ps.setString(1, id);
//            
//            ResultSet rs = ps.executeQuery();
//            
//            if(rs.next()){
//                try{
//                    String firstName = rs.getString("ime");
//                    String lastName = rs.getString("prezime");
//                    String brojPasosa = rs.getString("brojPasosa");
//                    String address = rs.getString("adresa");
//                    String dob = rs.getString("datumRodjenja").trim();
//                    Date birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
//                    String gender = rs.getString("pol");
//                    String phoneNumber = rs.getString("brojTelefona");
//                    ImageIcon image = fetchPassengerImage(rs);
//                    Passenger passenger = new Passenger(id, firstName, lastName, brojPasosa, address, birthDate, gender, phoneNumber, image);
//                    return passenger; 
//                    
//                }catch(SQLException | ParseException e){
//                    System.out.println("Error while fetching the passenger" + e);
//                }
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
        return null;
    }

    private ImageIcon fetchPassengerImage(ResultSet rs) {
        try {
            Blob blob = rs.getBlob("picture");
            
            if(blob == null){
                return null;
            }
            
            byte[] imageBytes = blob.getBytes(1,(int) blob.length());
            ImageIcon imageIcon = new ImageIcon(imageBytes);
            Image image = imageIcon.getImage();
            Image myImage = image.getScaledInstance(152, 123, Image.SCALE_SMOOTH);
            ImageIcon newImage = new ImageIcon(myImage);
            return newImage;
        } catch (SQLException ex) {
            System.out.println("Error while fetching the passenger image...");
        }
        
        return null;
    }

    public void updatePassanger(String id,String firstName, String lastName, String address, String date, String state, String gender, String phoneNumber,String passport, byte[] userimage) {
        String querry = "update ABP.Passenger set name=?,lastname=?,address=?,"
                + "date=?,state=?,gender=?,phoneNumber=?,passport=?,picture=? where id=?";
        
        try {
            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, address);
            ps.setString(4, date);
            ps.setString(5, state);
            ps.setString(6, gender);
            ps.setString(7, phoneNumber);
            ps.setString(8, passport);
            ps.setBytes(9, userimage);
            ps.setString(10, id);
            ps.executeUpdate();
            DBConnection.getInstance().getConnection().commit();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Airline logIn(String username, String password) {
        String querry = "select * from ABP.airlines where username = ? and password = ?";
        
        try {
            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
            ps.setString(1, username);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                Airline airline = new Airline(id, name, email, phone, username, password);
                return airline;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

    public boolean signUp(String username, String password, String email, String phone, String name) {
        String checkQuerry = "select * from  ABP.airlines where name = ?";
        String querry = "insert into ABP.airlines (username,password,email,phone,name) values (?,?,?,?,?)";
        
        try {
            PreparedStatement checkPs = DBConnection.getInstance().getConnection().prepareStatement(checkQuerry);
            checkPs.setString(1, name);
            ResultSet rs = checkPs.executeQuery();
            
            if(rs.next()){
                return false;
            }
            
            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, name);
            ps.executeUpdate();
            
            DBConnection.getInstance().getConnection().commit();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<Passenger> fetchAllPassengers() throws ParseException {
        List<Passenger> passengers = new ArrayList<>();
        String querry = "select * from ABP.Passenger";
        
        try {
            Statement st = DBConnection.getInstance().getConnection().createStatement();
            
            ResultSet rs = st.executeQuery(querry);
            
            while(rs.next()){
                String id = rs.getString("id");
                String firstName = rs.getString("name");
                String lastName = rs.getString("lastname");
                String address = rs.getString("address");
                String dob = rs.getString("date").trim();
                Date birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
                String state = rs.getString("state");
                String gender = rs.getString("gender");
                String phoneNumber = rs.getString("phoneNumber");
                String passport = rs.getString("passport");
                ImageIcon image = fetchPassengerImage(rs);
                Passenger passenger = new Passenger(id, firstName, lastName, address, birthDate, state, gender, phoneNumber, passport,image);
                passengers.add(passenger);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return passengers;
    }

    public int removePassenger(int id) {
        String querry = "delete from ABP.Passenger where id=?";
        
        try {
            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            DBConnection.getInstance().getConnection().commit();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public Flight searchFlight(String from, String to, String departDate, String returnDate) {
       
        String querry = "SELECT * FROM ABP.Flights where "
                + "fromDestination = ? AND toDestination = ? AND"
                + " LEFT(departDate,11) = ?";
        
        if(returnDate != null){
            querry += "AND (LEFT(returnDate,11) = ?)";
        }
        
        try {
            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
            ps.setString(1, from);
            ps.setString(2, to);
            ps.setString(3, departDate);
            
            if(returnDate != null){
                ps.setString(4, returnDate);
            }
            
            ResultSet rs = ps.executeQuery();
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy",Locale.ENGLISH);
            
            while(rs.next()){
//                double basePrice = rs.getDouble("price") * passengers;
//                
//                if(returnDate != null){
//                    basePrice += basePrice * 0.3;
//                }
//                
                String departDateString = rs.getString("departDate");
                System.out.println(departDateString);
                Date departDate1 = dateFormat.parse(departDateString);
                String returnDateString = rs.getString("returnDate");
                Date returnDate1 = null;
                if (returnDateString != null && !returnDateString.equals("")) {
                    returnDate1 = dateFormat.parse(returnDateString);
                }
                Flight flight = new Flight(rs.getInt("id"), from, to, departDate1, returnDate1);
                return flight;
            }
            
            
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    public Flight returnFlight(String from, String to, String departDate, String returnDate, int passengers) {
        String querry = "SELECT * FROM ABP.Flights where "
                + "fromDestination = ? AND toDestination = ? AND"
                + " LEFT(departDate,11) = ?";
        
        if(returnDate != null){
            querry += "AND (LEFT(returnDate,11) = ?)";
        }
        
        try {
            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
            ps.setString(1, from);
            ps.setString(2, to);
            ps.setString(3, departDate);
            
            if(returnDate != null){
                ps.setString(4, returnDate);
            }
            
            ResultSet rs = ps.executeQuery();
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy",Locale.ENGLISH);
            
            while(rs.next()){
                double basePrice = rs.getDouble("price") * passengers;
                
                if(returnDate != null){
                    basePrice += basePrice * 0.3;
                }
                
                String departDateString = rs.getString("departDate");
                System.out.println(departDateString);
                Date departDate1 = dateFormat.parse(departDateString);
                String returnDateString = rs.getString("returnDate");
                Date returnDate1 = null;
                if (returnDateString != null && !returnDateString.equals("")) {
                    returnDate1 = dateFormat.parse(returnDateString);
                }
                Flight flight = new Flight(rs.getInt("id"), from, to, departDate1, returnDate1,passengers,basePrice);
                return flight;
            }
            
            
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    public int payment(String cardNumber, String expiryDate, String securityCode, String cardholderName,double amount) {
        String querry = "SELECT money FROM ABP.Cards WHERE cardNumber = ? AND expiryDate = ? "
                + "AND securityCode = ? AND cardholderName = ?";
        
        try {
            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
            ps.setString(1, cardNumber);
            ps.setString(2, expiryDate);
            ps.setString(3, securityCode);
            ps.setString(4, cardholderName);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                double currentAmount = rs.getDouble("money");
                
                if(currentAmount >= amount){
                    updateCardBalance(cardNumber, currentAmount - amount);
                    System.out.println("PAYMENT SUCCEFUL: payment succesfull");
                    return 1;
                }else{
                    System.out.println("PAYMENT FAILED: insuficient amount");
                    return 2;
                }
            }else{
                System.out.println("PAYMENT FAILED: invalid user info provided");
                return 3;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    private void updateCardBalance(String cardNumber, double updatedAmount) {
        String querry = "UPDATE ABP.Cards set money = ? where cardNumber = ?";
        
        try {
            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
            ps.setDouble(1, updatedAmount);
            ps.setString(2, cardNumber);
            ps.executeUpdate();
            DBConnection.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean bookTicket(String fromDestination, String toDestination, String departDate, String returnDate, String baggage, String insurance, String flightClass, int passengers, double totalPrice,Passenger passenger) {
        String querry = "INSERT INTO ABP.BookedFlights (fromDestination,toDestination,departTime,returnTime,"
                + "baggage,insurance,class,passengers,price,customer) VALUES (?,?,?,?,?,?,?,?,?,?) ";
        
        try {
            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
            ps.setString(1, fromDestination);
            ps.setString(2, toDestination);
            ps.setString(3,departDate);
            ps.setString(4,returnDate);
            ps.setString(5,baggage);
            ps.setString(6,insurance);
            ps.setString(7,flightClass);
            ps.setInt(8,passengers);
            ps.setDouble(9,totalPrice);
            ps.setString(10, passenger.getFirstName() + " " + passenger.getLastName());
            
            ps.executeUpdate();
            DBConnection.getInstance().getConnection().commit();
            System.out.println("Ticket booked succefuly");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return false;
    }

    public Passenger logInCustomer(String username, String password) throws ParseException {
        String querry = "SELECT * FROM ABP.Passenger where username = ? AND password = ?";
        
        try {
            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
            ps.setString(1, username);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                String id = String.valueOf(rs.getInt("id"));
                String name = rs.getString("name");
                String lastName = rs.getString("lastname");
                String address = rs.getString("address");
                String state = rs.getString("state");
                String gender = rs.getString("gender");
                String phoneNumber = rs.getString("phoneNumber");
                String passport = rs.getString("passport");
                String dob = rs.getString("date").trim();
                Date birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
                ImageIcon image = fetchPassengerImage(rs);
                Passenger passenger = new Passenger(id, name, lastName, 
                        address, birthDate, state, gender, phoneNumber, passport, image);
                return passenger;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return null;
    }

    public List<Ticket> fetchTickets() {
        List<Ticket> tickets = new ArrayList<>();
        String querry = "SELECT * FROM ABP.BookedFlights";
        
        try {
            Statement st = DBConnection.getInstance().getConnection().createStatement();
            
            ResultSet rs = st.executeQuery(querry);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String from = rs.getString("fromDestination");
                String to = rs.getString("toDestination");
                String departTime = rs.getString("departTime");
                String returnTime = rs.getString("returnTime");
                String baggage = rs.getString("baggage");
                String insurance = rs.getString("insurance");
                String travelClass = rs.getString("class");
                int passengers = rs.getInt("passengers");
                double price = rs.getDouble("price");
                String customer = rs.getString("customer");
                Ticket ticket = new Ticket(id, from, to, departTime, returnTime, baggage, insurance, travelClass, passengers, price, customer);
                tickets.add(ticket);
            }
            return tickets;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    public boolean updateTicket(int id, String from, String to, String departDate, String returnDate, String baggage, String insurance, String travelClass, int passengers, double price, String customer) {
        String querry = "UPDATE ABP.BookedFlights SET fromDestination=?, toDestination=?, departTime=?, returnTime=?, "
                + "baggage=?, insurance=?, class=?, passengers=?, price=?, customer=? WHERE id=?";
        
        try {
            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
            ps.setString(1, from);
            ps.setString(2, to);
            ps.setString(3, departDate);
            ps.setString(4, returnDate);
            ps.setString(5, baggage);
            ps.setString(6, insurance);
            ps.setString(7, travelClass);
            ps.setInt(8, passengers);
            ps.setDouble(9, price);
            ps.setString(10, customer);
            ps.setInt(11, id);
            
            ps.executeUpdate();
            System.out.println("Ticket updated succesfully");
            return true;
        } catch (SQLException ex) {
            System.out.println("Error while updating ticket: "+ ex.getLocalizedMessage());
        }
        
        return false;
    }

    public boolean removeTicket(int id) {
        String querry = "DELETE FROM ABP.BookedFlights WHERE id = ?";
        
        try{
            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
            ps.setInt(1, id);
            ps.executeUpdate();
            DBConnection.getInstance().getConnection().commit();
            return true;
        }catch(SQLException ex){
            System.out.println("Failed to remove the ticket: " + ex.getLocalizedMessage());
        }
        return false;
    }

    public boolean addFlight(String from, String to, String departDate, String returnDate, double price) {
        String querry = "INSERT INTO ABP.Flights (fromDestination,toDestination,departDate,returnDate,price) "
                + "VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = DBConnection.getInstance().getConnection().prepareStatement(querry);
            ps.setString(1, from);
            ps.setString(2, to);
            ps.setString(3, departDate);
            ps.setString(4, returnDate);
            ps.setDouble(5, price);
            ps.executeUpdate();
            DBConnection.getInstance().getConnection().commit();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error while adding flight: " + ex.getLocalizedMessage());
        }
        return false;
    }

    public List<Flight> returnFlights() {
        List<Flight> flights = new ArrayList<>();
        String querry = "SELECT * FROM ABP.Flights";
        
        try {
            Statement st = DBConnection.getInstance().getConnection().createStatement();
            ResultSet rs = st.executeQuery(querry);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String from = rs.getString("fromDestination");
                String to = rs.getString("toDestination");
                Flight flight = new Flight(id, from, to, null, null);
                flights.add(flight);         
            }
            return flights;
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
}

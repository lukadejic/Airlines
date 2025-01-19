
package controller;

import database.DBBroker;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Airline;
import model.Flight;
import model.Passenger;
import model.Ticket;


public class Controller {
    private static Controller instance;
    private DBBroker broker;
    private List<Flight> flights = new ArrayList<>();
    
    public static Controller getInstace(){
        if (instance == null){
            instance = new Controller();
        }
        return instance;
    }

    public Controller() {
        broker = new DBBroker();
        Flight flight1 = new Flight(1, "Belgrade", "Malta", new Date(1704067200000L), new Date(1704672000000L), 5, 0);
        flights.add(flight1);
    }

    public String getPutnikId() {
        return broker.getPutnikId();
    }



    public Passenger getPassenger(String id) {
        return broker.fetchPassenger(id);
    }

    public void updatePassenger(String id,String firstName, String lastName, String address, String date, String state, String gender, String phoneNumber, String passport,byte[] userimage) {
        broker.updatePassanger(id,firstName,lastName,address,date,state,gender,phoneNumber,passport,userimage);
    }

    public Airline logIn(String username, String password) {
        return broker.logIn(username,password);
    }

    public boolean signUp(String username, String password, String email, String phone, String name) {
       return broker.signUp(username,password,email,phone,name);
    }

    public List<Passenger> returnAllPassengers() throws ParseException {
        return broker.fetchAllPassengers();
    }

    public int addPassangerToDataBase(String firstName, String lastName, String address, String date, String state, String gender, String phoneNumber, String passport, byte[] userimage) {
        return broker.addPassangerToDataBase(firstName, lastName, passport, address, date, state, gender, phoneNumber, userimage);
    }

    public int removePassenger(int id) {
        return broker.removePassenger(id);
    }

    public List<Flight> returnFlights(){
        return broker.returnFlights();
    }

    public Flight searchFlight(String from, String to, String departDate, String returnDate) {
        return broker.searchFlight(from,to,departDate,returnDate);
    }

    public Flight returnFlight(String from, String to, String departDate, String returnDate, int passangers) {
        return broker.returnFlight(from,to,departDate,returnDate,passangers);
    }

    public int payment(String cardNumber, String expiryDate, String securityCode, String cardholderName, double amount) {
        return broker.payment(cardNumber,expiryDate,securityCode,cardholderName,amount);
    }

    public boolean bookTicket(String fromDestination, String toDestination, String departDate, String returnDate, String baggage, String insurance, String flightClass, int passengers, double totalPrice,Passenger passenger) {
        return broker.bookTicket(fromDestination,toDestination,departDate,returnDate,baggage,insurance,flightClass,passengers,totalPrice,passenger);
    }

    public Passenger logInCustomer(String username, String password) throws ParseException {
        return broker.logInCustomer(username, password);
    }

    public List<Ticket> getTickets() {
        return broker.fetchTickets();
    }

    public boolean updateTicket(int id, String from, String to, String departDate, String returnDate, String baggage, String insurance, String travelClass, int passengers, double price, String customer) {
        return broker.updateTicket(id,from,to,departDate,returnDate,baggage,insurance,travelClass,passengers,price,customer);
    }

    public boolean removeTicket(int id) {
        return broker.removeTicket(id);
    }

    public boolean addFlight(String from, String to, String departDate, String returnDate, double price) {
        return broker.addFlight(from,to,departDate,returnDate,price);
    }

    
}

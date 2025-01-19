
package model;

import java.util.Date;

public class Flight {
    private int id;
    private String fromDestination;
    private String toDestination;
    private Date departDate;
    private Date returnDate;
    private int passengers;
    private double price;

    public Flight() {
    }

    public Flight(int id, String fromDestination, String toDestination, Date departDate, Date returnDate, int passengers, double price) {
        this.id = id;
        this.fromDestination = fromDestination;
        this.toDestination = toDestination;
        this.departDate = departDate;
        this.returnDate = returnDate;
        this.passengers = passengers;
        this.price = price;
    }

    public Flight(int id, String fromDestination, String toDestination, Date departDate, Date returnDate) {
        this.id = id;
        this.fromDestination = fromDestination;
        this.toDestination = toDestination;
        this.departDate = departDate;
        this.returnDate = returnDate;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFromDestination() {
        return fromDestination;
    }

    public void setFromDestination(String fromDestination) {
        this.fromDestination = fromDestination;
    }

    public String getToDestination() {
        return toDestination;
    }

    public void setToDestination(String toDestination) {
        this.toDestination = toDestination;
    }

    public Date getDepartDate() {
        return departDate;
    }

    public void setDepartDate(Date departDate) {
        this.departDate = departDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight{" + "id=" + id + ", fromDestination=" +
                fromDestination + ", toDestination=" + toDestination + ", "
                + "departDate=" + departDate + ", returnDate=" + returnDate + ", "
                + "passengers=" + passengers + ", price=" + price + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Flight other = (Flight) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    public double calculatePrice(Double price){
        Double sum = price * passengers;
        return sum;
    }
    
}

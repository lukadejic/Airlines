package model;

import java.util.Objects;

public class Ticket {

    private int id;
    private String from;
    private String to;
    private String departTime;
    private String returnTime;
    private String baggage;
    private String insurance;
    private String travelClass;
    private int passengers;
    private double price;
    private String customer;

    public Ticket() {
    }

    public Ticket(int id, String from, String to, String departTime, String returnTime, String baggage, String insurance, String travelClass, int passengers, double price, String customer) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.departTime = departTime;
        this.returnTime = returnTime;
        this.baggage = baggage;
        this.insurance = insurance;
        this.travelClass = travelClass;
        this.passengers = passengers;
        this.price = price;
        this.customer = customer;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    public String getBaggage() {
        return baggage;
    }

    public void setBaggage(String baggage) {
        this.baggage = baggage;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Ticket other = (Ticket) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.from, other.from)) {
            return false;
        }
        if (!Objects.equals(this.to, other.to)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ticket{" + "id=" + id + ", from=" + from + ", to=" + to + ", departTime=" + departTime + ", returnTime=" + returnTime + ", baggage=" + baggage + ", insurance=" + insurance + ", travelClass=" + travelClass + ", passengers=" + passengers + ", price=" + price + ", customer=" + customer + '}';
    }
    
    

}

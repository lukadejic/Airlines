
package model;

import java.util.Date;
import java.util.Objects;
import javax.swing.ImageIcon;

public class Passenger {
    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private Date birthDate;
    private String state;
    private String gender;
    private String phoneNumber;
    private String passport;
    private ImageIcon imageIcon = new ImageIcon();

    public Passenger() {
    }

    public Passenger(String id, String firstName, String lastName, String address, Date birthDate, String state, String gender, String phoneNumber, String passport,ImageIcon imageIcon) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthDate = birthDate;
        this.state = state;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.passport = passport;
        this.imageIcon = imageIcon;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ImageIcon getUserimage() {
        return imageIcon;
    }

    public void setUserimage(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public String toString() {
        return "Passenger{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", birthDate=" + birthDate + ", state=" + state + ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", passport=" + passport + ", imageIcon=" + imageIcon + '}';
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
        final Passenger other = (Passenger) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}

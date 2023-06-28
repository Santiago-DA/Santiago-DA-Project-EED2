/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructures;

/**
 *
 * @author Santiago Aristimuño
 */
public class Reservation implements Comparable<Reservation> {

    
    int CI;
    String name;
    String lastName;
    public String email;
    public String gender;
    public String roomType;
    public String phoneNumber;
    public String arriveDate;
    public String exitDate;

    public Reservation(int CI, String name, String lastName, String email, String gender, String roomType, String phoneNumber, String arriveDate, String exitDate) {
        this.CI = CI;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.roomType = roomType;
        this.phoneNumber = phoneNumber;
        this.arriveDate = arriveDate;
        this.exitDate = exitDate;
    }
    public String fullName(){
        return name+" "+lastName;
    }
    
    public int compareTo(Reservation o) {
        if (this.CI == o.CI){
            return 0;
        }else if (this.CI > o.CI){
            return 1;
        }else{
            return -1;
        }
        
    }
    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }
    

    @Override
    public String toString() {
        String firstLine = name+" "+lastName+" - Room: "+roomType+"\n";
        String secondLine = "CI: "+CI+" "+gender+"\n";
        String thirdLine = phoneNumber+" - "+email+"\n";
        String lastLine = arriveDate+" "+exitDate;
        return firstLine+secondLine+thirdLine+lastLine;
    }

    public String getRoomType() {
        return roomType;
    }
    
    
    
    
}
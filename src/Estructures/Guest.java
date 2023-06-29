/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructures;

/**
 *
 * @author Santiago Aristimuño
 */
public class Guest {
    public int CI;
    public int roomNumber;
    public String name;
    public String lastName;
    public String email;
    public String gender;
    public String phoneNumber;
    public String arriveDate;

    public Guest(int CI,int roomNumber, String name, String lastName, String email, String gender, String phoneNumber, String arriveDate) {
        this.CI = CI;
        this.roomNumber = roomNumber;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.arriveDate = arriveDate;
    }
    public String getFullName(){
        return name+" "+lastName;
    }
    @Override
    public String toString(){
        return this.getFullName()+" - Room: "+this.roomNumber;
    }
}

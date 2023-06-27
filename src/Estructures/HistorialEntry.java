/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructures;

/**
 *
 * @author Santiago Aristimuño
 */
public class HistorialEntry {
    String CI;
    String name;
    String lastName;
    String email;
    String gender;
    String arriveDate;
    public int roomNumber;

    public HistorialEntry(String CI, String name, String lastName, String email, String gender, String arriveDate, int roomNumber) {
        this.CI = CI;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.arriveDate = arriveDate;
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return name+" "+lastName;
    }
    
    
}

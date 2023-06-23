/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructures;

import java.util.ArrayList;

/**
 *
 * @author Santiago Aristimuño
 */
public class Room {
    int roomNumber;
    String type;
    int floor;
    ArrayList historial;
    boolean isEmpty;

    public Room(int roomNumber, String type, int floor) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.floor = floor;
        this.historial = new ArrayList<>();  //REMENBER TO PUT THE DATA TYPE
        this.isEmpty = true;
    }
    
}

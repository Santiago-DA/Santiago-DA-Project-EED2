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
public class Room implements Comparable<Room> {
    public int roomNumber;
    String type;
    int floor;
    public ArrayList historial;
    public boolean isEmpty;

    public Room(int roomNumber, String type, int floor) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.floor = floor;
        this.historial = new ArrayList<HistorialEntry>();  //REMENBER TO PUT THE DATA TYPE
        this.isEmpty = true;
    }

    @Override
    public int compareTo(Room o) {
        if (this.roomNumber == o.roomNumber){
            return 0;
        }else if (this.roomNumber > o.roomNumber){
            return 1;
        }else{
            return -1;
        }
        
    }

    @Override
    public String toString() {
        return this.roomNumber+"";
    }
    
}

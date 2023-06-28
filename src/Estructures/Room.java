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

    public String getType() {
        return type;
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
    public String roomHistorial(){
        String firstLine = type+" "+floor+"-"+roomNumber+"\n";
        StringBuilder s = new StringBuilder("Historial: \n");
        for (int i=0;i<historial.size();i++){
            s.append(historial.get(i).toString()).append("\n");
        }
        return firstLine+s.toString();
    }
}

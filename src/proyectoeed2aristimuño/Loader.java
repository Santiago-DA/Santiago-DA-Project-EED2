/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeed2aristimuño;

import Estructures.Room;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Santiago Aristimuño
 */
public class Loader {
    String dataPath = "src\\FileData";
    
    public Object[] loadRooms(){
        String fileName = dataPath + "\\Booking_hotel - habitaciones.csv";
        BufferedReader reader = null;
        String line = "";
        try{
            ArrayList rooms = new ArrayList();
            reader = new BufferedReader(new FileReader(fileName));
            reader.readLine();
            while((line = reader.readLine())!= null){
                String[] temp = line.split(",");
                int rNum = Integer.parseInt(temp[0]);
                int floor = Integer.parseInt(temp[2]);
                Room currentRoom = new Room(rNum,temp[1],floor);
                rooms.add(currentRoom);
                
                
            }
            return rooms.toArray();
            
        }catch (Exception e){
            
        }
        return null;
    }
}

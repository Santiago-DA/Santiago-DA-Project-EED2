/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeed2aristimuño;

import Estructures.Guest;
import Estructures.HistorialEntry;
import Estructures.Reservation;
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
            ArrayList<Room> rooms = new ArrayList();
            reader = new BufferedReader(new FileReader(fileName));
            reader.readLine();
            while((line = reader.readLine())!= null){
                String[] temp = line.split(",");
                int rNum = Integer.parseInt(temp[0]);
                int floor = Integer.parseInt(temp[2]);
                Room currentRoom = new Room(rNum,temp[1],floor);
                rooms.add(currentRoom);
                
                
            }
            return rooms.toArray(new Room[rooms.size()]);
            
        }catch (Exception e){
            
        }
        return null;
    }
    public Object[] loadReservations(){
        String fileName = dataPath + "\\Booking_hotel - reservas.csv";
        BufferedReader reader = null;
        String line = "";
        try{
            ArrayList<Reservation> reservs = new ArrayList();
            reader = new BufferedReader(new FileReader(fileName));
            reader.readLine();
            while((line = reader.readLine())!= null){
                String[] temp = line.split(",");
                String CI = temp[0];
                String name = temp[1];
                String lastName = temp[2];
                String email = temp[3];
                String gender = temp[4];
                String roomType = temp[5];
                String phoneNumber = temp[6];
                String arriveDate = temp[7];
                String exitDate = temp[8];
                Reservation reservation = new Reservation(CI,name,lastName,email,gender,roomType,phoneNumber,arriveDate,exitDate);
                reservs.add(reservation);
                
            }
            return reservs.toArray(new Reservation[reservs.size()]);
        }catch (Exception e){
            
        }
        return null;
    }
    public Object[] loadHistorial(){
        String fileName = dataPath + "\\Booking_hotel - Histórico.csv";
        BufferedReader reader = null;
        String line = "";
        try{
            ArrayList<HistorialEntry> historials = new ArrayList();
            reader = new BufferedReader(new FileReader(fileName));
            reader.readLine();
            while((line = reader.readLine())!= null){
                String[] temp = line.split(",");
                String CI = temp[0];
                String name = temp[1];
                String lastName = temp[2];
                String email = temp[3];
                String gender = temp[4];
                String arriveDate = temp[5];
                int roomNumber = Integer.parseInt(temp[6]);
                HistorialEntry hist = new HistorialEntry(CI,name,lastName,email,gender,arriveDate,roomNumber);
                historials.add(hist);
            } 
            return historials.toArray(new HistorialEntry[historials.size()]);
        }catch (Exception e){
            
        }
        return null;
    }
    public Object[] loadCurrentGuests(){
        String fileName = dataPath + "\\Booking_hotel - estado.csv";
        BufferedReader reader = null;
        String line = "";
        try{
            ArrayList<Guest> guests = new ArrayList();
            reader = new BufferedReader(new FileReader(fileName));
            reader.readLine();
            while((line = reader.readLine())!= null){
                
                String[] temp = line.split(",");
                if (!temp[0].equals("")){
                    int roomNumber = Integer.parseInt(temp[0].trim());
                    String name = temp[1];
                    String lastName = temp[2];
                    String email = temp[3];
                    String gender = temp[4];
                    String phoneNumber = temp[5];
                    String arriveDate = temp[6];
                    Guest guest = new Guest(roomNumber, name, lastName, email, gender, phoneNumber, arriveDate);

                    guests.add(guest);
                }    
            }
            return guests.toArray(new Guest[guests.size()]);
        }catch (Exception e){
            
        }
        return null;
    }
}

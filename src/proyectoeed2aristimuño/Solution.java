/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeed2aristimuño;
import Estructures.Guest;
import Estructures.HistorialEntry;
import Estructures.Node;
import Estructures.Room;
import Estructures.HashTable;
/**
 *
 * @author Santiago Aristimuño
 */
public class Solution {
    public Node roomToBST(Object[] rooms,int start, int end){
        if (start > end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node((Comparable) rooms[mid]);
        root.setLeftChild(roomToBST(rooms,start,mid-1));
        root.setRightChild(roomToBST(rooms,mid+1,end));
        return root;
    }
    private void updateRoomHistorial(Room[] rooms, HistorialEntry[] historials){
        for (Room room:rooms){
            for (HistorialEntry historial:historials){
                if (room.roomNumber == historial.roomNumber){
                    room.historial.add(historial);
                }
            }
        }
    }
    private void updateRoomAvailability(Room[] rooms, Guest[] guests){
        for (Room room:rooms){
            for(Guest guest:guests){
                if (room.roomNumber == guest.roomNumber){
                    room.isEmpty = false;
                }
            }
        }
    }
    public void updateRooms(Room[] rooms, HistorialEntry[] historials, Guest[] guests){
        this.updateRoomAvailability(rooms, guests);
        this.updateRoomHistorial(rooms, historials);
    }
    
}

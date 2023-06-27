/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeed2aristimuño;
import Estructures.Guest;
import Estructures.HistorialEntry;
import Estructures.Node;
import Estructures.Room;
import Estructures.Reservation;
/**
 *
 * @author Santiago Aristimuño
 */
public class Solution {
    public Node roomToBST(Room[] rooms,int start, int end){
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
    public void sortReservations(Reservation[] reservs){
        int n = reservs.length;
        Reservation temp;
        for (int i=0;i<n-1;i++){
            boolean swapped = false;
            for (int j=0;j<n-1;j++){
                if (reservs[j].getCI() > reservs[j+1].getCI()){
                    temp = reservs[j];
                    reservs[j] = reservs[j+1];
                    reservs[j+1] = temp;
                    swapped = true;
                }
            }
        }
    }
    public Reservation reservsBinarySearch(Reservation[] reservs, int CI, int first, int last){
        int mid = (first+last)/2;
        while(first<=last){
            if (reservs[mid].getCI() < CI){
                first = mid+1;
            }else if (reservs[mid].getCI() == CI){
                return reservs[mid];
            }else{
                last = mid-1;
            }
            mid = (first+last)/2;
        }
        return null;
    }
    public Room findRoomInBST(Node root, int data){
        
        Room temp = new Room(data,"ex",0);
        if (root == null){
            return null;
        }else if (root.getData().compareTo(temp) == 0){
            return (Room) root.getData();
        }else if (root.getData().compareTo(temp) == 1){
            return findRoomInBST(root.getLeftChild(), data);
        }else if (root.getData().compareTo(temp) == -1){
            return findRoomInBST(root.getRightChild(), data);
        }
        return null;
    }
}

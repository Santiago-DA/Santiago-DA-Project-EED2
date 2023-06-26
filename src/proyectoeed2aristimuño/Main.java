/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoeed2aristimuño;
import Estructures.BinarySearchTree;
import Estructures.Guest;
import Estructures.HashTable;
import Estructures.HistorialEntry;
import Estructures.Node;
import Estructures.Reservation;
import Estructures.Room;
import Windows.MainUI;
/**
 *
 * @author Santiago Aristimuño
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Loader loader = new Loader();
        Solution solution = new Solution();
        //loads
        
        Room[] rooms = (Room[]) loader.loadRooms();
        Reservation[] reservs = (Reservation[]) loader.loadReservations();
        HistorialEntry[] historials = (HistorialEntry[]) loader.loadHistorial();
        Guest[] guests = (Guest[]) loader.loadCurrentGuests();
        
        //check Casts
        //update rooms and BST
        /*solution.updateRooms(rooms, historials, guests);
        Node root = solution.roomToBST(rooms, 0, rooms.length-1);
        BinarySearchTree BSTree = new BinarySearchTree();
        BSTree.setRoot(root);
        //Hash table
        HashTable<String, Guest> hashTable = new HashTable<String, Guest>();
        for (Guest guest:guests){
            hashTable.put(guest.getFullName(), guest);
        }
        //next
        System.out.println(hashTable.toString());
        */
        
        MainUI x = new MainUI();
        x.setVisible(true);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoeed2aristimuño;
import Estructures.HashTable;
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
        //MainUI x = new MainUI();
        //x.setVisible(true);
        /*
        HashTable ht = new HashTable();
        ht.put("A", "1");
        ht.put("B", "2");
        ht.put("C", "3");
        ht.put("D", "4");
        System.out.println(ht.toString());
        System.out.println(ht.get("A"));
        */
        Room a, b;
        a = new Room(100,"A",1);
        b = new Room(200,"B",1);
        if (b.compareTo(a) == 1){
            System.out.println("B");
        }
    }
    
}

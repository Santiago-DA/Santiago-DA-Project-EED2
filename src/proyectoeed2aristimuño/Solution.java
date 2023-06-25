/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoeed2aristimuño;

import Estructures.BinarySearchTree;
import Estructures.Node;
import Estructures.Room;
import java.util.ArrayList;

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
    
}

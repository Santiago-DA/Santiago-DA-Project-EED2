/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructures;

/**
 *
 * @author Santiago Aristimuño
 */
public class HashTable<K, V>{
    
    private final int SIZE = 8; //should be 2^8
    private Entry<K,V> table[];

    public HashTable() {
        this.table = new Entry[SIZE];
    }
    public void put(K key, V value){
        int hash = key.hashCode() % this.SIZE;
        Entry<K,V> e = this.table[hash];
        if (e == null){
            this.table[hash] = new Entry<K, V>(key, value);
        }else{
            while (e.next != null){
                if (e.getKey() == key){
                    e.setValue(value);
                    return;
                }
                e = e.next;
            }
            if (e.getKey() == key){
                e.setValue(value);
                return;
            }
            e.next = new Entry<K,V>(key, value);
        }
    }
    public V get(K key){
        int hash = key.hashCode() % this.SIZE;
        Entry<K,V> e = this.table[hash];
        if (e == null){
            return null;
        }
        while (e != null){
            if (e.getKey() == key){
                return e.getValue();   
            }
            e = e.next;
        }
        return null;
    }
    public Entry<K,V> remove(K key){
        int hash = key.hashCode() % this.SIZE;
        Entry<K,V> e = this.table[hash];
        if (e == null){
            return null;
        }
        if  (e.getKey() == key){
            this.table[hash] = e.next;
            e.next = null;
            return e;
        }
        Entry<K, V> prev = e;
        e = e.next;
        while(e != null){
            if (e.getKey() == key){
                prev.next = e.next;
                e.next = null;
                return e;
            }
            prev = e;
            e = e.next;       
        }
        return null;
    }
    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < SIZE; i++) {
        if (table[i] != null) {
            sb.append(i + " " + table[i].getValue() + "\n"); //should add Entry or e.getValue or (key, value)
        } else {
            sb.append(i + " " + "null" + "\n");
        }
    }
    return sb.toString();
    }
    
}

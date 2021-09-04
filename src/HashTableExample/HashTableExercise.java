package HashTableExample;

import java.util.Hashtable;

public class HashTableExercise {
    private Hashtable<Integer, String>  firstHashTable = new Hashtable<Integer, String>();

    public void addItem(int key, String value){
        firstHashTable.put(key,value);
    }

    public String getItem(int key){
        return firstHashTable.get(key);
    }

    public void replaceItem(int key, String newValue){
        String oldValue = firstHashTable.get(key);
        firstHashTable.replace(key,newValue);
        System.out.println("Replacing "+oldValue +" with " + newValue);

    }
    public void remove(int key){
        firstHashTable.remove(key);
    }

    public void printTable(){
        firstHashTable.forEach((k,v) -> {
            System.out.println(k + " " + v);
        });
    }

 }

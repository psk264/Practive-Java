package ListStructure;

import java.util.ArrayList;

public class ArrayListGroceryList {
    private ArrayList<String> grocery = new ArrayList<String>();

    public void addGroceryItem(String item){
        grocery.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + grocery.size() + " items in your list.");
        for(int i=0; i< grocery.size(); i++){
            System.out.println(i+1 + ". " + grocery.get(i));
        }
    }

    public void removeGroceryItem(String item){
        grocery.remove(item);
        System.out.println("Removing item: " + item);
    }

    public void removeGroceryItem(int index){
        String item = grocery.get(index);
        grocery.remove(index);
        System.out.println("Removing item: " + item);
    }


    public void modifyGroceryItem(int index, String newItem){
        grocery.set(index, newItem);
    }

    public String findGroceryItem(String keyword){
//        boolean exist = grocery.contains(keyword);
//        if(exist){
//            return grocery.get(keyword);
//        }
        int position = grocery.indexOf(keyword);
        if(position>=0) return grocery.get(position);
        return null;
    }
}

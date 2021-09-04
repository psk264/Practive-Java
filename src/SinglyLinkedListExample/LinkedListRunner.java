package SinglyLinkedListExample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRunner {
    public static void main(String[] args){
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Paris");
        placesToVisit.add("Zurich");
        placesToVisit.add("London");
        placesToVisit.add("Norway");

        printList(placesToVisit);

        placesToVisit.add(1,"Lugano");
        printList(placesToVisit);
        placesToVisit.remove(4);
        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> placesToVisit){
        Iterator<String> it = placesToVisit.iterator();
        while(it.hasNext()){
            System.out.println("Now visiting " + it.next());
        }
        System.out.println("-----------------------------");
    }

}

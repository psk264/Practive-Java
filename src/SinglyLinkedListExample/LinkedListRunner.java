package SinglyLinkedListExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListRunner {
    public static void main(String[] args){
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit, "Paris");
        addInOrder(placesToVisit, "Zurich");
        addInOrder(placesToVisit, "London");
        addInOrder(placesToVisit, "Norway");
        printList(placesToVisit);
        addInOrder(placesToVisit, "London");
        addInOrder(placesToVisit, "Alice Springs");
        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("-----------------------------");
    }

    public static boolean addInOrder(LinkedList<String> placesToVisit, String newCity){
        ListIterator<String> it = placesToVisit.listIterator();
        while(it.hasNext()) {
            int comparison = it.next().compareTo(newCity);
            if(comparison==0){
                System.out.println(newCity + " is already in the itinerary");
                return false;
            }else if(comparison>0){
                //newCity should appear before current
                it.previous();  //to move back to the current city since we had moved on to next in line 36.
                it.add(newCity);
                return true;
            } else if(comparison<0){
                //move on to next city
                it.add(newCity);
                return true;
            }

        }
        it.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> it = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itinerary");
            return;
        }
        else {
            System.out.println("Now visiting" + it.next());
            printMenu();
        }
        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();

            switch(action){
                case 0:
                    System.out.println("Holiday over!");
                    quit=true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(it.hasNext()) it.next();
                        goingForward=true;
                    }
                    if(it.hasNext()) {
                        System.out.println("Now visiting " + it.next());
                    } else{
                        System.out.println("Reached end of list");
                        goingForward=false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(it.hasPrevious()) it.previous();
                        goingForward=false;
                    }
                    if(it.hasPrevious()){
                        System.out.println("Now visiting " + it.previous());
                    } else {
                        System.out.println("Reached start of the list");
                        goingForward=true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    public static void printMenu(){
        System.out.println("Here are the actions. Press:");
        System.out.println("0 - quit\n" +
                            "1 - go to next\n" +
                            "2 - go to previous\n"+
                            "3 - print menu");
    }



}

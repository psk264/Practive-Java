package HashTableExample;

import java.util.Scanner;

public class HashRunner {
    private static final Scanner sc = new Scanner(System.in);
    private static HashTableExercise hashie = new HashTableExercise();

    public static void main(String[] args){
        boolean quit=false;
        int choice;
        System.out.println("Enter 1 - add, 2 - replace, 3 - remove, 4 - print, 5 - quit");
        while(!quit){
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    addtoTable();
                    break;
                case 2:
                    replaceinTable();
                    break;
                case 3:
                    removeFromTable();
                    break;
                case 4:
                    hashie.printTable();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    private static void addtoTable(){
        System.out.print("Enter the key and value separated by space: ");
        int key = sc.nextInt();
        String value = sc.nextLine();
        hashie.addItem(key,value);
    }

    private static void replaceinTable(){
        System.out.print("Enter the key and new value separated by space: ");
        int key = sc.nextInt();
        String oldValue = hashie.getItem(key);
        String newValue = sc.nextLine();
        hashie.replaceItem(key, newValue);
        System.out.println("Replacing " + oldValue + " with " + newValue + " at the key " + key);
    }

    private static void removeFromTable(){
        System.out.print("Enter the key to remove: ");
        int key = sc.nextInt();
        sc.nextLine();
        System.out.println("Removing " + hashie.getItem(key) + "item at key " + key +" from the table ");
        hashie.remove(key);
    }

}

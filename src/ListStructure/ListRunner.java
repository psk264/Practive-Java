package ListStructure;

public class ListRunner {

    public static void main(String[] args){
        GroceryList shopriteList = new GroceryList();
        shopriteList.addGroceryItem("Eggs");
        shopriteList.addGroceryItem("Milk");
        shopriteList.addGroceryItem("Flour");
        shopriteList.addGroceryItem("Sugar");
        shopriteList.printGroceryList();
        shopriteList.removeGroceryItem("Eggs");
        shopriteList.printGroceryList();
        shopriteList.modifyGroceryItem(1, "Almond flour");
        shopriteList.printGroceryList();
        shopriteList.addGroceryItem("Almond milk");
        shopriteList.removeGroceryItem(0);   //
        shopriteList.printGroceryList();
    }
}

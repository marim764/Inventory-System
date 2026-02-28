import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> items; //ArrayList items will store objects of type Product

    //Constructor
    public Inventory() {
        items = new ArrayList<>(); //Creation of ArrayList and put it inside items
    }

    //Add item function
    public void addItem(Product item) {
        items.add(item); //add input of type product in the ArrayList items
        System.out.println("--- Item Added Successfully! ---");
    }

    //Show all the items function
    public void viewAllItems() {
        System.out.println("--- Inventory List ---");
        if (items.isEmpty()) {
            System.out.println("*** Unfortunately,the inventory is currently empty. ***");
        } else {
            for (Product item : items) {
                item.display();
            }
        }
    }

    //Update quantity function
    public void updateQuantity(int id, int newQuantity) {
        for (Product item : items) {
            if (item.getId() == id) {
                item.setQuantity(newQuantity);
                System.out.println("--- Quantity updated successfully! ---");
                return;
            }
        }
        System.out.println("*** Item with ID \"" + id + "\" not found. ***");
    }

    //Search by ID function
    public void searchById(int searchId) {
        for (Product item : items) {
            if (item.getId() == searchId) {
                System.out.println("--- Item Found! ---");
                item.display();
                return;
            }
        }
        System.out.println("*** Item with ID \"" + searchId + "\" not found. ***");
    }

    //Delete an item function
    public void deleteItem(int id) {
        Product itemToRemove = null;
        for (Product item : items) {
            if (item.getId() == id) {
                itemToRemove = item;
                break;
            }
        }
        if (itemToRemove != null){
            items.remove(itemToRemove);
            System.out.println("--- Item Deleted Successfully! ---");
        }
        else{
            System.out.println("*** Item with ID \"" + id + "\" not found. ***");
        }
    }
}
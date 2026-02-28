import java.util.Scanner;

public class Inventory_System{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Inventory myInventory = new Inventory();
        boolean isRunning = true;

        System.out.println("==========================================");
        System.out.println("  Welcome to the Simple Inventory System  ");
        System.out.println("==========================================");

        while (isRunning){
            System.out.println("--- Main Menu ---");
            System.out.println("1. Add a new item");
            System.out.println("2. View all items");
            System.out.println("3. Update item quantity");
            System.out.println("4. Search item by ID");
            System.out.println("5. Delete an item");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();
            if( choice < 0 || choice > 5 ){
                System.out.println("*** Invalid input! Please enter a number from 0 to 5. ***");
                continue;

            }
            switch (choice){
                case 1:
                    System.out.print("Enter Item ID: ");
                    while (!input.hasNextInt()) {
                        System.out.println("*** Error: ID must be a number! ***");
                        input.next();
                        System.out.print("Enter Item ID again: ");
                    }
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Item Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Quantity: ");
                    while (!input.hasNextInt()) {
                        System.out.println("*** Error: Quantity must be a number! ***");
                        input.next();
                        System.out.print("Enter Item quantity again: ");
                    }
                    int quantity = input.nextInt();

                    System.out.print("Enter Item Price: ");
                    while (!input.hasNextDouble()) {
                        System.out.println("*** Error: Price must be a number! ***");
                        input.next();
                        System.out.print("Enter Item price again: ");
                        }
                    double price = input.nextDouble();

                    myInventory.addItem(new Product(id, name, quantity, price));
                    break;

                case 2:
                    myInventory.viewAllItems();
                    break;

                case 3:
                    System.out.print("Enter the ID of the item to update: ");
                    while (!input.hasNextInt()) {
                        System.out.println("*** Error: ID must be a number! ***");
                        input.next();
                        System.out.print("Enter Item ID again to update: ");
                    }
                    int updateId = input.nextInt();

                    System.out.print("Enter the new quantity: ");
                    while (!input.hasNextInt()) {
                        System.out.println("*** Error: Quantity must be a number! ***");
                        input.next();
                        System.out.print("Enter Item new quantity again: ");
                    }
                    int newQuantity = input.nextInt();

                    myInventory.updateQuantity(updateId, newQuantity);
                    break;

                case 4:
                    System.out.print("Enter the ID of the item to search: ");
                    while (!input.hasNextInt()) {
                        System.out.println("*** Error: ID must be a number! ***");
                        input.next();
                        System.out.print("Enter Item ID again to search: ");
                    }
                    int searchId = input.nextInt();

                    myInventory.searchById(searchId);
                    break;

                case 5:
                    System.out.print("Enter the ID of the item to delete: ");
                    while (!input.hasNextInt()) {
                        System.out.println("*** Error: ID must be a number! ***");
                        input.next();
                        System.out.print("Enter Item ID again to delete: ");
                    }
                    int deleteId = input.nextInt();

                    myInventory.deleteItem(deleteId);
                    break;

                case 0:
                    isRunning = false;
                    System.out.println("Exiting the program...");
                    System.out.println("Goodbye!");
                    break;
            }
        }
        input.close();
    }
}
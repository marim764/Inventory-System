public class Product {
    private int id , quantity;
    private String name;
    private double price;

    //Constructor
    public Product(int id, String name, int quantity, double price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    //Getters and Setters
    public int getId(){ return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice(){ return price; }

    public void setQuantity(int quantity){ this.quantity = quantity; }

    public void display(){
        System.out.println("Id: " + id + "| Name: " + name + "| Quantity: " + quantity + "| Price: $" + price);
    }


}

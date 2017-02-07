/**
 * Created by Kevin on 2/6/2017.
 */

class Book {

    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public Book(String name, double price) {
        setName(name);
        setPrice(price);
    }
}

class Customer {

    Book b;

    private String name;
    private double totalPrice;

    private String[] sbook = new String[50];
    private double[] sprice = new double[50];

    private int count = 0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTotalPrice(double price) {
        this.totalPrice += price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }


    public void buyBooks(Book b) {
        sbook[count] = b.getName();
        sprice[count] = b.getPrice();
        addTotalPrice(b.getPrice());
        count++;
        System.out.println(name + " just bought a book called " + b.getName() + " which cost $" + b.getPrice() + ".");
    }

    public void getReceipt() {
        System.out.println("--------------------------");
        System.out.print("Name             Price");
        System.out.println();
        for (int i = 0; i < count; i++) {
            System.out.println();
            System.out.print(sbook[i]);
            for (int j = 0; j < (16-sbook[i].length());j++) {
                System.out.print(" ");
            }
            System.out.print(" "+sprice[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("Total:           " + getTotalPrice());
        System.out.println("--------------------------");
    }

    public void purchased() {
        System.out.println("Thanks. Hope see you again.");
        sbook = null;
        sprice = null;
        count = 0;
    }

    public Customer(String name){
        this.name = name;
    }
}
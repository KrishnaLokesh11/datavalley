import java.io.*;

class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        serializeProduct();

       
        Product deserializedProduct = deserializeProduct();

        
        System.out.println("Deserialized Product Details:");
        deserializedProduct.printDetails();
    }

    private static void serializeProduct() {
        Product product = new Product(1, "Phone", "Electronics", 999.99);
        try {
            FileOutputStream fileOut = new FileOutputStream("product.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(product);
            objectOut.close();
            fileOut.close();
            System.out.println("Product serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Product deserializeProduct() {
        Product product = null;
        try {
            FileInputStream fileIn = new FileInputStream("product.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            product = (Product) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Product deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }
}

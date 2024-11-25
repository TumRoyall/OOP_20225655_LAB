package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.disc.*;
public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // Test the print method
        cart.printCart();

        // To-do: Test the search methods here
        // Tìm DVD theo ID
        DigitalVideoDisc searchById = cart.searchById(2);
        if (searchById != null) {
            System.out.println("Found DVD by ID: " + searchById);
        } else {
            System.out.println("No DVD found with the given ID.");
        }

        // Tìm DVD theo tiêu đề
        DigitalVideoDisc searchByTitle = cart.searchByTitle("Việt Nam");
        if (searchByTitle != null) {
            System.out.println("Found DVD by title: " + searchByTitle);
        } else {
            System.out.println("No DVD found with the given title.");
        }
    }
}
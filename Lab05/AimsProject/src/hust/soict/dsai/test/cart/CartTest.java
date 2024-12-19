package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 29.95f);
        cart.addMedia(dvd4);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 15.95f);
        cart.addMedia(dvd5);

        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Interstellar", "Science Fiction", "Christopher Nolan", 169, 27.99f);
        cart.addMedia(dvd6);

        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Toy Story", "Animation", "John Lasseter", 81, 21.50f);
        cart.addMedia(dvd7);

        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 23.95f);
        cart.addMedia(dvd8);


        // Test the print method
        cart.printCart();

        // To-do: Test the sort methods here
        cart.sortByCostTitle();
        System.err.println("Cart after sort cost methods");
        cart.printCart();

        cart.sortByTitleCost();
        System.err.println("Cart after sort title methods");
        cart.printCart();
    }
}
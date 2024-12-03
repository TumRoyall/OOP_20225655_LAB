package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Mr.Bean", "movie", "John", 100, 2.5);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc( "Jurassic Park", "movie", "Christopher Nolan", 80, 3.0);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Em Cua Ngay Hom Qua", "music",  "Song Tung", 12, 1.2);

        Book book = new Book(1, "Harry Potter", "Movie", 0.5);
        Book book2 = new Book(2, "Connan", "Trinh Tham", 0.2);

        CompactDisc cd1 = new CompactDisc(0, "99%", "Trap", 1, "MCK", "MCK");
    }
}
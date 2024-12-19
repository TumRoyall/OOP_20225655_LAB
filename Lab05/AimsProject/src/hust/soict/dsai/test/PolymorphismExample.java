package hust.soict.dsai.test;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.media.Media;

public class PolymorphismExample {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();

        Book book2 = new Book("Connan", "Trinh Tham", 0.2);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Mr.Bean", "movie", "John", 100, 2.5);
        CompactDisc cd1 = new CompactDisc("99%", "Trap", 1, "MCK", "MCK");

        mediae.add(book2);
        mediae.add(dvd1);
        mediae.add(cd1);

        for (Media media : mediae) {
            System.out.println(media.toString());
        }
    }
}

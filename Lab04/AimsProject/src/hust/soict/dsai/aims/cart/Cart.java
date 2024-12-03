package hust.soict.dsai.aims.cart;

import java.util.Comparator;
import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
import java.util.Collections;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    public static int nbDVDs = 0;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    //check empty
    public boolean isEmpty() {
        return itemsOrdered.isEmpty();
    }
    //clear all items
    public void clear() {
        itemsOrdered.clear();
        nbDVDs = 0;
    }
    //get media by id
    public Media getMediaById(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) return media;
        }
        return null;
    }
    //get media by title
    public Media getMediaByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) return media;
        }
        return null;
    }

    public void addMedia(Media media) {
        if (itemsOrdered.size() >= MAX_NUMBER_ORDERED) {
            System.out.println("Cart is already full.");
            return;
        }
        if(media instanceof DigitalVideoDisc) nbDVDs++;
        itemsOrdered.add(media);
        System.out.println("Added: " + media.getTitle());
    }
    
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("Removed: " + media.getTitle());
        } else {
            System.out.println("Media not found: " + media.getTitle());
        }
    }
    public double totalCost() {
        double total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
    public void printCart() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        for (Media media : itemsOrdered) {
            System.out.println(media);
        }
    }

    // sort title cost
    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, new CompareByTitleCost());
    }

    // Sort cost title
    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, new CompareByCostTitle());
    }

    // Tao class so sanh
    public class CompareByTitleCost implements Comparator<Media> {
        @Override
        public int compare(Media m1, Media m2) {
            int titleCompare = m1.getTitle().compareTo(m2.getTitle());
            if (titleCompare == 0) {
                return Double.compare(m2.getCost(), m1.getCost());
            }
            return titleCompare;
        }
    }
    public class CompareByCostTitle implements Comparator<Media> {
        @Override
        public int compare(Media m1, Media m2) {
            int costCompare = Double.compare(m2.getCost(), m1.getCost());
            if (costCompare == 0) {
                return m1.getTitle().compareTo(m2.getTitle());
            }
            return costCompare;
        }
    }
}

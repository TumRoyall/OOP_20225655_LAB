package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.*;

import java.util.ArrayList;
public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
    
    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Added to store: " + media.getTitle());
    }
    
    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Removed from store: " + media.getTitle());
        } else {
            System.out.println("Media not found in store: " + media.getTitle());
        }
    }

    public void showStore() {
        for (Media media : itemsInStore) {
            if(media instanceof Book) {
                System.out.println("Book - " + media.getTitle() + " - " + media.getCost());
            }
            else if(media instanceof DigitalVideoDisc) {
                System.out.println("DVD - " + media.getTitle() + " - " + media.getCost());
            }
            else {
                System.out.println("CD - " + media.getTitle() + " - " + media.getCost());
            }
        }
    }

    public Media getMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
}

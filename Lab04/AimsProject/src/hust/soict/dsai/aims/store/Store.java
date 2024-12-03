package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.Media;

import java.util.ArrayList;
public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

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
            System.out.println(media.toString());
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

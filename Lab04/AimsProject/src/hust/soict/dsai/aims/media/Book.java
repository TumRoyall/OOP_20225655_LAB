package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<String>();

    //Constructor
    public Book(int id, String title, String category, float cost) {
        super.setId(id);
        super.setTitle(title);
        super.setCategory(category);
        super.setCost(cost);
    }

    //Getters and setters
    public ArrayList<String> getAuthors() {
        return authors;
    }

    //Add author and remove author
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }

}

package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private static int nbbooks = 0;
    private ArrayList<String> authors = new ArrayList<String>();


    // toString
    @Override
    public String toString() {
        return "Book --- " + super.toString() + " - " + authors + " : " + getCost();
    }
    //Constructor
    public Book(String title, String category, double cost) {
        super(++nbbooks, title, category, cost);
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

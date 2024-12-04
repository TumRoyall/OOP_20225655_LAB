package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private double cost;

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    //toString
    @Override
    public String toString() {
        return " id: "+ id + " - " + title + " - " + category ;
    }


    //constructor methods
    public Media(int id, String title, String category, double cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }


    // Comparator sort by title then cost
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = 
        Comparator.comparing(Media::getTitle)
                  .thenComparing(Comparator.comparing(Media::getCost).reversed());

    // Comparator sort by cost then title
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = 
        Comparator.comparing(Media::getCost).reversed()
                  .thenComparing(Media::getTitle);


    //Override Equals and hashCode methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false;

        Media media = (Media) obj; 
        return title != null ? title.equals(media.title) : media.title == null; 
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }
}

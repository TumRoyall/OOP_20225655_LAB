package hust.soict.dsai.aims.media;

public class Disc extends Media {
    private String director;
    private int length;

    // getter and setter
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    // Constructor
    public Disc(int id, String title, String category, float cost, String director, int length) {
        super.setId(id);
        super.setTitle(title);
        super.setCategory(category);
        super.setCost(cost);
        this.director = director;
        this.length = length;
    }
    
}

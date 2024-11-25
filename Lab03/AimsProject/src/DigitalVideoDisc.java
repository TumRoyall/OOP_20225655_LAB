public class DigitalVideoDisc {
    private int id;
    private String title;
    private String category;
    private double cost;
    private String director;
    private int length;

    private static int nbDigitalVideoDisc = 0;


    //to String
    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + " minutes: " + cost + " $";
    }

    // Getters
    public int getId() {
        return id;
    }

    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
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
    
    public double getCost() {
        return cost;
    }

    public String getDirector() {
        return director;
    }
    
    public int getLength() {
        return length;
    }

    // object by title
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    // object by category, title, and cost
    public DigitalVideoDisc(String category, String title, double cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    // object by director, category, title, and cost
    public DigitalVideoDisc(String director, String category, String title, double cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    // object by all attributes (title, category, director, length, cost)
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

        // update: Tự động cập nhật id và tổng số đĩa.
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }

    
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
}

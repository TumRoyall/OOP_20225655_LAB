package hust.soict.dsai.aims.cd;

public class Track {
    private String title;
    private int  length;

    //getter
    public String getTitle() {
        return title;
    }
    
    public int getLength() {
        return length;
    }
    
    // constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
}

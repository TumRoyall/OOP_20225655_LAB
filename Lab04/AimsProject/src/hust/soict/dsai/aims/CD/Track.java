package hust.soict.dsai.aims.CD;

public class Track {
    private String title;
    private int  length;

    //setter and getter
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    public void setLength(int length) {
        this.length = length;
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

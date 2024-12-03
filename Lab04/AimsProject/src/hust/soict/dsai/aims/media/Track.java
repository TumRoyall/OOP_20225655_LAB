package hust.soict.dsai.aims.media;

public class Track implements Playable {
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

    // play method
    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }    
}

package hust.soict.dsai.aims.CD;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Disc;

public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track> tracks;

    //setter and getter
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    // Constructor
    public CompactDisc(int id, String title, String category, float cost, String director, int length, String artist) {
        super(id, title, category, cost, director, length);
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }
}


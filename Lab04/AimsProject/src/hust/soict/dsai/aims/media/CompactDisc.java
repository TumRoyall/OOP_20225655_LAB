package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    public static int nbCompactDisc = 0;
    private String artist;
    private ArrayList<Track> tracks;

    //getter artist
    public String getArtist() {
        return artist;
    }

    // to String method
    @Override
    public String toString() {
        return "CD --- " + super.toString() + " - " + super.getDirector() + " - " + artist + " - "+ super.getLength() + "s : " + super.getCost() + " $ ";
    }

    // Constructor
    public CompactDisc(String title, String category, double cost, String director, String artist) {
        super(++nbCompactDisc, title, category, cost, director, 0); // default length is 0
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    // add and remove tracks
    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        } else {
            System.out.println("Track already exists: " + track.getTitle());
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track does not exist: " + track.getTitle());
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        setLength(totalLength); // cập nhật độ dài của CD sau khi thêm track
        return totalLength;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }
}


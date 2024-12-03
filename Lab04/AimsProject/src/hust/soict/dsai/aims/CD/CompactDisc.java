package hust.soict.dsai.aims.cd;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Disc;

public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track> tracks;

    //getter artist
    public String getArtist() {
        return artist;
    }

    // Constructor
    public CompactDisc(int id, String title, String category, float cost, String director, String artist) {
        super(id, title, category, cost, director, 0); // default length is 0
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
}


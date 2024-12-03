package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    private static int nbDigitalVideoDisc = 0;


    //to String
    @Override
    public String toString() {
        return "DVD - " + super.toString();
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    // Getters
    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }

    // object by all attributes (id ,title, category, director, length, cost) với id được cập nhật theo số đĩa
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(++nbDigitalVideoDisc, title, category, cost, director, length);
    }

    
    public boolean isMatch(String title) {
        return super.getTitle().equalsIgnoreCase(title);
    }

    
}

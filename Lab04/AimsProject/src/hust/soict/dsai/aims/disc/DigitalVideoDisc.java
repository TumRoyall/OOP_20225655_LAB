package hust.soict.dsai.aims.disc;

import hust.soict.dsai.aims.media.Disc;

public class DigitalVideoDisc extends Disc{
    private static int nbDigitalVideoDisc = 0;


    //to String
    @Override
    public String toString() {
        return "DVD - " + super.getTitle() + " - " + super.getCategory() + " - " + super.getDirector() + " - " + super.getLength() + " minutes: " + super.getCost() + " $";
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

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

    // object by title
    public DigitalVideoDisc(String title) {
        super.setTitle(title);
    }

    // object by category, title, and cost
    public DigitalVideoDisc(String category, String title, float cost) {
        super.setTitle(title);
        super.setCategory(category);
        super.setCost(cost);
    }

    // object by director, category, title, and cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super.setTitle(title);
        super.setCategory(category);
        super.setCost(cost);
        super.setDirector(director);
    }

    // object by all attributes (title, category, director, length, cost)
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super.setTitle(title);
        super.setCategory(category);
        super.setCost(cost);
        super.setDirector(director);

        // update: Tự động cập nhật id và tổng số đĩa.
        nbDigitalVideoDisc++;
        super.setId(nbDigitalVideoDisc);
    }

    
    public boolean isMatch(String title) {
        return super.getTitle().equalsIgnoreCase(title);
    }
}

package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.disc.*;
public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
        
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungleDVD title: " + jungleDVD.getTitle());
    }

    public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
        DigitalVideoDisc temp = o1;
        o1 = o2;
        o2 = temp;
    }
    
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

    // swap() can correctly swap the two title object.
    /* 
    public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
    String tmp = o1.getTitle();
    o1.setTitle(o2.getTitle());
    o2.setTitle(tmp);
    */
}


//code can correctly swap the two object.
// Using array
/*
    public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        DigitalVideoDisc[] dvds = {jungleDVD, cinderellaDVD};

        System.out.println("Trước khi hoán đổi:");
        System.out.println("DVD 1: " + dvds[0].getTitle());
        System.out.println("DVD 2: " + dvds[1].getTitle());

        swap(dvds);

        System.out.println("Sau khi hoán đổi:");
        System.out.println("DVD 1: " + dvds[0].getTitle());
        System.out.println("DVD 2: " + dvds[1].getTitle());
    }

    public static void swap(DigitalVideoDisc[] dvds) {
        DigitalVideoDisc temp = dvds[0];
        dvds[0] = dvds[1];
        dvds[1] = temp;
    }
}
 */
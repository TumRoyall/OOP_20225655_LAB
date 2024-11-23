public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Mr.Bean", "movie", "John", 100, 2.5);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc( "Jurassic Park", "movie", "Christopher Nolan", 80, 3.0);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Em Cua Ngay Hom Qua", "music",  "Song Tung", 12, 1.2);

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        //Print total Cost
        System.out.println("Total cost: " + cart.totalCost());

        //Remove disc 1 and print total cost
        cart.removeDigitalVideoDisc(dvd1);
        System.out.println("Total cost after removing DVD1: " + cart.totalCost());
    }
}
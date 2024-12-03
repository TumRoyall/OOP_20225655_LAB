package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] items = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    private int qtyOrdered = 0;
    //add dvd to cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            items[qtyOrdered] = disc; 
            qtyOrdered++; 
            System.out.println("The disc " + disc.getTitle() + " has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }
    //Overloading
    //Thêm 1 danh sách đĩa
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd);
        }
    }
    //Thêm 2 đĩa DVD
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    //remove dvd from cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (items[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
                return;
            }
        }
        System.out.println("The disc \"" + disc.getTitle() + "\" was not found in the cart.");
    }

    // return the total cost of the items in the cart
    public double totalCost() {
        double total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += items[i].getCost();
        }
        return total;
    }

    // change for new branch: Refactor Repository

    //print cart
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". "+ items[i].toString());
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    // Phương thức tìm DVD theo ID
    public DigitalVideoDisc searchById(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (items[i].getId() == id) {
                return items[i];
            }
        }
        return null; // Không tìm thấy DVD
    }

    // Phương thức tìm DVD theo tiêu đề
    public DigitalVideoDisc searchByTitle(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (items[i].isMatch(title)) {
                return items[i];
            }
        }
        return null; // Không tìm thấy DVD
    }
}

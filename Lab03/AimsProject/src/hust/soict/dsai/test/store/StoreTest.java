package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.*;
import hust.soict.dsai.aims.store.*;
public class StoreTest {
    public static void main(String[] args) {
        // Tạo một cửa hàng với sức chứa 5 DVD
        Store store = new Store(5);
        
        // Tạo một số DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 88, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 24.99);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Spider-Man", "Action", "Sam Raimi", 121, 14.99);
        
        // Thêm các DVD vào cửa hàng
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Hiển thị danh sách DVD trong cửa hàng
        store.showItems();
        
        // Xóa Dvd 2 từ cửa hàng
        store.removeDVD(dvd2);

        // Hiển thị danh sách DVD trong cửa hàng sau khi xóa DVD 2
        store.showItems();
    }
}

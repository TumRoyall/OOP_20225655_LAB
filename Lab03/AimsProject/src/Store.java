public class Store {
    private DigitalVideoDisc[] itemsInStore;  // Mảng Dvds
    private int numOfDVDs;                    // Số Dvds hiện tại

    // Constructor để khởi tạo Store với sức chứa cố định
    public Store(int capacity) {
        itemsInStore = new DigitalVideoDisc[capacity];
        numOfDVDs = 0;
    }

    // add DVD to store
    public void addDVD(DigitalVideoDisc dvd) {
        if (numOfDVDs < itemsInStore.length) {
            itemsInStore[numOfDVDs] = dvd;
            numOfDVDs++;
            System.out.println("DVD added: " + dvd);
        } else {
            System.out.println("Store is full, can't add more DVDs.");
        }
    }

    // remove DVD from store
    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < numOfDVDs; i++) {
            if (itemsInStore[i].equals(dvd)) {
                for (int j = i; j < numOfDVDs - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[numOfDVDs - 1] = null;
                numOfDVDs--;
                found = true;
                System.out.println("DVD removed: " + dvd);
                break;
            }
        }
        if (!found) {
            System.out.println("DVD not found.");
        }
    }

    // Hiển thị tất cả dvd trong store
    public void showItems() {
        System.out.println("DVDs in store:");
        for (int i = 0; i < numOfDVDs; i++) {
            System.out.println(itemsInStore[i]);
        }
    }
}

package hust.soict.dsai.aims;
import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;
public class Aims {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        Cart cart = new Cart();
        
        // Tạo DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Inception", "movie", "Christopher Nolan", 148, 3.5);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Matrix", "movie", "The Wachowskis", 136, 2.9);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Titanic", "movie", "James Cameron", 195, 4.0);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avatar", "movie", "James Cameron", 162, 3.8);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Godfather", "movie", "Francis Ford Coppola", 175, 4.2);

        // Tạo CD
        CompactDisc cd6 = new CompactDisc("Abbey Road", "Rock", 47, "The Beatles", "Apple");
        cd6.addTrack(new Track("Come Together", 4));
        cd6.addTrack(new Track("Something", 3));
        cd6.addTrack(new Track("Here Comes the Sun", 3));

        CompactDisc cd7 = new CompactDisc("Lemonade", "Pop", 45, "Beyoncé", "Columbia");
        cd7.addTrack(new Track("Formation", 3));
        cd7.addTrack(new Track("Sorry", 3));
        cd7.addTrack(new Track("Hold Up", 4));

        CompactDisc cd8 = new CompactDisc("The Wall", "Progressive Rock", 81, "Pink Floyd", "Harvest");
        cd8.addTrack(new Track("In the Flesh", 3));
        cd8.addTrack(new Track("Another Brick in the Wall", 4));
        cd8.addTrack(new Track("Comfortably Numb", 6));

        CompactDisc cd9 = new CompactDisc("Hotel California", "Rock", 43, "Eagles", "Asylum");
        cd9.addTrack(new Track("Hotel California", 6));
        cd9.addTrack(new Track("New Kid in Town", 5));
        cd9.addTrack(new Track("Life in the Fast Lane", 4));

        CompactDisc cd10 = new CompactDisc("Future Nostalgia", "Pop", 37, "Dua Lipa", "Warner Records");
        cd10.addTrack(new Track("Don't Start Now", 3));
        cd10.addTrack(new Track("Physical", 3));
        cd10.addTrack(new Track("Break My Heart", 3));

        // Tạo sách
        Book book6 = new Book("The Catcher in the Rye", "Fiction", 0.4);
        book6.addAuthor("J.D. Salinger");

        Book book7 = new Book("Moby Dick", "Adventure", 0.6);
        book7.addAuthor("Herman Melville");

        Book book8 = new Book("War and Peace", "Historical", 1.0);
        book8.addAuthor("Leo Tolstoy");

        Book book9 = new Book("The Alchemist", "Adventure", 0.3);
        book9.addAuthor("Paulo Coelho");

        Book book10 = new Book("The Picture of Dorian Gray", "Gothic", 0.5);
        book10.addAuthor("Oscar Wilde");

        // add media
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(dvd5);
        store.addMedia(cd6);
        store.addMedia(cd7);
        store.addMedia(cd8);
        store.addMedia(cd9);
        store.addMedia(cd10);
        store.addMedia(book6);
        store.addMedia(book7);
        store.addMedia(book8);
        store.addMedia(book9);
        store.addMedia(book10);

        // Giao diện menu chính
        while (true) {
            System.out.println("AIMS: ");
            System.out.println("--------------------------------");
            System.out.println("1. View store");
            System.out.println("2. Update store");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2-3: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    storeMenu(store, cart, sc);
                    break;
                case 2:
                    updateStore(store, sc);
                    break;
                case 3:
                    cartMenu(cart, sc);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    //Store menu
    public static void storeMenu(Store store, Cart cart, Scanner sc) {
        while (true) {
            store.showStore();
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media's details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2-3-4: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    seeMediaDetails(store, cart, sc);
                    break;
                case 2:
                    addMediaToCart(store, cart, sc);
                    break;
                case 3:
                    playMedia(store, sc);
                    break;
                case 4:
                    cart.printCart();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    
    public static void choiceTypeMedia() {
        System.out.println("Select the type of media: ");
        System.out.println("1. Book");
        System.out.println("2. Compact Disc (CD)");
        System.out.println("3. Digital Video Disc (DVD)");
    }
    public static void cartMenu(Cart cart, Scanner sc) {
        cart.printCart();
        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2-3-4-5: ");

            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline character
            
            switch (choice) {
                case 1:
                    filterMedias(cart, sc);
                    break;
                case 2:
                    sortMedias(cart, sc);
                    break;
                case 3:
                    removeMediaFromCart(cart, sc);
                    break;
                case 4:
                    playMediaInCart(cart, sc);
                    break;
                case 5:
                    placeOrder(cart);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    

    public static void updateStore(Store store, Scanner sc) {
        System.out.println("Enter title of media to add/remove:");
        String title = sc.nextLine();
    
        System.out.println("Enter 1 to add or 2 to remove:");
        int action = sc.nextInt();
        sc.nextLine(); // consume newline
    
        if (action == 1) {
            // Chọn loại media
            choiceTypeMedia();
            int mediaType = sc.nextInt();
            sc.nextLine(); // consume newline
    
            // Nhập thông tin chung cho tất cả các loại media
            System.out.println("Enter the category of the media:");
            String category = sc.nextLine();
    
            System.out.println("Enter the cost of the media:");
            double cost = sc.nextDouble();
            sc.nextLine(); // consume newline
    
            // Tạo đối tượng media tương ứng
            Media newMedia = null;
            switch (mediaType) {
                case 1: // Book
                    System.out.println("Enter number authours of the book : ");
                    int numAuthours = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.println("Enter authors of the book (separate multiple authors with commas):");
                    ArrayList<String> authors = new ArrayList<>();
                    for(int i = 0; i < numAuthours; i++){
                        authors.add(sc.nextLine());
                    }
                    newMedia = new Book(title, category, cost);
                    // Thêm tác giả vào sách
                    for (String author : authors) {
                        ((Book) newMedia).addAuthor(author);
                    }
                    break;
    
                    case 2: // Compact Disc (CD)
                    System.out.println("Enter the director for the CD:");
                    String director = sc.nextLine();
                
                    System.out.println("Enter the artist for the CD:");
                    String artist = sc.nextLine();
                
                    newMedia = new CompactDisc(title, category, cost, director, artist);
                
                    System.out.println("Enter number of tracks in the CD:");
                    int numTrack = sc.nextInt();
                    sc.nextLine(); // Consume leftover newline
                
                    for (int i = 0; i < numTrack; i++) {
                        System.out.println("Enter the title of track " + (i + 1) + ":");
                        String trackTitle = sc.nextLine();
                
                        System.out.println("Enter the length of track " + (i + 1) + " (in seconds):");
                        int trackLength = sc.nextInt();
                        sc.nextLine(); // Consume leftover newline
                
                        Track tmp = new Track(trackTitle, trackLength);
                        ((CompactDisc) newMedia).addTrack(tmp);
                    }
                
                    ((CompactDisc) newMedia).getLength(); // Update length
                    break;
                
    
                case 3: // Digital Video Disc (DVD)
                    System.out.println("Enter the director for the DVD:");
                    String directorDVD = sc.nextLine();
    
                    System.out.println("Enter the length of the DVD (in minutes):");
                    int length = sc.nextInt();
                    sc.nextLine(); // consume newline
    
                    newMedia = new DigitalVideoDisc(title, category, directorDVD, length, cost);
                    break;
    
                default:
                    System.out.println("Invalid choice, media not added.");
                    return; // Trả về nếu lựa chọn không hợp lệ
            }
    
            // Thêm media mới vào cửa hàng
            if (newMedia != null) {
                store.addMedia(newMedia);
                System.out.println("Media added to store.");
            }
        } else if (action == 2) {
            // Tìm media trong store theo title
            Media mediaToRemove = store.getMediaByTitle(title);
            if (mediaToRemove != null) {
                store.removeMedia(mediaToRemove);
                System.out.println("Media removed from store.");
            } else {
                System.out.println("Media with title '" + title + "' not found in the store.");
            }
        }
    }

    public static void seeMediaDetails(Store store,Cart cart ,Scanner sc) {
        // Yêu cầu người dùng nhập title của media
        System.out.println("Enter the title of the media you want to see details:");
        String title = sc.nextLine();
        
        // Tìm media với title đã nhập
        Media media = store.getMediaByTitle(title);
    
        // Kiểm tra xem media có tồn tại không
        if (media == null) {
            System.out.println("Media with title '" + title + "' not found in the store.");
            return; // Nếu không có media, kết thúc hàm
        }
    
        // In thông tin chi tiết về media
        System.out.println(media.toString());
    
        // Kiểm tra loại media và hiển thị menu tương ứng
        if (media instanceof Book) {
            mediaDetailsMenuForBook(cart, sc, media);
        } else mediaDetailsMenuForCDAndDVD(sc, cart, media);
    }
    
    public static void mediaDetailsMenuForBook(Cart cart, Scanner sc, Media media) {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1: ");
        
        int choice = sc.nextInt();
        sc.nextLine();  
        switch (choice) {
            case 1:
                cart.addMedia(media);
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
    
    public static void mediaDetailsMenuForCDAndDVD(Scanner sc, Cart cart, Media media) {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2: ");
        
        int choice = sc.nextInt();
        sc.nextLine();  
        switch (choice) {
            case 1:
                cart.addMedia(media);
                System.out.println("Media added to cart.");
                break;
            case 2:
                System.out.println("Playing the media...");
                if (media instanceof CompactDisc) {
                    ((CompactDisc) media).play();
                } else ((DigitalVideoDisc) media).play();
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
    
    public static void addMediaToCart(Store store, Cart cart, Scanner sc) {
        System.out.println("Enter the title of the media to add to the cart:");
        String title = sc.nextLine();
        
        // Tìm media trong store
        Media media = store.getMediaByTitle(title);
        
        if (media == null) {
            System.out.println("Media with title '" + title + "' not found in the store.");
            return;
        }
        
        // Thêm media vào cart
        cart.addMedia(media);
        System.out.println("Media '" + media.getTitle() + "' has been added to the cart.");
    
        // Nếu media là DVD, đếm số lượng DVD trong cart
        if (media instanceof DigitalVideoDisc) {
            System.err.println("Number of DVDs in the cart: " + Cart.nbDVDs);
        }
    }
    public static void playMedia(Store store, Scanner sc) {
        System.out.println("Enter the title of the media to play:");
        String title = sc.nextLine();
    
        // Tìm media trong store
        Media media = store.getMediaByTitle(title);
    
        if (media == null) {
            System.out.println("Media with title '" + title + "' not found in the store.");
            return;
        }
    
        // Kiểm tra nếu media hỗ trợ phát
        if (media instanceof CompactDisc || media instanceof DigitalVideoDisc) {
            ((Playable) media).play(); // Gọi play nếu media implement Playable
        } else {
            System.out.println("Media '" + media.getTitle() + "' cannot be played.");
        }
    }

    private static void filterMedias(Cart cart, Scanner sc) {
        System.out.println("Filter media by:");
        System.out.println("1. By ID");
        System.out.println("2. By Title");
        System.out.print("Your choice: ");
        int filterChoice = sc.nextInt();
        sc.nextLine(); // Consume newline
    
        if (filterChoice == 1) {
            System.out.print("Enter the ID of the media: ");
            int id = sc.nextInt();
            sc.nextLine();
            Media media = cart.getMediaById(id);
            if (media != null) {
                System.out.println(media);
            } else {
                System.out.println("Media with ID " + id + " not found.");
            }
        } else if (filterChoice == 2) {
            System.out.print("Enter the title of the media: ");
            String title = sc.nextLine();
            Media media = cart.getMediaByTitle(title);
            if (media != null) {
                System.out.println(media);
            } else {
                System.out.println("Media with title '" + title + "' not found.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
    
    private static void sortMedias(Cart cart, Scanner sc) {
        System.out.println("Sort media by:");
        System.out.println("1. By Title");
        System.out.println("2. By Cost");
        System.out.print("Your choice: ");
        int sortChoice = sc.nextInt();
        sc.nextLine();
    
        if (sortChoice == 1) {
            cart.sortByTitleCost();;
            System.out.println("Cart sorted by title:");
            cart.printCart();
        } else if (sortChoice == 2) {
            cart.sortByCostTitle();
            System.out.println("Cart sorted by cost:");
            cart.printCart();
        } else {
            System.out.println("Invalid choice.");
        }
    }
    
    private static void removeMediaFromCart(Cart cart, Scanner sc) {
        System.out.print("Enter the title of the media to remove: ");
        String title = sc.nextLine();
        Media media = cart.getMediaByTitle(title);
        if (media != null) {
            cart.removeMedia(media);
            System.out.println("Media '" + title + "' has been removed from the cart.");
        } else {
            System.out.println("Media with title '" + title + "' not found.");
        }
    }
    
    private static void playMediaInCart(Cart cart, Scanner sc) {
        System.out.print("Enter the title of the media to play: ");
        String title = sc.nextLine();
        Media media = cart.getMediaByTitle(title);
        if (media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("Media '" + title + "' cannot be played.");
        }
    }
    
    private static void placeOrder(Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. Cannot place an order.");
        } else {
            System.out.println("Order placed successfully!");
            cart.clear();
        }
    }
     
}
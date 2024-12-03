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
        CompactDisc cd1 = new CompactDisc("Thriller", "Pop", 42, "Michael Jackson", "Epic");
        CompactDisc cd2 = new CompactDisc("Back in Black", "Rock", 42, "AC/DC", "Columbia");
        CompactDisc cd3 = new CompactDisc("The Dark Side of the Moon", "Progressive Rock", 42, "Pink Floyd", "Harvest");
        CompactDisc cd4 = new CompactDisc("Rumours", "Rock", 39, "Fleetwood Mac", "Reprise");
        CompactDisc cd5 = new CompactDisc("25", "Pop", 48, "Adele", "XL Recordings");

        // Tạo sách
        Book book1 = new Book("The Hobbit", "Fantasy", 0.5);
        Book book2 = new Book("1984", "Dystopian", 0.4);
        Book book3 = new Book("To Kill a Mockingbird", "Classic", 0.6);
        Book book4 = new Book("The Great Gatsby", "Classic", 0.3);
        Book book5 = new Book("Pride and Prejudice", "Romance", 0.4);


        // add media
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(dvd5);
        store.addMedia(cd1);
        store.addMedia(cd2);
        store.addMedia(cd3);
        store.addMedia(cd4);
        store.addMedia(cd5);
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        store.addMedia(book4);
        store.addMedia(book5);

        // Giao diện menu chính
        while (true) {
            showMenu();
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
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }

    public static void storeMenu(Store store, Cart cart, Scanner sc) {
        while (true) {
            store.showStore();
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media’s details");
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
        while (true) {
            System.out.println("Các lựa chọn: ");
            System.out.println("--------------------------------");
            System.out.println("1. Lọc media trong giỏ hàng");
            System.out.println("2. Sắp xếp media trong giỏ hàng");
            System.out.println("3. Xóa media khỏi giỏ hàng");
            System.out.println("4. Phát một media");
            System.out.println("5. Đặt hàng");
            System.out.println("0. Quay lại");
            System.out.println("--------------------------------");
            System.out.print("Vui lòng chọn một số: 0-1-2-3-4-5: ");
            
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
                    System.out.println("Quay lại menu chính...");
                    return; // Thoát khỏi hàm và quay lại menu chính
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
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
                    System.out.println("Enter authors of the book (separate multiple authors with commas):");
                    String authorsInput = sc.nextLine();
                    ArrayList<String> authors = new ArrayList<>();
                    String[] authorArray = authorsInput.split(",");
                    for (String author : authorArray) {
                        authors.add(author.trim()); // Thêm từng tác giả vào danh sách
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
        System.out.println("Lọc media theo:");
        System.out.println("1. Theo ID");
        System.out.println("2. Theo Title");
        System.out.print("Lựa chọn của bạn: ");
        int filterChoice = sc.nextInt();
        sc.nextLine(); // Consume newline
    
        if (filterChoice == 1) {
            System.out.print("Nhập ID của media: ");
            int id = sc.nextInt();
            sc.nextLine();
            Media media = cart.getMediaById(id);
            if (media != null) {
                System.out.println(media);
            } else {
                System.out.println("Không tìm thấy media với ID " + id + ".");
            }
        } else if (filterChoice == 2) {
            System.out.print("Nhập tiêu đề của media: ");
            String title = sc.nextLine();
            Media media = cart.getMediaByTitle(title);
            if (media != null) {
                System.out.println(media);
            } else {
                System.out.println("Không tìm thấy media với tiêu đề " + title + ".");
            }
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }
    }
    
    private static void sortMedias(Cart cart, Scanner sc) {
        System.out.println("Sắp xếp media theo:");
        System.out.println("1. Theo tiêu đề");
        System.out.println("2. Theo giá");
        System.out.print("Lựa chọn của bạn: ");
        int sortChoice = sc.nextInt();
        sc.nextLine();
    
        if (sortChoice == 1) {
            cart.sortByCostTitle();;
            System.out.println("Giỏ hàng đã được sắp xếp theo tiêu đề:");
            cart.printCart();
        } else if (sortChoice == 2) {
            cart.sortByTitleCost();;
            System.out.println("Giỏ hàng đã được sắp xếp theo giá:");
            cart.printCart();;
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }
    }
    private static void removeMediaFromCart(Cart cart, Scanner sc) {
        System.out.print("Nhập tiêu đề của media để xóa: ");
        String title = sc.nextLine();
        Media media = cart.getMediaByTitle(title);
        if (media != null) {
            cart.removeMedia(media);
            System.out.println("Media '" + title + "' đã được xóa khỏi giỏ hàng.");
        } else {
            System.out.println("Không tìm thấy media với tiêu đề '" + title + "'.");
        }
    }
    private static void playMediaInCart(Cart cart, Scanner sc) {
        System.out.print("Nhập tiêu đề của media để phát: ");
        String title = sc.nextLine();
        Media media = cart.getMediaByTitle(title);
        if (media instanceof Playable) {
            ((Playable) media).play();
        } else {
            System.out.println("Media '" + title + "' không thể phát được.");
        }
    }
    private static void placeOrder(Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Giỏ hàng trống. Không thể đặt hàng.");
        } else {
            System.out.println("Đặt hàng thành công!");
            cart.clear();
        }
    }    
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfDaysOfAMonth {
    private static final Map<String, Integer> MONTHS = new HashMap<>();

    static {
        MONTHS.put("January", 1);
        MONTHS.put("Jan.", 1);
        MONTHS.put("Jan", 1);
        MONTHS.put("February", 2);
        MONTHS.put("Feb.", 2);
        MONTHS.put("Feb", 2);
        MONTHS.put("March", 3);
        MONTHS.put("Mar.", 3);
        MONTHS.put("Mar", 3);
        MONTHS.put("April", 4);
        MONTHS.put("Apr.", 4);
        MONTHS.put("Apr", 4);
        MONTHS.put("May", 5);
        MONTHS.put("June", 6);
        MONTHS.put("Jun.", 6);
        MONTHS.put("Jun", 6);
        MONTHS.put("July", 7);
        MONTHS.put("Jul.", 7);
        MONTHS.put("Jul", 7);
        MONTHS.put("August", 8);
        MONTHS.put("Aug.", 8);
        MONTHS.put("Aug", 8);
        MONTHS.put("September", 9);
        MONTHS.put("Sep.", 9);
        MONTHS.put("Sep", 9);
        MONTHS.put("October", 10);
        MONTHS.put("Oct.", 10);
        MONTHS.put("Oct", 10);
        MONTHS.put("November", 11);
        MONTHS.put("Nov.", 11);
        MONTHS.put("Nov", 11);
        MONTHS.put("December", 12);
        MONTHS.put("Dec.", 12);
        MONTHS.put("Dec", 12);
    }


    private static boolean isLeapyear(int year){
        return ((year % 100 == 0 && year % 400 != 0)  || year % 4 != 0) ? false : true;
    }

    private static int getdayofmonth(int month, int year){
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapyear(year)?29:28;
            default:
                return 0;
        }
    }

    private static int getMonth(String month){
        if(month.matches("\\d+")){ // Kiem tra xem string kia co phai la so 0 - 9 hay k ? 
            return Integer.parseInt(month);
        } else return MONTHS.get(month);
    }

    public static void main(String[] args) {
        System.out.println("Nhap thang va nam: ");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine().trim();
        int year = scanner.nextInt();
        System.out.println("So ngay cua thang "+ getMonth(month) + " nam " + year + " la: " + getdayofmonth(getMonth(month), year));
        scanner.close();
    }
    
    
}

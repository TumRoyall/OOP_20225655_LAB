import java.util.Scanner;

public class InputFromKeyBoard {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What's your name?");
        String name = keyboard.nextLine();
        System.out.print("How old are you?");
        int old = keyboard.nextInt();
        System.out.print("How tall are you? (m)");
        double height = keyboard.nextDouble();
        keyboard.close();
        System.out.println("Mrs/Ms. " + name + ", " + old + " years old. " + "Your height is " + height + " (m).");
    }
}

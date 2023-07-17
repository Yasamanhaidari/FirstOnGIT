import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter ooh to sow what Happening :)");
        Scanner scanner = new Scanner(System.in);
        String First = scanner.next();
        if (Objects.equals(First, "ooh"))
            menu();
        else System.out.println("ops :( And BY ");
    }

    public static void menu() {
        System.out.println("Hello Welcome to My world!");
        System.out.println("To see my name Write One :-)");
        System.out.println("To see my Location Write Two .-)");
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        if (Objects.equals(value, "One")) {
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("Welcome to My First code in GIT");
            System.out.println("My name is Yasaman ");
            System.out.println("Now you go back to Menu Write Two to see My location");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        } else {
            System.out.println("Hi dear im from Sanandaj in Iran dadadaaaa :|");
            menu();
        }
    }
}
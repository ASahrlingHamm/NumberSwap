import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the value of x and y with a space between");

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("before swapping numbers: " +x +" " +y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping: " + x +" "+ y);
    }
}
import java.util.Scanner;

public class AgePrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = Input.readInt(in, "Please enter your age", "Illegal Input--try again", 1, 150);
        System.out.println("Next year, you'll be " + (age + 1));
    }
}

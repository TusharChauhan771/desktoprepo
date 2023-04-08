import java.util.Scanner;

public class PersonalizedGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the world of Java programming.");
    }
}

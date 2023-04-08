public class PersonalizedGreeting {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide your name as a command-line argument.");
        } else {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        }
    }
}

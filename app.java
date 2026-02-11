public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Prints the output to the console
    }
}

//dev-2 push 

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter your name:");
        String userName = scanner.nextLine(); // Read user input (String)

        System.out.println("Enter your age:");
        int userAge = scanner.nextInt(); // Read user input (integer)

        System.out.println("Hi " + userName + "! You are " + userAge + " years old.");
        scanner.close(); // Close the scanner
    }
}

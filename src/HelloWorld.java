import java.util.Scanner;

// first program - hello world
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.print("Hello\n"); // \n forces a line break (or use println)
        System.out.print("Goodbye");
        System.out.print("Happy Day to you.\n"); // GoodbyeHappy Day to you. is what will print

        // import java.util.Scanner; this imports the Scanner Element from the 'UTIL' package.
        // method to greet a user personally
        Scanner userInput = new Scanner(System.in); // scanner is used to receive input
        System.out.println("What is your first name?");
        String firstName = userInput.nextLine();
        System.out.println("What is your last name?");
        String lastName = userInput.nextLine();
        System.out.printf("Hello %s %s!\n", firstName, lastName);
        System.out.printf("Goodbye %s, %s!\n", lastName, firstName);  // use 'printf' when declaring variables
    }
}
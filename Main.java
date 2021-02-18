import java.util.Scanner;

/**
 *The hello world program
 * @author Yogi
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Ask the user from their name
    System.out.println("Please enter your name:");
    //creating a Scanner for user input
    Scanner input = new Scanner(System.in);
    //declare and initialize the name variable 
    String name = input.nextLine();
    // say hello to the user
    System.out.println("Hello " + name);
    // ask the user when they were born
    System.out.println("Please enter the year you were born:");
    //create the variable to store the birth year
    int birthYear = input.nextInt();
    // calculate the approximate age
    final int CURRENT_YEAR = 2021;
    int age = CURRENT_YEAR - birthYear;
    // let the user know their age
    System.out.println("You are approximately " + age + " years old");

  }
}

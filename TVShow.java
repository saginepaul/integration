import java.util.Scanner;
// Laura Paul - Integration project

public class TVShow {

  // "main" indicates where the program starts."main" is also the method name
  public static void main(String[] args) {
    SBDemo.doDemo();
    // you only need 1 Scanner input
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to my Integration Project !");

    // output for prompt
    System.out.println("Enter the name of your favorite TV Show");

    // wait for user's input
    String show = input.nextLine();

    // tell the user what they entered
    System.out.println("you entered: " + show.trim());
    System.out.println("your show starts with: " + show.charAt(0));

    // Ask for another input from user
    System.out.println("What day is your TV show is on ?");
    String day = input.nextLine();
    // boolean result = true;
    String today = "Monday";
    if (today != "Monday") {
      System.out.println("No new episode today!");
    }

    else {
      System.out.println("Your show is on today");
    }

    // ctrl+shift+f for formatting to the style you set
    // int value = input.nextInt();

    // System.out.println("you entered:" + value);

    // if - statement : user enter a time
    System.out.println("Enter a time to check if your show is on ? ");
    int showtime = input.nextInt();
    if (showtime == 7) {
      System.out.println("Enjoy your show ! ");
    } else {
      System.out.println("No show today");
    }
    checkIfMissed(input);

    // Create a Kitten object using the Kitten class
    Kitten kitten1 = new Kitten();
    kitten1.setName("Mimi");
    kitten1.setWeight(20);
    kitten1.setAge(3);
    kitten1.setColor("brown");
    kitten1.posture();
    int year = kitten1.calculateYearsOfBirth();
    System.out.println(" The year of birth is " + year);
    System.out.println("The kitten's name is " + kitten1.getName());
    Examples.demoStrings();
    Examples.calculator();
    Examples.demoInt();
    
  }

  // Method
  public static void checkIfMissed(Scanner input) {
    System.out.println(
        "Enter 1, if you missed the last episode or 2 if you did not miss it");

    // nextLine is the method name
    int choice = input.nextInt();
    // switch statement
    switch (choice) {

      case 1:
        System.out.println("Here is what you missed !");
        break;
      case 2:
        System.out.println(" Brand New episode starts today !");
        break;

    }

  }

  // Overload constructors examples
  BoxConstructing boxconstructing1 = new BoxConstructing(10, 20, 15);
  BoxConstructing boxconstructing2 = new BoxConstructing(23, 35, 43);

  double vol;
  {

    vol = boxconstructing1.volume();
    System.out.println("Volume of boxconstructing1 is " + vol);

    vol = boxconstructing2.volume();
    System.out.println("Volume of boxconstructing2 is " + vol);

  }
}
import java.util.Scanner;

public class EmailGenerator {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print( "Are you a student or a teacher? ");
    String occuptain = s.nextLine();
    System.out.print( "Enter your favorite number: ");
    String favoriteNum = s.nextLine();


    if(occuptain.equalsIgnoreCase("student")) {

      System.out.println( firstName + initialize(lastName)+ favoriteNum + "@nycstudents.net" );}

      else if(occuptain.equalsIgnoreCase("teacher")){

        System.out.println(initialize(firstName) + lastName + favoriteNum + "@schools.nyc.gov");}
      
      else {
      System.out.println("Check your spelling!!");}

    // test output
   

    s.close();
  } // end main method



  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method
}
 // end class
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
    System.out.println(generatePassword());


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

  public static String generatePassword() {
    String password = "";
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your password length: ");


    int length = s.nextInt();

  
    for(int i = 0; i < length; i++){
      int rand = (int)(Math.random()*(90-64+1) + 64);
      int lower = (int)(Math.random()*(122-97+1) + 97);
      int numspec = (int)(Math.random()*(57-33+1) + 33);
     

          char randc = (char)rand;
          char lowerc = (char)lower;
          char numspecc = (char)numspec;
          
          password += randc;
          password += lowerc;
          password += numspecc;
      }
      password = password.substring(0,length);
      s.close();
      return password;

      
    }
}
 // end class
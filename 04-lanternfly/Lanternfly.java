
/**
 * Write a description of class lanternfly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");
        
        System.out.print("How many did you squash this summer? ");
        int num = input.nextInt();
        
        if (num < 10) {
            System.out.println("That's it??? ");
        } // end if statement
        else {
            System.out.println("What, do you want a cookie?");
        } // end else statement
        
    } // end main method

} // end class


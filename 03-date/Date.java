import java.util.Scanner;

class Date { // start of the Test class
    public static void main(String[] args) { // start of main
        
        Scanner scan = new Scanner(System.in); 
            
            System.out.println("Enter the day of the week: ");
            String dayOfWeek = scan.nextLine();
            
            System.out.println("Enter the month: ");
            String month = scan.nextLine();

            System.out.println("Enter the day of the month: ");
            int dayOfMonth = scan.nextInt();

            System.out.println("Enter the year: ");
            int year = scan.nextInt();

            american(dayOfWeek, month, dayOfMonth, year);

           european(dayOfWeek, month, dayOfMonth, year);


        
        } // end of main

        public static void american(String dayOfWeek, String month, int dayOfMonth, int year) { // start of the american method

            System.out.println("\nAmerican Format: " + dayOfWeek + ", " + month + " " + dayOfMonth + ", " + year);

            ;

        } // end of the american method

        public static void european(String dayOfWeek, String month, int dayOfMonth, int year) {

            System.out.println("\nEuropean Format: " + dayOfWeek + " " + dayOfMonth + " " + month + " " + year);

        }

    } // end of class

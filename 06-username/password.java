import java.util.Scanner;



public class password{
    public static void main (String[]args) {
        System.out.println(generatePassword());
      }
      
      public static String generatePassword() {
      String password = "";
      Scanner s = new Scanner(System.in);
      System.out.println("Enter your password length: ");


      int length = s.nextInt();

    
      for(int i = 0; i < length; i++){
        int rand = (int)(Math.random()*(90-65+1) + 65);
        int lower = (int)(Math.random()*(700-79));
            char c = (char)rand;
            password += c;
        }
        s.close();
        return password;

        
      }

    }
import java.util.Scanner;


public class laCasa {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want your first unique word to be?");
        String uniqueWord1 = scanner.nextLine();
        System.out.println("What do you want your second unique word to be?");
        String uniqueWord2 = scanner.nextLine();
    triangularTop();
    
    wall();
    
    uniqueWall(uniqueWord1, uniqueWord2);
    
    wall();
    
    triangularTop();
    
        }
        
        public static void floor() {
            
            System.out.println(" +------+");
            
        }
    public static void wall() {
        floor();
        System.out.println(" |      |");
        System.out.println(" |      |");
        floor();
    }
        public static void uniqueWall(String uniqueWord1, String uniqueWord2) {
            System.out.println(" |" + uniqueWord1 + "|");
            System.out.println(" |" + uniqueWord2 + "|");
           
            
            
        }
        
        public static void triangularTop() {
            
            System.out.println("    /\\   ");
            System.out.println("   /  \\  ");
            System.out.println("  /    \\ ");
            
            
            
        }
}
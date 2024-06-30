
import java.util.Scanner;

class learn1 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
            int Button = sc.nextInt();
        
            switch(Button){
                case 1: 
                    System.out.println("Hello");
                break;
                case 2: 
                    System.out.println("Jay Shivray");
                break;
                case 3: 
                    System.out.println("Jay Bhim");
                break;
                default: 
                    System.out.println("Invalid button");
            }
        }
    }



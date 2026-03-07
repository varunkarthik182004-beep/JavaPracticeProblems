import java.util.Scanner;

public class Sswitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch(fruit){
            case "banana":
                System.out.println("Fuck You");
                break;

            case "apple":
                System.out.println("Love You");
                break;

            case  "orange":
                System.out.println("Kiss You");
                break;
            default:
                System.out.println("Sorry You");
        }
    }
}

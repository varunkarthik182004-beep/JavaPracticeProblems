import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        System.out.println("Enter the operator");
        Scanner input = new Scanner(System.in);
        char op = input.next().trim().charAt(0);

        while(true){
            if( op == '+' || op == '-' || op =='*' || op == '%' || op == '/'){

                System.out.println("Enter the first number");
                int num1 =  input.nextInt();

                System.out.println("Enter the second number");
                int num2 =  input.nextInt();
                int ans = 0;


                if( op == '+'){
                    ans = num1 + num2;
                }
                else if( op == '-'){
                    ans = num1 - num2;
                }
                else if( op == '%'){
                    ans = num1 % num2;
                }
                else if( op == '*'){
                    ans = num1 * num2;
                }
                else if( op == '/'){
                    ans = num1 / num2;
                }
                else {
                    System.out.println("Invalid input");
                }
                System.out.println(ans);
            }
            else if(op == 'X' || op == 'x'){
                break;
            }
            else{
                System.out.println("Invalid input");
            }

        }
    }
}

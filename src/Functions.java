import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter a number: ");
        int number2 = input.nextInt();
        int ans = Sum(number,number2);
        System.out.println(ans);
    }

    static int Sum(int a, int b){
        int sum = a + b;
        return sum;
    }
}

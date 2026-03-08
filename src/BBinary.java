import java.util.Scanner;
// 744 Leet Code
class BBinary {
    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        char[] arr = new char [3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter characters :");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the character which you want to enter:");
        char ch = sc.next().charAt(0);
        char ans = nextGreatestLetter(arr,ch);
        System.out.println(ans);
    }


}

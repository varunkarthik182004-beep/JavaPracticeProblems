import java.util.Scanner;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i = 0;i <n;i++){
            nums[i]= sc.nextInt();
        }
        Sort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void Sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i]-1;
            if(arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

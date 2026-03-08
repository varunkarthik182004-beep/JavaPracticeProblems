import java.util.Scanner;

public class FirstLast {

        static int[] searchRange(int[] nums, int target) {
            int first = chech(nums,target,true);
            int last = chech(nums,target,false);
            return new int[]{first,last};
        }

        static int chech(int[] nums,int target,boolean isFirst){
            int start = 0;
            int end = nums.length - 1;
            int ans = -1;
            while(start <= end){
                int mid = start + (end - start ) / 2;
                if (target < nums[mid]){
                    end = mid -1;
                }
                else if(target > nums[mid]){
                    start = mid + 1;
                }
                else{
                    ans = mid;
                    if(isFirst){
                        end = mid - 1;
                    }
                    else{
                        start = mid + 1;
                    }
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[10];

            System.out.println("Enter 10 numbers:");
            for(int i = 0; i < 10; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the target number:");
            int target = sc.nextInt();

            int[] result = searchRange(arr, target);

            System.out.println("First Position: " + result[0]);
            System.out.println("Last Position: " + result[1]);
        }

}

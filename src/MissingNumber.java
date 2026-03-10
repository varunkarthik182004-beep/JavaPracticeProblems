public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {6,2,3,0,1,4};
        System.out.println(arrange(arr));


    }
    static void sorting(int[] arr){

        for(int i =0; i < arr.length; ){
            int correct = arr[i];
            if ( arr[i] < arr.length && arr[correct]!=arr[i]){
                    swap(arr,correct,i);
            }
            else{
                i++;
            }
        }
    }
    static int  arrange(int[] arr){
        sorting(arr);
        for(int i =0;i < arr.length;i++){
            if(arr[i]!=i)
                return i;
        }
        return arr.length;
    }

    static void swap(int[] arr,int value1,int value2){
        int temp = arr[value1];
        arr[value1] = arr[value2];
        arr[value2] = temp;
    }
}

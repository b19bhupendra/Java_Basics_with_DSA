package arrays;

import java.util.Scanner;

public class TwoPointer {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array");
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        int [] result1 = sortArray(arr);
//        int [] result2 = sortArrayTwoPointer(arr);
//        int [] result =  reOrderEvenOdd(arr);
        int [] result = sortedSqArray(arr);
        printArray(result);
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static int [] reverseArray(int []arr){
        int left = 0, right = arr.length-1;
        while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
    public static int [] sortArray(int []arr){
        int zeros = 0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]==0){
                zeros++;
            }
        }

        for (int i=0;i<arr.length; i++){
            if(i<zeros){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        return arr;
    }

    /**
     * i/p int arr[] = [1,0,0,1,0,1,1,0,0]
     * o/p = [0,0,0,0,0,1,1,1,1]
     * @param arr
     * @return
     */
    public static int [] sortArrayTwoPointer(int []arr){
        int left=0, right = arr.length-1; // arr = [1,0,0,1,0,1,1,0,0]
        while (left<right){
            if(arr[left] == 1 && arr[right] == 0){
                int temp = arr[left];
                arr[left] =arr[right];
                arr[right] = temp;
                right--;
                left++;
            }
             if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
        return arr;
    }
    /**
     * Rearange array where all even integer should come first and followed by odd
     * i/p = 1,2,3,4,5,6,7
     * o/p = 2,4,6,1,3,5,7
     */
    public static int [] reOrderEvenOdd(int [] arr){
        int left =0, right = arr.length-1;
        while(left<right){ //[1,2,3,4,5,6,7]
            if(arr[left] %2!=0 && arr[right]%2 ==0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
        return arr;
    }

    public static int [] sortedSqArray(int []arr){
        int left = 0, right = arr.length-1;
        int ans [] = new int[arr.length];
        int i=0;
//        while(left <= right){
//            if(Math.abs(arr[left]) > Math.abs(arr[right])){
//                ans[i++] = arr[left]*arr[left];
//                left++;
//            }else{
////            if(Math.abs(arr[left])< Math.abs(arr[right])){
//                ans[i++] = arr[right]* arr[right];
//                right--;
//            }
//        }
        int k = arr.length-1;
        while (left <= right) {
            int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];
            if (leftSq > rightSq) {
                ans[k--] = leftSq;
                left++;
            } else {
                ans[k--] = rightSq;
                right--;
            }
        }
        reverseArray(ans);
        return ans;
    }
}

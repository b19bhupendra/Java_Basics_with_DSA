package arrays;
import java.util.*;
/**
 * i/p: nums = [1,2,3,4]
 * o/p: [1,3,6,10]
 */
public class RunningSum01 {

    public static void main(String [] args){
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

       for(int i =0; i< arr.length; i++){
           arr[i] = sc.nextInt();
       }

       int result[] = runningSumArr(arr,n);
       System.out.println(Arrays.toString(result));
        forEachCheck(arr,n);
    }
    public static int[] runningSumArr(int arr[],int n){
        for(int i =1; i<arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }

    public static void forEachCheck(int arr[], int n){
        int index = 0;
        int sum = 0;
        for ( int i :arr) { //{1,2,3,4}
            sum = sum + i;
            arr[index++] =sum;
        }
        System.out.println("For each output:-> "+Arrays.toString(arr));
    }
 }

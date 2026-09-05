package arrays;
import java.util.*;
public class LastOccuranceEle {

    public static void main(String []args){
        Scanner sc =  new Scanner (System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the element for which u find the last occurance-->");
        int x = sc.nextInt();
        int []arr =  new int[n];
        System.out.println("enter ele of arrays: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        lastOccuranceElement(arr,n,x);
        greaterEleThenX(arr, n, x);
        isSortedArr(arr, n, x);
        int arr4[] = smallestAndLargest(arr,n,x);
        for (int i =0; i<arr4.length; i++){
            System.out.println(arr4[i]);
        }

    }
    public static void lastOccuranceElement(int[] arr, int n, int x){
        int eleOccur = -1;
        for(int i =0; i<n; i++){ // 1,4,2,4,3
            if(arr[i] == x){
                eleOccur= arr[i];
            }
        }
        System.out.println("Last occurance index of x : "+eleOccur);
    }
    //elements greater then x
    public static void greaterEleThenX(int []arr, int n, int x){
        int count =0;
        for(int i =0; i<n; i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println("Elements strictly greater then x: "+ count);
    }

    // Check if arr is sorted or not
    public static void isSortedArr(int []arr, int n, int x){
        boolean isSorted = true;
        for (int i =0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println("arr is sorted or not : "+ isSorted);
    }

    // return arry of smallest and largest ele of array
    public static int[] smallestAndLargest(int []arr, int n , int x){
        int [] arr2 = arr.clone();
        for (int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++) {
                if(arr2[j]> arr2[j+1]){//2,1
                    int temp = arr2[j];//2,
                    arr2[j] = arr2[j+1];//1
                    arr2[j+1] = temp;//2
                }
            }
        }

        int arr3 [] = new int[2];
        for (int i =0; i<n; i++){
            arr3[0] = arr2[0];
            arr3[1] = arr2[n-1];
        }
        return arr3;
    }
}

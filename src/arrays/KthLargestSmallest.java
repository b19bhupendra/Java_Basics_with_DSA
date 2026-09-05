package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class KthLargestSmallest {

    public static void main(String [] args){
        Scanner sc =  new Scanner (System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the element for which u find the smallest and largest -->");
        int k = sc.nextInt();
        int []arr =  new int[n];
        System.out.println("enter ele of arrays: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

//        kthLargest(arr, k);
//        pairSum(arr, k);
//        tripletSum(arr, k);
//        uniqueValue(arr);
//        uniqueValue2(arr);
//        secondMax(arr);
//        int ans  = firstRepeating(arr);
//        System.out.println("ans: "+ ans);
//        int last = lastRepeatingEle(arr);
//        System.out.println("last repeated ele: "+ last);
//        reverseArray(arr);
//        int result [] = rotateArrrayByK(arr,k);
        int result [] = rotateInPlace(arr,k);
        for(int i =0 ;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
    public static void kthLargest(int [] arr, int k){ //[3,2,1,5,6,4] k=3

        for(int i =0; i<arr.length; i++){
            for(int j = 0; j< arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        if(k<=arr.length){
            System.out.println(arr[arr.length-k]);
        }
        System.out.println("kth largest ele where k is greater then size ");
    }

    public static void pairSum(int [] arr, int k){
        int count =0;
        for(int i =0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                int sum = arr[i] + arr[j];
                if (sum == k){
                    count++;
                }
            }
        }
        System.out.println("pair sum count: "+count);
    }

    public static void tripletSum(int []arr, int target){
        int n = arr.length;
        int count = 0;
        for (int i =0;i<n;i++){
            for (int j =i+1; j<n; j++){
                for (int k = j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        count++;
                    }
                }
            }
        }
        System.out.println("Triplet sum : "+ count);
    }

    public static void uniqueValue(int [] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                System.out.println("unique ele " + i);
            }
        }
    }

    public static void uniqueValue2(int [] arr){
        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j <arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans =-1;
        for (int i =0; i<arr.length; i++){
            if(arr[i]>0){
               ans =arr[i];
            }
        }
        System.out.println("unique approch 2 : "+ ans);
    }


    //Maximum Value
    public static int maxValue(int []arr){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        return max;
    }

    /**
     * Second max ele from array
     * @param arr
     */
    public static void secondMax(int [] arr){
        int max = maxValue(arr);
        System.out.println("Maximum value in the array is : "+ max);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = maxValue(arr);
    }

    /**
     * [1,5,3,4,6,3,4] ans = 3
     * @param arr
     */
    public static int firstRepeating(int [] arr){
        for(int i =0 ; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("First repeating element is : "+ arr[i]);
                    return arr[i];
                }
            }
        }
        return -1;
    }

    /**
     * Last Repeating ele in array
     * [1,5,3,4,6,3,4,6] ans :6
     */
    public static int lastRepeatingEle(int [] arr){
        int lastRepeating = -1;
        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    lastRepeating = arr[i];
                }
            }
        }
        return lastRepeating;
    }


    /**
     * Reverse Array
     */
    public static void reverseArray(int []arr){
        int n = arr.length;
        int ans [] = new int [n];
        int j=0;
        for(int i =n-1; i>n/2; i--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;

        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    /**
     * Rotate array by k steps to right
     */

    public static int[] rotateArrrayByK(int []arr, int k){
        int n = arr.length;
        k= k%n;
        int j =0;
        int ans [] =  new int [n];
        for(int i = n-k; i<n ;i++){
            ans[j++] = arr[i];
        }

        for(int i = 0; i< n-k; i++){
            ans[j++] = arr[i];
        }

        return ans;
    }

    public static void reverseArrayV2(int []arr, int startIndex, int endIndex){
        while(startIndex<endIndex){
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
    /**
     * Rotate array by k without extra space
     * [1,2,3,4,5,6,7] , n-k = 7-3= 5
     */
    public static int[] rotateInPlace(int [] arr, int k){
        int n = arr.length;
        k= k%n;
       reverseArrayV2(arr, 0, n-k-1);
       reverseArrayV2(arr,n-k,n-1);
       reverseArrayV2(arr, 0,n-1);
       return  arr;
    }
}

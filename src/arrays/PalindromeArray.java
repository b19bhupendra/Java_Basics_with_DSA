package arrays;

import java.util.Scanner;

public class PalindromeArray {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        System.out.println("Enter the values in the arrays");
        int []arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int flag =0;
//      palindrome(n,arr,flag);
//      reverse(n,arr);
      missingNumber(n,arr);
//        duplicate(n,arr);
    }

    public static void palindrome(int n, int arr[],int flag){
        for(int i=0; i<n/2; i++){
            if(arr[i]!=arr[n-i-1]){
                flag = 1;
                System.out.println("Not a palindrome array");
                break;
            }
        }
        if(flag==0){
            System.out.println("Palindrome Array");
        }
    }

    public static void reverse(int n, int arr[]){

        for(int i =0; i<n/2; i++){
            int temp = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i] = temp;
        }
        for(int i =0; i<n;i++) {
            System.out.print("Reversed Array: "+arr[i]);
        }
    }

    public static void missingNumber(int n, int arr[]){
        int totalSum = ((n)*(n+1))/2;
        int arraySum = 0;
        for(int i=0; i<n; i++){
            arraySum = arraySum + arr[i];
        }
        int missingNumber = totalSum-arraySum;
        System.out.println(missingNumber);
    }

    /*
        Duplicate numbers in an array
     */
    public static void duplicate(int n, int arr[]){
        for(int i =0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate element found :-> "+ arr[i]);
                }
            }
        }
    }
}

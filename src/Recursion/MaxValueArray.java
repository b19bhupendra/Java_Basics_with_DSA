package Recursion;

import java.util.Scanner;

public class MaxValueArray {

    public static void main(String[]args){

        int [] arr = {5,6,7,8,9};
        int index =0;
        int result = maxArrayValues(arr,index);
        System.out.println("Max value in the arrays:  "+ result);
    }
    public static int maxArrayValues(int arr[], int index){

        if(index == arr.length-1){
            return arr[index];
        }

        int smallWork = maxArrayValues(arr, index+1);

        return Math.max(arr[index], smallWork);
    }
}

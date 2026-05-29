package Recursion;

public class SumArraysValue
{
    public static void main(String []args){
        int arr[] = {2,3,2,13};
        int index =0;
        int res = sumOfValues(arr, index);
        System.out.println(res);
    }
    public static int sumOfValues(int arr[], int index){

        if(index == arr.length-1){
            return arr[index];
        }

        int sum = arr[index] + sumOfValues(arr, index+1);
        return sum;
    }
}

package Recursion;

public class PrintArray
{
    public static void main(String []args){
        int [] arr = {5,6,7,8,9};
        int index =0;
        printArrayValues(arr,index);
    }
    public static void printArrayValues(int arr[], int index){

        //Base Case
        if(arr.length == index){
            return;
        }

        //SelfWork
        System.out.println(arr[index]);

        //Recursive Call
        printArrayValues(arr, index+1);
    }
}

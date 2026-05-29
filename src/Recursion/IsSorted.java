package Recursion;

public class IsSorted
{
    public static void main(String []args){
        int [] arr = {2,4,5};
        int index = 0;

        Boolean result = isSortedArrays(arr, index);
        System.out.println(result);
    }
    public static boolean isSortedArrays(int [] arr, int index){

        //BASE CASE
        if(index == arr.length-1){
            return true;
        }


        //SELF WORK
        if(arr[index]> arr[index+1]){
            return false;
        }

        //RECURSIVE CALL
        return isSortedArrays(arr, index+1);
    }
}

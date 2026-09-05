package Recursion;

public class LinerSearch
{
    public static void main(String[]args){

        int arr[] = {2,4,3,2,7,9};
        int x = 9;
        int index=0;
        Boolean result = searchValueInArray(arr,x,index);
        System.out.println(result);
    }
    public static Boolean searchValueInArray(int arr[], int x,int index){

        //BAse Case
        if(index > arr.length)
            return false;

        //Self work
        if(arr[index] == x){
            return true;
        }

        //Recursive call
        return searchValueInArray(arr, x, index+1);
    }
}

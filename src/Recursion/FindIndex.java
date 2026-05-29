package Recursion;

import java.util.ArrayList;

public class FindIndex
{
    public static void main(String []args){

        int arr[] = {1,3,3,4,3};
        int target =3;
        int index =0;

        allIndices(arr,target,index);
        ArrayList<Integer> ans = allIndicesNew(arr, target, index);
        for (Integer i: ans){
            System.out.println(i);
        }
    }

    public static void allIndices(int arr[], int target, int index){

        //BASE CASE
        if(index == arr.length){
            return;
        }

        //SELF WORK
        if(arr[index]== target){
            System.out.println(index);
        }

        //RECURSIVE WORK
        allIndices(arr, target, index+1);
    }

    public static ArrayList<Integer> allIndicesNew(int [] a, int target, int index){

        //Base CASE
        if(index >= a.length){
            return new ArrayList<Integer>();
        }

        //We have to return arraylist so we have to make an array list ans
        ArrayList<Integer> ans = new ArrayList<>();

        //Self work
        if(a[index] == target){
            ans.add(index);
        }


        //Recursive work
        ArrayList<Integer> smallans = allIndicesNew(a, target, index+1);

        ans.addAll(smallans);
        return ans;
    }
}

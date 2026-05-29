package arrays;
import java.util.*;
public class DifferenceArray {

    public static void main (String []args){
        Scanner sc= new Scanner (System.in);

        int n = sc.nextInt();

        int [] arr =  new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int []differenceArray = new int [n+1];
        int noOfQuery = sc.nextInt();

        //Adding values in the difference array
        for(int i =0;i<noOfQuery;i++){
            int left = sc.nextInt();
            int right = sc.nextInt();
            int value = sc.nextInt();
            differenceArray[left] += value;
            differenceArray[right+1] -= value;
        }

        //PrefixSum of difference array and adding prefixSum value to orignal array
        int sum=0;
        for(int i =0;i<n;i++){

            //Prefix sum of difference array
            sum = sum + differenceArray[i];

            //Adding orignal sum with prefixed sum of difference array.
            arr[i] = arr[i] + sum;
        }

        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
/*
i/p:
size of arr : 5
1,2,3,4,5
No. of queries: 3
left:0 right:3 value:10
left:1 right:4 value:-5
left:0 right:2 value:10

o/p: 21 17 18 9 0
 */
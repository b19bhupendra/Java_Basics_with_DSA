package arrays;

import java.util.*;

public class MinimumElement
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the ArrayList");
        int n =sc.nextInt();
//        int arr[]= new int[n];
        System.out.println("Enter the values in the arrayList");
        ArrayList<Integer>arr = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }
//        Arrays.sort(arr[]);
        int minimum=0;
//        Collections.sort(arr);
//        System.out.println(arr);
        for(int i=1;i<arr.size()-11;i++)
        {
            if(arr.get(i-1)<arr.get(i))
            {
                minimum =arr.get(i-1);
                break;
            }
        }
        System.out.println(minimum);


    }
}

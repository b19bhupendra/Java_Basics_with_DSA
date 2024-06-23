package arrays;

import java.util.*;

public class MaxMin
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the arrayList");
        int n =sc.nextInt();
        System.out.println("Enter the values in  the arraylist");
        ArrayList<Integer>minMax =new ArrayList<>();

        for(int i =0;i<n;i++)
        {
            minMax.add(sc.nextInt());
        }
//        System.out.println(minMax);
        int min=minMax.get(0);
        for(int i =1;i<minMax.size()-1;i++)
        {
            if(minMax.get(i)<min)
            {
                min = minMax.get(i);
            }
        }
        System.out.println(min);
    }
}

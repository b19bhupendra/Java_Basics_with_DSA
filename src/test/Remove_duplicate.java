package test;

import java.util.Arrays;

public class Remove_duplicate
{
    public static void main(String []args)
    {
        String str="TTHRHEEARDAA";
        int index=0;
        char[] array=str.toCharArray();
        for(int i=0;i<array.length;i++)
        {
            int j; //checking if str[i] is present before j
            for(j=0;j<i;j++)
            {
                if(array[i]==array[j])
                {
                    break;
                }
            }

            //if not present then add to it
            if(j==i)
            {
                array[index++]=array[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(array,index)));
    }
}

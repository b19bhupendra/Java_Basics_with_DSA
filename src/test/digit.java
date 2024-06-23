package test;
public class digit
{
    public static void main (String args[])
    {

        int n=13;
        int temp=n;
        int count=0;
        int last=0;
        int digit=0;

        while (n>0)
        {
            last=n%10;
            n=n/10;
            count++;
//             System.out.println(last);
        }
        int arr[]=new int[count];
        int index=0;

        while (temp>0)
        {
            last=temp%10;
            arr[index++]=last;
            temp=temp/10;
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
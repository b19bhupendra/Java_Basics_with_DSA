package arrays2D;

public class ForEachLoop
{
    public static void main(String []args)
    {
        int arr1[]={1,2,3,4,5,5};
        //printing these values using for each loop (enhanced for loop)
        for(int a:arr1)
        {
            System.out.print(a+" ");
        }
        System.out.println("\n-----------2D arrays--------------");
        int arr2[][]={{1,2},{8,9},{7,8}};
        for(int a[]:arr2)
        {
            for(int b:a)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }

    }
}

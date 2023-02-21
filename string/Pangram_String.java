package string;

public class Pangram_String
{
    public static void main(String []args)
    {
        String str="THE QUICK BROWN FOX JUMPS OVER LAZY DOg";
        str=str.replace(" ","");
        str=str.toUpperCase();
        boolean flag=true;
        char [] arr1= str.toCharArray();

        int arr2[]=new int[26];
        for(int i =0;i<arr1.length;i++)
        {
            arr2[arr1[i]-65]++;
        }
        for(int i =0;i<arr2.length;i++)
        {
            if(arr2[i]==0)
            {
                flag=false;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println("Pangram String");
        }
        else
        {
            System.out.println("Not a Pangram String");
        }
        String fName = "James";

        String lName = "Gosling";

        System.out.println(fName = lName);
    }
}

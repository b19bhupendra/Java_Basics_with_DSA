//Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
//strings stored on odd indices of the array.

package arrays;

public class StringArray
{
    public static void main (String []args)
    {
//        Scanner sc= new Scanner (System.in);
        String [] arr= {"ab","bc","cd","de","ef","fg","gh"};

        for (int i=0;i<arr.length;i++)
        {
            if(i%2!=0)
            {
                System.out.println(arr[i]);
            }
        }
    }

}

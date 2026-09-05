package arrays;
import java.util.*;
public class FrequencyArray {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the values of the array: ");
        int []arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number of queries ");
        int query = sc.nextInt();
        isNumPresent(arr,n,query, sc);

    }

    /**
     * @method : createFrequencyArray
     * @Description : create a freq array of arr , keeps the count of the elements of arr
     * @param arr
     * @return
     */
    public static int[] createFreqArray(int []arr){
        int freqArray[] = new int[10005];
        for(int i =0; i<arr.length; i++){
            freqArray[arr[i]]++;
        }
        return freqArray;
    }

    /**
     * @method : Check if the given number is present in the array or not.
     * @param arr
     * @param n
     * @param query
     * @param sc
     */
    public static void isNumPresent(int []arr, int n, int query, Scanner sc){
        int freq[] = createFreqArray(arr);
        while(query > 0){
            System.out.println("Enter the number to be searched : ");
            int x = sc.nextInt();
            if(freq[x]> 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            query--;
        }
    }


}

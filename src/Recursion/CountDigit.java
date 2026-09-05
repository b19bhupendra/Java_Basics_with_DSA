package Recursion;
import java.util.*;
public class CountDigit {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int count = countDigit(n);
        System.out.println("count of digit : "+count);
    }

    public static int countDigit(int n){
        //Base Case
        if(n>=0 && n<=9){
            return n;
        }
        //self work and recursive call
        return 1+countDigit(n/10);
    }
}

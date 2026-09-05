package Recursion;
import java.util.*;
public class SumOfDigit {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int ans = sumOfDigit(n);
        System.out.println("Sum of digit : "+ ans);
    }
    public static int sumOfDigit(int n){
        //Base Case
        if(n>=0 && n<=9){ //When n will be in single digit

            return n;
        }

        //Last Digit
        int lastDigit = n%10;

        //Recursive work
        int firstDigits = sumOfDigit(n/10);

        //Self work of adding last digit
        return (firstDigits + lastDigit);
    }
}

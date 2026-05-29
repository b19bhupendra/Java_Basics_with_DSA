package Recursion;
import java.util.*;
public class AlternateNaturalNum
{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int alternateSum = alternateNaturalNumSum(n);
        System.out.println(alternateSum);
    }
    public static int alternateNaturalNumSum(int n){

        if(n==0){
            return n;
        }
        if(n%2==0){
            return alternateNaturalNumSum(n-1) -n;
        }
        return alternateNaturalNumSum(n-1) +n;
    }
}

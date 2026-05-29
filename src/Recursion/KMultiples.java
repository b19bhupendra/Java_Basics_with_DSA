package Recursion;
import java.util.*;
public class KMultiples {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of K : ");
        int k = sc.nextInt();
        printMultiple(n,k);
    }
    public static void printMultiple(int n, int k){

        //Base Case
        if(k==1){
            System.out.println(n);
            return;
        }

        //recursive call
        printMultiple(n, k-1);

        //selfwork
        System.out.println(n *k);
    }
}

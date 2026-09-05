package Recursion;

import java.util.Scanner;

public class Power {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number p : ");
        int p = sc.nextInt();
        System.out.print("Enter the power of p--> q : ");
        int q = sc.nextInt();

        int value = pow(p,q);
        System.out.println("Value of p power q: "+value);
    }

    public static int pow(int p,int q){ //p^q

        //Base Case
        if(q==0){
            return 1;
        }

        //Recursive work
        int smallAns = pow(p,q-1);
        return smallAns * p; //p^q-1 * p = p^q
    }
}

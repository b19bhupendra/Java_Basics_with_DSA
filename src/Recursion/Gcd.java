package Recursion;
import java.util.*;
public class Gcd {

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the numbers of x and y : ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Gcd obj = new Gcd();
        int gcdResult = obj.gcd(Math.min(x,y),x,y);
        int igcd = obj.longDivisionApproch(x,y);
        int ecluidsResult = obj.EuclidsAlgo(x,y);
        System.out.println("Brut-Force : "+gcdResult);
        System.out.println("Ittrative Approch : "+igcd);
        System.out.println("Euclids Algorithm  : "+ecluidsResult);
    }


    // brute-force recursive method.
    // Recursive function to find GCD starting from min(x, y) down to 1
    public int gcd(int divisor, int x, int y){

        if(x%divisor==0 && y%divisor==0){
            return divisor;
        }
        return gcd(divisor-1,x,y);
    }

    //Ittrative approch
    public int longDivisionApproch(int x, int y){

        while(x%y!=0){
            int reminder = x%y;
            x=y;
            y=reminder;
        }
        return y;
    }

    public int EuclidsAlgo(int x, int y){

        if(y==0){
            return x;
        }
        return EuclidsAlgo(y,x%y);
    }

}

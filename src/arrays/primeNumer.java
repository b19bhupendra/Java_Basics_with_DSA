package arrays;

import java.util.Scanner;

public class primeNumer {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int sieve [] = new int [n+1];

        for(int i =2; i<=n; i++){
            sieve[i]=1;
        }

        sieve[0]=0;
        sieve[1]=0;

        for(int i = 4; i<=n; i+=2){ // Even number are not prime
            sieve[i]=0; //not prime
        }

        for(int i =3; i<=n; i+=2){ //Checking for odd number only
            if(sieve[i]==1){
                for(int j = i*i; j<=n; j+=i){ //all multiple are not prime
                    sieve[j]=0; //not prime
                }
            }
        }

        //Printing Prime no
        for(int i=1; i<=n;i++) {
            if (sieve[i] == 1) {
                System.out.println(sieve[i]);
            }
        }
    }
}

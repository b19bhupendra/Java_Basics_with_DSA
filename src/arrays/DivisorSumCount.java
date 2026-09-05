package arrays;

import java.util.Scanner;

public class DivisorSumCount
{
    public static void main(String[]args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to find its divisor count and divisor sum");
        int n = sc.nextInt();

        int countDivisor[] = new int[n];
        int sumDivisor[] = new int[n];

        for(int i=1; i<n; i++){
            for(int j =i; j<n; j+=i){
                countDivisor[j]++;
                sumDivisor[j] = sumDivisor[j]+i;
            }
        }
        for(int i=1; i<n; i++){
            System.out.println("count of divisor-> "+countDivisor[i]);
        }
        System.out.println();
        for(int i=1; i<n; i++){
            System.out.println(" sum of divisor-> "+sumDivisor[i]);
        }
    }

}
/*
SPOJ Question 
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        int N = 500000+1;
        int divisorSum[] = new int[N];

	    for(int i =1 ; i<N; i++){
	        for(int j=2*i; j<N; j+=i){
	            divisorSum[j]+=i;
	        }
	    }

	    while(t>0){
	        int n = sc.nextInt();
	        System.out.println(divisorSum[n]);
	        t--;
	    }
	}
}
 */
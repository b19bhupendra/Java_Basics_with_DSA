package patters;

import java.util.Scanner;

public class PatternOne {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
//        patern1(n);
//        patern2(n);
//        patern3(n);
//        patern4(n);
//        patern5(n);
//        patern6(n);
//        patern7(n);
//        patern8(n);
//        patern9(n);
//        patern10(n);
//        patern11(n);
//        patern12(n);
//        patern13(n);
        pater14(n);

    }




    public static void patern1(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patern2(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patern3(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void patern4(int n){
        for(int i =0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)('a'+j)+" ");
            }
            System.out.println();
        }
    }

    public static void patern5(int n){
        for(int i = 0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    public static void patern6(int n ){
        for(int i=0;i<n;i++){
            for(int j =0;j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patern7(int n ){
        for(int i=0;i<n;i++){
            for(int j =0;j<n-i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void patern8(int n){
        for(int i = 0; i<n; i++){
            //space
            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j< 2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patern9(int n){
        for(int i =0; i<n; i++){
            //space
            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patern10(int n){
        for(int i =0;i<n; i++){
           //space
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            //star
            for(int j =0; j<2*(n-i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patern11(int n){
        //upperHalf
        for(int i =0; i<n; i++){
            //spaces
            for(int j =0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //starts
            for(int k=0; k<2* i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //LowerHalf
        for(int a = 0; a<n; a++){
            //space
            for(int b=0; b<a; b++) {
                System.out.print(" ");
            }
            //starts
            for(int c= 0; c<2*(n-a)-1; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patern12(int n){
        for(int i = 0; i<2*n-1; i++){
            int stars = i+1;
            if(i>=n){
                stars = 2*n-i-1;
            }
            for(int j =0; j<stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patern13(int n){
        int start = 1;
        for(int i =0 ;i<n; i++){
            if(i%2==0)start=1;
            for(int j =0; j<i+1; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void pater14(int n){
        int spaces =  2 * (n-1);
        for(int i =0 ; i<n; i++){
            // Left numbers
            for(int j =0; j<i+1; j++){
                System.out.print(j+1);
            }
            //space
            for(int k =0; k<spaces; k++){
                System.out.print(" ");
            }
            //right numbers
            for(int l =i+1; l>=1; l--){
                System.out.print(l);
            }
            System.out.println();
            spaces -=2;
        }
    }
}

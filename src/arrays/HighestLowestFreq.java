package arrays;

import java.util.Scanner;

public class HighestLowestFreq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int[] arr = {10, 5, 10, 15, 10, 5};
//        getMaxMiniFreq(arr);
    }
/*
    public static void getMaxMiniFreq(int arr[]){
        int max = 0;
        int minEle =-1;
        int count =0;
        int maxEle =-1;
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }else{

                }
                if(count > max){
                    max = count;
                    ele = arr[i];
                }
            }
        }
    }
}

 */
}

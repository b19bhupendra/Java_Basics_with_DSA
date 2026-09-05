package string;

import java.util.Scanner;

//Write a function that checks whether the alternate characters in a string are different or not.
public class CheckString {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean diff = checkAternateChar(str);
        System.out.println(diff);
        Character ch = 'a';
        int count = countSpecificChar(str, ch);
        System.out.println("specifc char count: "+ count );
    }

    public static boolean checkAternateChar(String str){

        for(int i =0; i<str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static int countSpecificChar(String str, char ch){
        int count =0;
        String lowerCase = str.toLowerCase();
        ch = Character.toLowerCase(ch);
        for(int i=0; i<lowerCase.length();i++){
            if(lowerCase.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}

package Recursion;
import java.util.*;
public class RemoveOccurances
{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        System.out.println(removeChar(str,0));
        System.out.println(removeCharV2(str));

    }

    //dbacx
    public static String removeChar(String str, int index){

        //BASE CASE
        if(str.length() == index){
            return "";
        }

        //RECURSIVE WORK
        String smallWork = removeChar(str, index+1); // bcx

        //Extracting current index
        char currentCharcter = str.charAt(index);


        //SELF WORK
        if(currentCharcter != 'a'){
            return currentCharcter +smallWork; //dbcx
        }

        return smallWork;
    }

    public static String removeCharV2(String str){

        if(str.length() == 0){
            return "";
        }

        //Recursive Work
        String smallAns = removeCharV2(str.substring(1));

        //Extracting current index
        // we taking 0 as everytime we have new string so first char will be current
        char currentCharcter = str.charAt(0);

        //SELF WORK
        if(currentCharcter != 'a'){
            return currentCharcter +smallAns; //dbcx
        }else {

            return smallAns;
        }
    }
}

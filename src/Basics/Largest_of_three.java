//Write a Java program to find the largest of three numbers using nested if-else statements.
package Basics;
import java.util.*;
public class Largest_of_three
{
        public static void main(String[] args) {

            double n1 = -4.5, n2 = 3.9, n3 = 5.5;

            if(n1 >= n2)
            {
                if(n1 >= n3)
                    System.out.println(n1 + " is the largest number.");
                else
                    System.out.println(n3 + " is the largest number.");
            } else
            {
                if(n2 >= n3)
                    System.out.println(n2 + " is the largest number.");
                else
                    System.out.println(n3 + " is the largest number.");
            }
        }
    }

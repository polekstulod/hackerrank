// ? Day 1: Data Types
// >> Link: https://www.hackerrank.com/challenges/30-data-types/problem?isFullScreen=true
// % Language: Java

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int age;
        double price;
        String name;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        age = scan.nextInt();
        price = scan.nextDouble();
        scan.nextLine();
        name = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(age + i);
        
        /* Print the sum of the double variables on a new line. */
        System.out.println(price + d);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + name);

        scan.close();
    }
}
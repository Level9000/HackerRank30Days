package thirtydaysofcode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumbers {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int counter = 0;
        int maxCounter = 0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = Integer.toString(n, 2);
        //iterate through string and compare characters
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i)=='1') {
                counter++;
                //check if current count of consecutive 1's is greater than max
                //if yes, then reassign maxCounter
                if (counter > maxCounter) {
                    maxCounter = counter;
                }
            } else {
                counter=0;
            }       
        }
        System.out.println(maxCounter);
        scanner.close();
    }
}
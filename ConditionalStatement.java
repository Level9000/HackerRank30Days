package thirtydaysofcode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;


public class ConditionalStatement {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //N%2 = 0 means number is even
        if(N%2 ==0) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }

        scanner.close();
    }
}
package thirtydaysofcode;

import java.io.*;
import java.util.*;

public class LetsReview {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //number of test cases
        int T = sc.nextInt();
        //loop through the test cases and create string arrays for each case
        for (int i=0; i < T; i++) {
            String input = sc.next();
            int len = input.length();
            String[] s = new String[len];
            s = input.split("");
            //declare stringbuilders for even and odds
            StringBuilder strEven = new StringBuilder();
            StringBuilder strOdd = new StringBuilder();
            //find length of string array.  # of characters in string
            for(int l=0; l < len; l++){
                if(l%2 ==0) {
                    strEven.append(s[l]);
                } else {
                    strOdd.append(s[l]);
                }
            }
            System.out.println(strEven.toString() + " " + strOdd.toString());
        }
        sc.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
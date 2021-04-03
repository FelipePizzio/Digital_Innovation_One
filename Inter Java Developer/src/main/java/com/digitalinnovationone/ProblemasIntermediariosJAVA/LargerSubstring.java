package com.digitalinnovationone.ProblemasIntermediariosJAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class LargerSubstring {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String firstString, secondString, bigger, smaller;
        while ((firstString = in.readLine()) != null) {
            secondString = in.readLine();
            if (firstString.length() > secondString.length()) {
                bigger = firstString;
                smaller = secondString;
            } else {
                smaller = firstString;
                bigger = secondString;
            }

            int minLength = smaller.length();
            int maxSubstring = minLength;
            boolean condition = true;
            while (maxSubstring > 0 && condition) {
                int lengthDifference = minLength - maxSubstring;
                for (int i = 0; i <= lengthDifference; i++) {
                    if (bigger.contains(smaller.substring(i, i + maxSubstring))) {
                        condition = false;
                        maxSubstring++;
                        break;
                    }
                }
                maxSubstring--;
            }
            System.out.println(maxSubstring);
        }
        out.close();
    }
}
package com.digitalinnovationone.ProblemasBasicosJAVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class SimpleMultiplication {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstNumber = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int secondNumber = Integer.parseInt(st.nextToken());
        int total = firstNumber * secondNumber;
        System.out.println("PROD = " + total);
    }
}
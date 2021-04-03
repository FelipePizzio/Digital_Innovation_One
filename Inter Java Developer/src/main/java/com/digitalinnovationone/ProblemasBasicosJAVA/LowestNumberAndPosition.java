package com.digitalinnovationone.ProblemasBasicosJAVA;

import java.util.Scanner;

public class LowestNumberAndPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();
        int[] vectorNumbers = new int[totalNumbers];
        int lowestNumber = 0, positionLowestNumber = 0;
        for (int i = 0; i < totalNumbers; i++) {
            vectorNumbers[i] = sc.nextInt();
            if (i == 0) {
                lowestNumber = vectorNumbers[i];
                positionLowestNumber = i;
            } else if (vectorNumbers[i] < lowestNumber) {
                lowestNumber = vectorNumbers[i];
                positionLowestNumber = i;
            }
        }
        System.out.println("Menor valor: " + lowestNumber);
        System.out.println("Posicao: " + positionLowestNumber);
    }
}

/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

Entrada
    O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
    Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
 
Exemplo de Entrada 	Exemplo de Saída

8                       1
                        3
                        5
                        7
*/

package com.digitalinnovationone.ProblemasBasicosJAVA;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}

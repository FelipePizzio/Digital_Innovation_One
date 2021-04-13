/*
Desafio
    Desenvolva um código que leia um valor E. Este E será o tamanho de um vetor X[E]. 
    A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua posição dentro do vetor, mostrando esta informação.
    
Entrada
    A primeira linha de entrada contem um único inteiro E (1 < E < 1000), 
    indicando o número de elementos que deverão ser lidos em seguida para o vetor X[E] de inteiros. 
    A segunda linha contém cada um dos E valores, separados por um espaço.
    
Saída
    A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e do menor valor lido na entrada. 
    A segunda linha apresenta a mensagem “Posicao:” seguido de um espaço e da posição do vetor na qual se encontra o menor valor lido, 
    lembrando que o vetor inicia na posição zero.
 
Exemplo de Entrada 	        Exemplo de Saída

10                          Menor valor: -5
1 2 3 4 -5 6 7 8 9 10       Posição: 4
*/

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

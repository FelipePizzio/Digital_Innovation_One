/*
Desafio
    Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. 
    Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).   

Entrada
    A entrada contém 2 valores inteiros.

Saída
    Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.
 
Exemplos de Entrada 	Exemplos de Saída

3                       PROD = 27
9

-30                     PROD = -300
10

0                       PROD = 0
9
*/
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

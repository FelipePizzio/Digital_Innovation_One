/*
Desafio
    Encontre a maior substring comum entre as duas strings informadas. 
    A substring pode ser qualquer parte da string, inclusive ela toda. 
    Se não houver subseqüência comum, a saída deve ser “0”. A comparação é case sensitive ('x' != 'X').

Entrada
    A entrada contém vários casos de teste. 
    Cada caso de teste é composto por duas linhas, cada uma contendo uma string. 
    Ambas strings de entrada contém entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').

Saída
    O tamanho da maior subsequência comum entre as duas Strings.
 
Exemplo de Entrada 	    Exemplo de Saída

abcdef                      2
cdofhij
                        
TWO                         1
FOUR

abracadabra                 0
open

Hey This java is hot        7
Java is a new paradigm
*/

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

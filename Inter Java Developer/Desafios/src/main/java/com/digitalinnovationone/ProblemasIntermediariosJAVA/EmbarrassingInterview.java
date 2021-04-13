/*
Desafio
    A nutricionista Juliana Alcantra é uma excelente profissional de sua área. 
    Em determinado dia, ela foi entrevistada ao vivo para um jornal da cidade. 
    No entanto, ficou um pouco nervosa na hora, e diante da situação, sua fala ficou um pouco distorcida, repetindo o final de cada palavra após dizer a mesma. 
    Para que isso não aconteça novamente, ela precisa da sua ajuda para escrever um programa que omita a parte repetida, 
    de modo que as palavras sejam pronunciadas como deveriam ser.
    
    Escreva um programa que, dada uma palavra errada, a mesma seja corrigida.

Entrada
    Haverá diversos casos de teste. Cada caso de teste é formado por uma palavra, de, no máximo, 30 caracteres, dita da forma errada. 
    A entrada termina com fim de arquivo.

Saída
    Para cada caso de teste, escreva a palavra devidamente corrigida. Analise os exemplos para verificar o padrão, de modo a consertar todos os casos.
 
Exemplo de Entrada 	    Exemplo de Saída

sanduicheiche           sanduiche

barrilarril             barril

ratoato                 rato

sol                     sol

coliseueu               coliseu

queijoijo               queijo

astroastro              astro

a                       a
*/

package com.digitalinnovationone.ProblemasIntermediariosJAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EmbarrassingInterview {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String prefix, suffix, word = st.nextToken();

        while (word != null) {
            int indexMax = 0;
            for (int i = 0; i < word.length() / 2; i++) {
                prefix = word.substring(0, (word.length() + 1) / 2 + i);
                suffix = word.substring(prefix.length());

                if (prefix.endsWith(suffix)) {
                    indexMax = prefix.length();
                    System.out.println(word.substring(0, indexMax));
                }
            }
            if (indexMax == 0) {
                System.out.println(word);
            }
            word = br.readLine();
        }
    }
}

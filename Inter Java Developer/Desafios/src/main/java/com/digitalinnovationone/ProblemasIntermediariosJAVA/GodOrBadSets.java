/*
Desafio
    Nesse algoritmo você deverá descobrir se um conjunto de palavras é bom ou ruim. 
    Por definição, um conjunto é bom quando nenhuma palavra desse conjunto é um prefixo de outra palavra. Caso contrário, é considerado um conjunto ruim.
    Por exemplo, {dbc, dae, dbcde} é um conjunto ruim, pois dbc é um prefixo de dbcde. 
    Quando duas palavras são idênticas, definimos como uma sendo prefixo da outra.

Entrada
    A entrada contém vários casos de teste. 
    A primeira linha de cada caso de teste terá um inteiro N (1 ≤ N ≤ 10⁵), que representa a quantidade de palavras no conjunto. 
    Segue então N linhas, cada uma tendo uma palavra de no máximo 100 letras minúsculas. A entrada termina quando N = 0 e não deve ser processada.

Saída
    Para cada caso de teste, você deverá imprimir "Conjunto Bom", ou "Conjunto Ruim", conforme explicado acima.
 
Exemplo de Entrada 	    Exemplo de Saída

3                       Conjunto Ruim
abc
dae
abcde

2                       Conjunto Bom
abc
def

0
*/

package com.digitalinnovationone.ProblemasIntermediariosJAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class GodOrBadSets {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<String> wordsSet = new ArrayList<>();
        String input = st.nextToken();

        while (!input.equals("0")) {
            try {
                Integer.parseInt(input);
                if (!wordsSet.isEmpty()) {
                    searchPrefix(wordsSet);
                    wordsSet.clear();
                }
            } catch (Exception ex) {
                wordsSet.add(input);
            }
            input = br.readLine();
        }
        searchPrefix(wordsSet);
    }

    public static void searchPrefix(ArrayList<String> wordsSet) {
        int i = 0;
        for (String prefix : wordsSet) {
            for (String word : wordsSet) {
                if (word.indexOf(prefix) == 0) {
                    i++;
                }
            }
            if (i > 1) {
                System.out.println("Conjunto Ruim");
                return;
            }
            i = 0;
        }
        System.out.println("Conjunto Bom");
    }
}

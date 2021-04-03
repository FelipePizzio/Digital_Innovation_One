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
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

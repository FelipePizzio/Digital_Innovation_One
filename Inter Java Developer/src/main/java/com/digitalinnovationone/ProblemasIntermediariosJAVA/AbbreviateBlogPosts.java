package com.digitalinnovationone.ProblemasIntermediariosJAVA;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.*;

public class AbbreviateBlogPosts {
    public static void main(String[] args) {
        List<String> alphabet = new ArrayList<>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
        Scanner sc = new Scanner(System.in,"ISO_8859_1");

        while(true) {
            String phrase = sc.nextLine()
                    .trim()
                    .toLowerCase()
                    .replaceAll("\n", " ")
                    .replaceAll("\t", " ");
            if(phrase.equals(".")) break;
            if(phrase.length() <= 0) continue;

            List<String> vectorWordsPhrase = new ArrayList<>(Arrays.asList(phrase.split(" ")));
            Map<String, String> dictionary = new HashMap<>();
            alphabet.forEach(letter -> {
                dictionary.put(letter, "");
            });
            Map<String, Map<String, Integer>> repeatedWord = new HashMap<>();
            alphabet.forEach(letter -> {
                repeatedWord.put(letter, new HashMap<>());
            });
            vectorWordsPhrase.forEach(word -> {
                repeatedWord.get(word.substring(0, 1)).put(word, 0);
            });
            vectorWordsPhrase.forEach(word -> {

                int quantity = repeatedWord.get(word.substring(0, 1)).get(word);
                quantity++;
                repeatedWord.get(word.substring(0, 1)).put(word, quantity);
            });

            alphabet.forEach(letter -> {
                Map<String, Integer> map = repeatedWord.get(letter);
                List<String> keys = new ArrayList<>(map.keySet());

                int totalCharactersLetter = 0;

                for (String key : keys) {
                    totalCharactersLetter += map.get(key) * key.length();
                }

                int totalCharactersBetterSet;
                int totalCharactersBetterSetAux = 10000;

                for (String key : keys) {
                    totalCharactersBetterSet = (totalCharactersLetter - (map.get(key) * key.length())) + (map.get(key) * 2);

                    if((totalCharactersBetterSetAux > totalCharactersBetterSet) && key.length() > 2) {
                        totalCharactersBetterSetAux = totalCharactersBetterSet;
                        dictionary.put(letter, key);
                    }
                }
            });

            String abbreviatedPhrase = vectorWordsPhrase
                    .stream()
                    .map(word -> {
                        String firstLetter = word.substring(0, 1);
                        return dictionary.get(firstLetter).equals(word) ? firstLetter + "." : word;
                    }).collect(Collectors.joining(" "));
            System.out.println(abbreviatedPhrase);
            int totalAbbreviation = 0;

            for(String letter : alphabet) {
                if(!dictionary.get(letter).equals("")) {
                    totalAbbreviation++;
                }
            }
            System.out.println(totalAbbreviation);
            alphabet.forEach(letter -> {

                if(!dictionary.get(letter).equals("")) {
                    System.out.println(letter + ". = " + dictionary.get(letter) );
                }
            });
        }
    }
}
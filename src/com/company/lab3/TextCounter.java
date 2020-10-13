package com.company.lab3;

import java.util.*;

public class TextCounter {
    private String text;

        public TextCounter (String text){
            this.text = text;
        }

        public int getSentenceCount() {
            return text.split("[.?!]+").length;
        }

        public int getWordCount() {
            return text.split("[ ,;:().]+").length;
        }

        public int getConsonantsCount() {
            String consonants = "qwrtpsdfghjklzxcvbnm";
            int consonantsCount = 0;
            for (int i = 0; i < text.length(); i++) {
                if (consonants.contains(Character.toString(text.charAt(i)))) {
                    consonantsCount++;
                }
            }
            return consonantsCount;
        }

        public int getVowelsCount() {
            String vowels = "euioa";
            int vowelsCount = 0;
            for (int i = 0; i < text.length(); i++) {
                if (vowels.contains(Character.toString(text.charAt(i)))) {
                    vowelsCount++;
                }
            }
            return vowelsCount;
        }

        public int getLetterCount(){
            return getVowelsCount() + getConsonantsCount();
        }

        public void printTop5Words() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<String> arrayList = new ArrayList(Arrays.asList(text.split(" ")));
        for (int i = 0; i < 5; i++) {
            int maxValue = 0;

            for (String word : arrayList) {
                Integer numberOfOccurrences = map.get(word);
                if (numberOfOccurrences == null) {
                    numberOfOccurrences = 1;
                } else {
                    numberOfOccurrences = ++numberOfOccurrences;
                }
                map.put(word, numberOfOccurrences);
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                int value = entry.getValue();
                if (value > maxValue) {
                    maxValue = value;
                }
            }

            String key = getKeyFromValue(map, maxValue);
            System.out.println(" Top " + i + " = " + key);
            map.remove(key);
            arrayList.removeAll(Collections.singleton(key));
        }
    }

    public String getKeyFromValue(Map<String, Integer> hashMap, Integer value) {
        for (String word : hashMap.keySet()) {
            if (hashMap.get(word).equals(value)) {
                return word;
            }
        }
        return null;
    }
/*
    public void getMostUsedWord() {
        HashMap<Integer, String> hashWords = new HashMap<Integer, String>();
        String[] wordArray = text.split(" ");
        ArrayList<String> wordArray = new ArrayList(Arrays.asList(text.split(" ")));
        for (int i = 0; i < 5; i++) {
            String mostUsedWord = "";
            int wordOccurrence = 0;
            for (String wordString : wordArray) {
                if (hashWords.containsKey(wordString)) {
                    hashWords.put(wordOccurrence++, wordString);
                } else {
                    hashWords.put(1, wordString);
                }
            }
            Set<Map.Entry<Integer, String>> set = hashWords.entrySet();
            for (Map.Entry<Integer, String> mapEntry : set) {
                if (mapEntry.getKey() > wordOccurrence) {
                    wordOccurrence = mapEntry.getKey();
                    mostUsedWord = mapEntry.getValue();
                    System.out.println(" get value" + mapEntry.getValue());
                    System.out.println(" get key" + mapEntry.getKey());
                }
            }
            System.out.println("TOP " + i + " Word is " + mostUsedWord + " bla " + wordOccurrence);
            wordArray.removeAll(Collections.singleton(mostUsedWord));
        }
    }
    */




}



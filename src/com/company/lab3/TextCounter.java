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
        public List<String> topKFrequent(String text, int k) {
            // get rif of all the punctuations
            text = text.replaceAll("\\p{Punct}", "");
            // switch to lowercase in order not to omit the words starting with a capital letter
            text = text.toLowerCase();
            String[] words = text.split("\\s+");

            // initialize map in order to get the frequencies
            Map<String, Integer> map = new HashMap<String, Integer>();
            for (String s : words) {
                // if word is not there we default to 0 and add 1
                map.put(s, map.getOrDefault(s, 0) + 1);
            }

            // Initialize priority queue and comparator
            PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
                @Override
                public int compare(String word1, String word2) {
                    int frequency1 = map.get(word1);
                    int frequency2 = map.get(word2);
                    // if frequencies are the same we go by greater alphabetical order
                    if (frequency1 == frequency2)
                        return word2.compareTo(word1);
                    // else sort strings by lesser frequencies
                    return frequency1 - frequency2;
                }
            });

            // loop over our entries
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                // add entry to pq
                pq.add(entry.getKey());
                if (pq.size() > k)
                    pq.poll();
            }

            List<String> topK = new ArrayList<>();
            while (!pq.isEmpty())
                topK.add(pq.poll());

            // reverse back to order
            Collections.reverse(topK);
            System.out.println("Top 5 words: " + topK);
            return topK;
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



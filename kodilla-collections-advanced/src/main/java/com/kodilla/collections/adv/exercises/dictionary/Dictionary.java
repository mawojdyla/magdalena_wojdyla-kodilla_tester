package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {       // przechowuje wpisy słownika w mapie
    // Kluczami będą polskie słowa, a wartościami – listy odpowiadających im słów angielskich

    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {   // dodaje jeden wpis do słownika
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return dictionary.getOrDefault(polishWord, Collections.emptyList());
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishword : dictionary.getOrDefault(polishWord, Collections.emptyList())) {
            if (englishword.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishword);
        }
        return result;
    }

    // "EnglishWord englishword :" iteruje przez wszystkie obiekty EnglishWord

    public int size() {
        return dictionary.size();
    }

}

/*
dwie metody o nazwie findEnglishWords, różniące się argumentami (mówimy w takiej sytuacji
o tzw. metodach przeciążonych – ang. overload – czyli metodach o tej samej nazwie,
lecz różniących się listą argumentów wywołania)

metoda getOrDefault z interfejsu Map, która zwraca podaną jako argument wartość domyślną,
 gdy mapa nie zawiera szukanego przez nas wpisu). Do tej listy (dotychczas istniejących w mapie słów angielskich
  lub nowej pustej listy) dodawany jest nasz wpis. Następnie wpis ten jest wstawiany do mapy

 List<EnglishWord> result: Deklaracja zmiennej result, która przechowuje listę wynikową.
new ArrayList<>(): Tworzenie nowej, pustej listy, która będzie zawierała obiekty EnglishWord spełniające kryteria wyszukiwania.

 */

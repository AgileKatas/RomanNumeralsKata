package uk.co.agilekatas.katas.romannumals;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class RomanNumerals {

    private SortedMap<Integer, String> numberToNumerals;

    public RomanNumerals() {
        numberToNumerals = new TreeMap<>(Comparator.<Integer>reverseOrder());
        numberToNumerals.put(900, "CM");
        numberToNumerals.put(500, "D");
        numberToNumerals.put(400, "CD");
        numberToNumerals.put(100, "C");
        numberToNumerals.put(90, "XC");
        numberToNumerals.put(50, "L");
        numberToNumerals.put(40, "XL");
        numberToNumerals.put(10, "X");
        numberToNumerals.put(9, "IX");
        numberToNumerals.put(5, "V");
        numberToNumerals.put(4, "IV");
        numberToNumerals.put(1, "I");
    }

    public String toNumeral(int number) {
        String numeral = "";
        for (Entry<Integer, String> numberToNumeral : numberToNumerals.entrySet()) {
            while (number >= numberToNumeral.getKey()) {
                numeral += numberToNumeral.getValue();
                number -= numberToNumeral.getKey();
            }
        }
        return numeral;
    }

}

package uk.co.agilekatas.katas.romannumals;

public class RomanNumerals {

    public String toNumeral(int number) {
        String numeral = "";
        while (number > 0) {
            if (number >= 9) {
                numeral += "IX";
                number -= 9;
            } else if (number >= 5) {
                numeral += "V";
                number -= 5;
            } else if (number >= 4) {
                numeral += "IV";
                number -= 4;
            } else if (number >= 1) {
                numeral += "I";
                number--;
            }
        }
        return numeral;
    }

}

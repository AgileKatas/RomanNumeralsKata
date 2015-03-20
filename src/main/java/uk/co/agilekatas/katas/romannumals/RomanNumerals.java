package uk.co.agilekatas.katas.romannumals;

public class RomanNumerals {

   public String toNumeral(int number) {
       String numeral = "";
       while (number > 0) {
           numeral += "I";
           number--;
       }
       return numeral;
   }

}

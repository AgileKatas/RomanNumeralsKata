package uk.co.agilekatas.katas.romannumals;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void shouldReturnCorrectNumeralForOne() {
        String numeral = romanNumerals.toNumeral(1);
        assertThat(numeral).isEqualTo("I");
    }

    @Test
    public void shouldReturnCorrectNumeralForTwo() {
        String numeral = romanNumerals.toNumeral(2);
        assertThat(numeral).isEqualTo("II");
    }

    @Test
    public void shouldReturnCorrectNumeralForFour() {
        String numeral = romanNumerals.toNumeral(4);
        assertThat(numeral).isEqualTo("IV");
    }

    @Test
    public void shouldReturnCorrectNumeralForFive() {
        String numeral = romanNumerals.toNumeral(5);
        assertThat(numeral).isEqualTo("V");
    }

    @Test
    public void shouldReturnCorrectNumeralForNine() {
        String numeral = romanNumerals.toNumeral(9);
        assertThat(numeral).isEqualTo("IX");
    }

    @Test
    public void shouldReturnCorrectNumeralForTen() {
        String numeral = romanNumerals.toNumeral(10);
        assertThat(numeral).isEqualTo("X");
    }
}

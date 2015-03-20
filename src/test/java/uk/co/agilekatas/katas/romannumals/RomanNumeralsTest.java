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

}

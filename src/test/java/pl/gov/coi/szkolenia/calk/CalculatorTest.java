package pl.gov.coi.szkolenia.calk;

import pl.gov.coi.szkolenie.calk.Calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testMnoz() {

        int a = 4;
        int b = 0;

        Calculator calc = new Calculator();

        int result = calc.mnoz(a, b);

        assertEquals(0, result);
    }

    @Test
    public void testMnozJeden() {

        int a = 4;
        int b = 1;
        int c = 4;
        int d = 8;

        Calculator calc = new Calculator();

        int result = calc.mnoz(a, b);

        assertEquals(4, result);
    }

    @Test
    public void testSubstract(){
        Calculator calc = new Calculator();
        assertEquals(1,calc.substract(2,1));
    }

    @Test
    public void testDzielenie(){
        Calculator calc = new Calculator();
        assertEquals(2,calc.dzielenie(8,4));
    }
}
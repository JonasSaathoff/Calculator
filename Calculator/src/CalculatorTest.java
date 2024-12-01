package main;
import main.Calculator;
import org.junit.jupiter.api.Test;

import java.awt.event.ActionEvent;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        calculator.num1 = 5.0;
        calculator.num2 = 3.0;
        calculator.operator = '+';

        calculator.actionPerformed(null); // Simuliert den "=" Button

        assertEquals(8.0, calculator.result, "5 + 3 sollte 8 ergeben");
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        calculator.num1 = 10.0;
        calculator.num2 = 4.0;
        calculator.operator = '-';

        calculator.actionPerformed(null);

        assertEquals(6.0, calculator.result, "10 - 4 sollte 6 ergeben");
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        calculator.num1 = 7.0;
        calculator.num2 = 6.0;
        calculator.operator = '*';

        calculator.actionPerformed(null);

        assertEquals(42.0, calculator.result, "7 * 6 sollte 42 ergeben");
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        calculator.num1 = 9.0;
        calculator.num2 = 3.0;
        calculator.operator = '/';

        calculator.actionPerformed(null);

        assertEquals(3.0, calculator.result, "9 / 3 sollte 3 ergeben");
    }

    @Test
    void testClear() {
        Calculator calculator = new Calculator();
        calculator.textField.setText("123");
        calculator.actionPerformed(new ActionEvent(calculator.clrButton, ActionEvent.ACTION_PERFORMED, null));

        assertEquals("", calculator.textField.getText(), "Nach dem Drücken von CLR sollte das Textfeld leer sein");
    }
}
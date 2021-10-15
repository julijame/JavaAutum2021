package sef.FinalActivity;

import junit.framework.TestCase;


public class CalculatorTest extends TestCase {
    private Calculator calc;

    protected void setUp() throws Exception {
        super.setUp();
        calc = new Calculator();
    }

    public void testFAdd() {

        int a = 1;
        int b = 2;
        //	Checks the sum of two (2) positive values
        assertEquals(3, (calc.fAdd(a, b)));
        assertEquals(3, (calc.fAdd(b, a)));

        a = -1;
        b = 2;
        //	Checks the sum of a positive value and a negative value
        assertEquals(1, (calc.fAdd(a, b)));
        assertEquals(1, (calc.fAdd(b, a)));

        a = -1;
        b = -2;
        //	Checks the sum of two (2) negative values
        assertEquals(-3, (calc.fAdd(a, b)));
        assertEquals(-3, (calc.fAdd(b, a)));
    }

    public void testFSubstract() {

        int a = 3;
        int b = 2;
        //	Checks if b is lesser than a
        assertEquals(1, (calc.fSubtract(a, b)));
        //	Checks if b is greater than a
        assertEquals(-1, (calc.fSubtract(b, a)));

        a = 5;
        b = -4;
        //	Checks if negative value is subtracted from positive value
        assertEquals(9, (calc.fSubtract(a, b)));
        //	Checks if positive value is subtracted from negative value
        assertEquals(-9, (calc.fSubtract(b, a)));

        a = -10;
        b = -5;
        //	Checks if negative value is subtracted from negative value: a > b
        assertEquals(-5, (calc.fSubtract(a, b)));
        //	Checks if negative value is subtracted from negative value: b < a
        assertEquals(5, (calc.fSubtract(b, a)));
    }

    public void testFMultiply() {

        double a = 5;
        double b = 10;
        //	Checks the product of two (2) positive values
        assertEquals(50, (calc.fMultiply(a, b)), 0);
        assertEquals(50, (calc.fMultiply(b, a)), 0);

        a = -5;
        b = 10;
        //	Checks the product of a postive value and a negative value
        assertEquals(-50, (calc.fMultiply(a, b)), 0);
        assertEquals(-50, (calc.fMultiply(b, a)), 0);

        a = -3;
        b = -10;
        //	Checks the product of two (2) negative values
        assertEquals(30, (calc.fMultiply(a, b)), 0);
        assertEquals(30, (calc.fMultiply(b, a)), 0);
    }

    public void testFDivide() {

        double a = 10;
        double b = 5;
        //	Checks if b is lesser than a
        assertEquals(2, (calc.fDivide(a, b)), 0);
        //	Checks if b is greater than a
        assertEquals(0.5, (calc.fDivide(b, a)), 0);

        a = 9;
        b = -3;
        //	Checks if positive value is divided with negative value
        assertEquals(-3, (calc.fDivide(a, b)), 0);
        //	Checks if negative value is divided with positive value
        assertEquals(-0.33, (calc.fDivide(b, a)), 0.007);

        a = -10;
        b = -5;
        //	Checks if negative value is divided with negative value: a > b
        assertEquals(2, (calc.fDivide(a, b)), 0);
        //	Checks if negative value is divided with negative value: b < a
        assertEquals(0.5, (calc.fDivide(b, a)), 0);

        a = 0;
        b = 10;
        // Checks if division or zero gets zero
        assertEquals(0.0, (calc.fDivide(a, b)));

    }

    public void testThrowException() {

        try {

            calc.fAdd(2, 1);
            calc.fSubtract(3, 3);
            calc.fMultiply(0, 1);
            calc.fDivide(1, 3);
            new Calculator();

        } catch (Exception e) {
            fail();
        } catch (Error e) {
            fail();
        }


    }
}

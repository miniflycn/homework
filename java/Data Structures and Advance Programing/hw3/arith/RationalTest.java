package arith;

import org.junit.Test;
import static org.junit.Assert.*;

import static arith.Rational.*;

/** Unit tests for class Rational.
 *  @author
 */
public class RationalTest {

    /* Run the unit tests in this file. */
    public static void main(String... args) {
        System.exit(ucb.junit.textui.runClasses(RationalTest.class));
    }

    @Test public void frac1() {
        Rational r = frac(36, 48);
        assertEquals("numer() should be in lowest terms",
                     3, r.numer());
        assertEquals("denom() should be in lowest terms",
                     4, r.denom());
    }

    @Test public void frac2() {
        Rational r = frac(0, 20);
        assertTrue("0 should be 0/1", r.numer() == 0 && r.denom() == 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void frac3() {
        frac(3, 0);
    }
    
    @Test public void equals() {
    	Rational r = frac(10);
    	assertTrue("10 should equal 10", r.equals(frac(10)));
    }
    
    @Test public void multiply() {
    	Rational r = frac(1, 2),
    			 i = frac(4, 2);
    	assertTrue("1/2 * 4/2 should be 1", r.multiply(i).equals(frac(1)));
    }
    
    @Test public void divide() {
    	Rational r = frac(3),
    			 i = frac(6);
    	assertTrue("3 / 6 should be 1/2", r.divide(i).equals(frac(1, 2)));
    }
    
    @Test public void add() {
    	Rational r = frac(1, 2),
    			 i = frac(1, 4);
    	assertTrue("1/2 + 1/4 should be 3/4", r.add(i).equals(frac(3, 4)));
    }
    
    @Test public void subtract() {
    	Rational r = frac(1, 2),
    			 i = frac(1, 4);
    	assertTrue("1/2 - 1/4 should be 1/4", r.subtract(i).equals(frac(1, 4)));
    }
}




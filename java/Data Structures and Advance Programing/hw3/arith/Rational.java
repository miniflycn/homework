package arith;

/** A rational number.  Members of this class, like the Integer and Double
 *  wrapper classes, are immutable.  Operations create new Rational objects
 *  rather than modifying existing ones.
 *  @author
 */
public class Rational {
    // WARNING! Currently, this class is incomplete and has at least one
    // bug.

    /** Return the rational number NUM/DEN, where DEN is non-zero. */
    public static Rational frac(long num, long den) {
        if (den == 0) {
        	throw new IllegalArgumentException();
        } else if (num == 0) {
            return new Rational(0, 1);
        } else {
            long d = gcd(num, den);
            return new Rational(num / d, den / d);
        }
    }

    /** Returns the rational number X. */
    public static Rational frac(long x) {
        return frac(x, 1);
    }

    /** Returns the rational number denoted by VAL, which must be of the form
     *  NUM/DEN, +NUM/DEN, -NUM/DEN, +NUM, or -NUM for NUM and DEN
     *  integer numerals and DEN a non-zero integer numeral. */
    public static Rational frac(String val) {
        if (val.indexOf("/") > 0) {
            String[] array = new String[2];
            array = val.split("/");
            return frac(Long.parseLong(array[0]), Long.parseLong(array[1]));
        } else {
            return frac(Long.parseLong(val));
        }
    }

    /** Returns the value N, where THIS, in lowest terms, is N/D, and D>0. */
    public long numer() {
        return _num;
    }

    /** Returns the value D, where THIS, in lowest terms, is N/D, and D>0. If N
     *  is 0, returns 1. */
    public long denom() {
        return _den;
    }

    /** Returns my representation as a String.  Returns a String of the form
     *  N/D or -N/D, where N/D is a fraction in lowest terms, leaving off /D
     *  when D is 1. */
    public String toString() {
        if (_den == 1) {
            return String.format("%d", _num);
        } else {
            return String.format("%d/%d", _num, _den);
        }
    }
    
    public double valueOf() {
    	return numer() / denom();
    }

    /** I represent NUM/DEN, which are kept in lowest terms. */
    private final long _num, _den;

    /** A new Rational number whose value is NUM/DEN. */
    private Rational(long num, long den) {
        _num = num;
        _den = den;
    }

    /** Returns the positive greatest common divisor (X,Y) if X!=0 or
     *  Y!=0, or 0 if both X and Y are 0.  (X,Y) is defined as the
     *  largest positive integer that divides both X and Y. */
    private static long gcd(long x, long y) {
        x = Math.abs(x);
        y = Math.abs(y);
        if (x > y) {
            x %= y;
        }
        while (x != 0) {
            long t = x;
            x = y % x;
            y = t;
        }
        return y;
    }
    
    public int compareTo(Rational x) {
    	Rational p = subtract(x);
    	long k = p.numer() * p.denom();
    	if (k < 0) {
    		return -1;
    	} else if (k == 0) {
    		return 0;
    	} else {
    		return 1;
    	}
    }
    
    public boolean equals(Rational x) {
    	if (denom() == x.denom() && numer() == x.numer()) {
    		return true;
    	}
    	return false;
    }
    
    public Rational multiply(Rational x) {
    	long a = denom(),
       		 b = x.denom(),
       		 d = numer(),
       		 e = x.numer(),
       		 f = a * b,
       		 g = d * e;
    	return frac(g, f);
    }
    
    public Rational divide(Rational x) {
    	long a = denom(),
    		 b = x.denom(),
    		 d = numer(),
    		 e = x.numer(),
    		 f = a * e,
    		 g = d * b;
    	return frac(g, f);
    }
    
    public Rational add(Rational x) {
    	long a = denom(),
    		 b = x.denom(),
    		 d = numer(),
    		 e = x.numer(),
    		 f = a * b,
    		 g = (d * b) + (e * a);
    	return frac(g, f);
    }
    
    public Rational subtract(Rational x) {
    	long a = denom(),
    		 b = x.denom(),
    		 d = numer(),
    		 e = x.numer(),
    		 f = a * b,
    		 g = (d * b) - (e * a);
    	return frac(g, f);
    }
}

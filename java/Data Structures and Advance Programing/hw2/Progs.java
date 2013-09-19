/** HW #1 solutions.
 *
 *  @Daniel Yang
 */
class Progs {

    /* 1a. */
    /** Returns the sum of all integers, k, such that 1 <= k < N and
     *  N is evenly divisible by k. */
    static int factorSum(int N) {
        int k = 1, 
            sum = 0, 
            len = (int) Math.floor(N / 2);
        for (; k <= len; k++) {
            if (N % k == 0) {
                sum += k;
            }
        }
        return sum;
    }

    /* 1b. */
    /** Print the set of all sociable pairs whose members are all
     *  between 1 and N>=0 (inclusive) on the standard output (one pair per
     *  line, smallest member of each pair first, with no repetitions). */
    static void printSociablePairs(int N) {
        int i = 1,
            j;
        for (; i <= N; i++) {
            j = factorSum(i);
            if (i == factorSum(j) && i < j) System.out.println(i + ", " +j);
        }
    }

    /* 2a. */
    /** Returns a list consisting of the elements of A followed by the
     *  elements of B.  May modify items of A. Don't use 'new'. */
    static IntList dcatenate(IntList A, IntList B) {
        IntList p = A;
        for (; p.tail != null;) {
            p = p.tail;
        }
        p.tail = B;
        return A;
    }

    /* 2b. */
    /** Returns the sublist consisting of LEN items from list L,
     *  beginning with item #START (where the first item is #0).
     *  Does not modify the original list elements.
     *  It is an error if the desired items don't exist. */
    static IntList sublist(IntList L, int start, int len) {
        IntList p,
                j,
                k;
        for (p = L; start > 0; start--) {
            p = p.tail;
        }
        k = j = new IntList(p.head, null);
        for (len--; len > 0; len--) {
            p = p.tail;
            j.tail = new IntList(p.head, null);
            j = j.tail;
        }
        return k;
    }

    /* 2c. */
    /** Returns the sublist consisting of LEN items from list L,
     *  beginning with item #START (where the first item is #0).
     *  May modify the original list elements. Don't use 'new'.
     *  It is an error if the desired items don't exist. */
    static IntList dsublist(IntList L, int start, int len) {
        IntList p = L,
                j;
        for (; start > 0; start--) {
            p = p.tail;
        }
        j = p;
        for (len--; len > 0; len--) {
            j = j.tail;
        }
        j.tail = null;
        return p;
    }

}

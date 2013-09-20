/* NOTE: The file Utils.java contains some functions that may be useful
 * in testing your answers. */

/** HW #2, Problem #1. */

/** List problem.
 *  @Daniel Yang
 */
class Lists {
    /** Return the list of lists formed by breaking up L into "natural runs":
     *  that is, maximal ascending sublists, in the same order as
     *  the original.  For example, if L is (1, 3, 7, 5, 4, 6, 9, 10),
     *  then result is the three-item list ((1, 3, 7), (5), (4, 6, 9, 10)).
     *  Destructive: creates no new IntList items, and may modify the
     *  original list pointed to by L. */
    static IntList2 naturalRuns(IntList L) {
        int i = L.head;
        IntList p, q;
        IntList2 k, j;
        p = q = L;
        k = j = new IntList2(L, null);
        for (; p.tail != null;) {
            if (i < p.tail.head) {
            	p = p.tail;
                i = p.head;
            } else {
            	q = p.tail;
            	p.tail = null;
            	p = q;
                i = p.head;
                j.tail = new IntList2(q, null);
                j = j.tail;
            }
        }
        return k;
    }
}

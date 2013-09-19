/** java HW1Test should test the methods defined in Progs.
 *  @author
 */
public class HW1Test {

    /** Run all tests. */
    public static void main(String[] args) {
        report("factorSum", testFactorSum());
        report("printSociablePairs", testPrintSociablePairs());
        report("dcatenate", testDcatenate());
        report("sublist", testSublist());
        report("dsublist", testDsublist());
    }

    /** Print message that test NAME has (if ISOK) or else has not
     *  passed. */
    private static void report(String name, boolean isOK) {
        if (isOK) {
            System.out.printf("%s OK.%n", name);
        } else {
            System.out.printf("%s FAILS.%n", name);
        }
    }

    // Replace the bodies of the functions below with something serious.

    /** Return true iff factorSum passes its tests. */
    private static boolean testFactorSum() {
        if (Progs.factorSum(220) == 284) return true;
        return false;
    }

    /** Return true iff printSociablePairs passes its tests. */
    private static boolean testPrintSociablePairs() {
        // Need to think about how to test
        return true;
    }

    /** Return true iff dcantenate passes its tests. */
    private static boolean testDcatenate() {
        IntList A = IntList.list(1, 2),
                B = IntList.list(3, 4);
        if (Progs.dcatenate(A, B).equals(IntList.list(1, 2, 3, 4))) {
            return true;
        }
        return false;
    }

    /** Return true iff sublist passes its tests. */
    private static boolean testSublist() {
        IntList L = IntList.list(1, 2, 3, 4, 5, 6);
        if (Progs.sublist(L, 1, 3).equals(IntList.list(2, 3, 4))) {
            return true;
        }
        return false;
    }

    /** Return true iff dsublist passes its tests. */
    private static boolean testDsublist() {
        IntList L = IntList.list(1, 2, 3, 4, 5, 6);
        if (Progs.dsublist(L, 1, 3).equals(IntList.list(2, 3, 4))) {
            return true;
        }
        return false;

    }

}

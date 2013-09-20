/** java HW2Test should test the methods defined in Lists and Arrays.
 *  @author
 */
public class HW2Test {

    /** Run all tests. */
    public static void main(String[] args) {
        report("naturalRuns", testNaturalRuns());
        report("catenate", testCatenate());
        report("remove", testRemove());
        report("naturalRuns", testNaturalRuns2());
    }

    private static void report(String name, boolean isOK) {
        if (isOK) {
            System.out.printf("%s OK.%n", name);
        } else {
            System.out.printf("%s FAILS.%n", name);
        }
    }

    private static boolean testNaturalRuns() {
    	int[][] r = new int[3][];
    	r[0] = new int[]{1, 3, 7};
    	r[1] = new int[]{5};
    	r[2] = new int[]{4, 6, 9, 10};
    	IntList2 p = Lists.naturalRuns(IntList.list(1, 3, 7, 5, 4, 6, 9, 10));
    	return p.equals(IntList2.list(r));
    }
    
    private static boolean testCatenate() {
    	int[] A = {1, 4, 5},
    		  B = {8, 6},
    		  C = {},
    		  D = {1, 4, 5, 8, 6};
    	return Utils.equals(Arrays.catenate(A, B), D) &&
    			Utils.equals(Arrays.catenate(A, C), A);
    }
    
    private static boolean testRemove() {
    	int[] A = {1, 2, 4, 6, 7, 9},
    		  B = {1, 2, 9};
    	return Utils.equals(Arrays.remove(A, 2, 3), B);
    }
    
    private static boolean testNaturalRuns2() {
    	int[] A = {1, 3, 7, 5, 4, 6, 9, 10},
    		  B = {};
    	int[][] C = new int[3][],
    			D = new int[0][];
    	C[0] = new int[]{1, 3, 7};
    	C[1] = new int[]{5};
    	C[2] = new int[]{4, 6, 9, 10};
    	return Utils.equals(Arrays.naturalRuns(A), C) && 
    			Utils.equals(Arrays.naturalRuns(B), D);
    }
}

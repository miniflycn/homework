/* NOTE: The file ArrayUtil.java contains some functions that may be useful
 * in testing your answers. */

/** HW #2, Problem #2. */

/** Array utilities.
 *  @Daniel Yang
 */
class Arrays {
    /* 2a. */
    /** Returns a new array consisting of the elements of A followed by the
     *  the elements of B. */
    static int[] catenate(int[] A, int[] B) {
    	/** 1  **/
    	int[] r = new int[A.length + B.length];
    	int i = 0;
    	for (; i < A.length; i++) {
    		r[i] = A[i];
    	}
    	for (; i < A.length + B.length; i++) {
    		r[i] = B[i - A.length];
    	}
    	return r;
    	/** 2
        int[] r = new int[A.length + B.length];
        System.arraycopy(A, 0, r, 0, A.length);
        System.arraycopy(B, 0, r, A.length, B.length);
        return r;
        **/
    }

    /* 2b. */
    /** Returns the array formed by removing LEN items from A,
     *  beginning with item #START. */
    static int[] remove(int[] A, int start, int len) {
        int i = 0;
        int[] r = new int[A.length - len];
    	for (; i < start; i++) {
        	r[i] = A[i]; 
        }
    	i += len;
    	for (; i < A.length; i++) {
    		r[i - len] = A[i];
    	}
        return r;
    }

    /* 2c. */
    /** Returns the array of arrays formed by breaking up A into
     *  maximal ascending lists, without reordering.
     *  For example, if A is {1, 3, 7, 5, 4, 6, 9, 10}, then
     *  returns the three-element array
     *  {{1, 3, 7}, {5}, {4, 6, 9, 10}}. */
    static int[][] naturalRuns(int[] A) {
    	if (A.length == 0) return new int[0][];
        int l = 1;
        int [][] r;
        int t = 0;
        for (int i = 1; i < A.length; i++) {
        	if (A[i] < A[i - 1]) l++;
        }
        r = new int[l][];
        l = 0;
        for (int i = 1; i < A.length; i++) {
        	if (A[i] < A[i - 1]) {
        		r[l++] = Utils.subarray(A, t, i - t);
        		t = i;
        	}
        }
        if (l != r.length) {
        	r[l] = Utils.subarray(A, t, A.length - t);
        }
        return r;
    }
}

# Homework Exercise
* Complete the following Java function so that it performs as indicated in its comment. The files IntList.java and IntList2.java in the template contain the declarations of the classes IntList and IntList2. Put your answers in a file called Lists.java, for which we've also provided a template. You may find the functions in the file Utils.java to be useful for testing.

```java
/** The list of lists formed by breaking up L into "natural runs":
 *  that is, maximal ascending sublists, in the same order as
 *  the original. For example, if L is (1, 3, 7, 5, 4, 6, 9, 10),
 *  the result is the three-item list ((1, 3, 7), (5), (4, 6, 9, 10)).
 *  Destructive: creates no new IntList items, and may modify the
 *  original list pointed to by L. */
static IntList2 naturalRuns (IntList L) {
	/** Fill in here **/
}
```

* Complete the following Java functions so that they perform as indicated in their comments. Remember that some arrays can have zero elements. Put your ansers to this problem (all parts) in a file named Arrays.java, for which we've provided a template. You may find the contents of the file Utils.java useful in testing your answers.

```java
/** A new array consisting of the elements of A followed by the
 *  the elements of B. */
static int[] catenate(int[] A, int[] B) {
	/** Fill in here **/
}

/** The array formed by removing LEN items from A,
 *  beginning with item #START (counts from 0). */
static int[] remove (int[] A, int start, int len) {
	/** Fill in here **/
}
```
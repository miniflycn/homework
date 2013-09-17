# Homework Exercises

* Complete the following Java functions so that they perform as indicated in their comments. You may add any additional auxiliary functions and definitions you want. Definitions: A sociable pair consists of two different positive integers such that the sum of all distinct divisors of either one of them is equal to the other. For example, 220 is evenly divisible by 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, and 110, which add to 284. 284 is divisible by 1, 2, 4, 71, and 142, which add up to 220.

```java
/** The sum of all integers, k, such that 1 <= k < N and
 *  N is evenly divisible by k. */
static int factorSum (int N) {
	/** Fill in here **/
}

/** Print the set of all sociable pairs whose members are all
 *  between 1 and N >= 0 (inclusive) on the standard output (one pair per
 *  line, smallest member of each pair first, with no repetitions). */
static void printSociablePairs (int N) {
		/** Fill in here **/
}
```

* Complete the following Java functions so that they perform as indicated in their comments. You may add any additional auxiliary functions and definitions you want.

```java
/** A list consisting of the elements of A followed by the
 *  the elements of B. May modify items of A.
 *  Don't use 'new'. */
static IntList dcatenate(IntList A, IntList B) {
	/** Fill in here **/
}

/** The sublist consisting of LEN items from list L,
 *  beginning with item #START (where the first item is #0).
 *  Does not modify the original list elements.
 *  It is an error if the desired items don't exist. */
static IntList sublist (Intlist L, int start, int len) {
	/** Fill in here **/
}

/** The sublist consisting of LEN items from list L,
 *  beginning with item #START (where the first item is #0).
 *  May modify the original list elements. Don't use 'new'.
 *  It is an error if the desired items don't exist. */
static IntList dsublist (IntList L, int start, int len) {
	/** Fill in here **/
}
```
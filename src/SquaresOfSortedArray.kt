import java.util.*

class SquaresOfSortedArray {
    /*
     * Solution 1:
        1). We can iterate through the array, replace each number with its square.
        2). Use Arrays.sort() to sort the array.
    */
    fun sortedSquares1(A: IntArray): IntArray {
        for (i in A.indices) {
            A[i] = A[i] * A[i]
        }
        Arrays.sort(A)
        return A
    }

    /*
     * Algorithm 2: Using two pointers approach
        The array that we get after calculating square root of each element could be:
        A). In increasing order, if all the elements in the original
            array are positive numbers.
        B). In decreasing order, if all the elements in the original
            array are negative numbers.
        C). In decreasing and than increasing, if the original array
            contains both positive and negative numbers.

        In the two pointers approach, we will find the points from where the array
            value starts increasing. After finding the points, we will iterate the
            array in both the directions and merge it to new array.

        'j' will initially have the count of negative numbers in the input Array.
            We will increment the count, while iterating and finding the square
            root. When the number is less than 0, we will increment 'j'.

        Let's say our input array is -3, -2, -1, 4, 5, 6. Then after finding
            the square it would be 9, 4, 1, 16, 26, 36. In thus case j will be 3.

        We will create output array outputA and start populating it.

        The first while loop will move square root of all the negative numbers
            from array A to outputA, but in sorted order.
        If the array has only 1 element, that too negative then this condition
            is handled in second while loop.
        Third while loop will move square root of all the positives numbers from array A to outputA.
    */
    fun sortedSquares(A: IntArray): IntArray {
        //initially have count of negative numbers
        var j = 0

        //find the square
        for (k in A.indices) {
            if (A[k] < 0) j++
            A[k] = A[k] * A[k]
        }
        var i = j - 1
        var s = 0
        val outputA = IntArray(A.size)

        while (i >= 0 && j <= A.size - 1) {
            if (A[i] < A[j]) {
                outputA[s] = A[i]
                i--
            } else {
                outputA[s] = A[j]
                j++
            }
            s++
        }
        while (i >= 0) {
            outputA[s] = A[i]
            i--
            s++
        }
        while (j <= A.size - 1) {
            outputA[s] = A[j]
            j++
            s++
        }
        return outputA
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val s = SquaresOfSortedArray()
            val A = intArrayOf(-3, -2, -1, 4, 5, 6)
            //int[] A= {-1};
            println(s.sortedSquares(A))
        }
    }
}

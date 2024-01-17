import kotlin.math.max

class MaxConsecutiveOnes {
    /*
     * Algorithm
        1). Declare two variables max and tempmax.
        2). Start iterating the array, if the current number is 1 increment tempmax.
        3). If we encounter 0, and tempmax is greater than max,
            we will assign tempmax to max.
        4). To improve the performance we can check if the max is greater than or
            equal to half of the array length, we will return max as there is
            no point in checking the array further.
        5). When we encounter 0, we will reset tempmax to 0.
        6). At the end we will return max or tempmax, whichever is greater.
     * */
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var tempmax = 0
        for (i in nums) {
            if (i == 1) tempmax++
            else {
                if (tempmax > max) max = tempmax
                if (max >= nums.size / 2) return max

                tempmax = 0
            }
        }
        return max(max.toDouble(), tempmax.toDouble()).toInt()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val nums = intArrayOf(1, 1, 0, 1, 1, 1)
            println(MaxConsecutiveOnes().findMaxConsecutiveOnes(nums))
        }
    }
}
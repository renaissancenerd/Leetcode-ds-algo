class FindEvenNumberOfDigits {
    /*
     * Algorithm
        1). We need to check the length of each number,
            if the length is even, increment the counter.
        2). To find the length we will convert each number
            into String by using Integer.toString() method.
        3). Then we will divide the length of converted String
            by 2, if the remainder is 0, it is even.
     * */
    fun findNumbers(nums: IntArray): Int {
        var count = 0
        if (nums.size != 0) {
            var strNum: String
            for (i in nums.indices) {
                strNum = nums[i].toString()
                if (strNum.length % 2 == 0) count++
            }
        }
        return count
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val find = FindEvenNumberOfDigits()
            val nums1 = intArrayOf(12, 345, 2, 6, 7896)
            println("In [12,345,2,6,7896], Numbers with Even Number of Digits is:" + find.findNumbers(nums1))

            val nums2 = intArrayOf(555, 901, 482, 1771)
            println("In [555,901,482,1771], Numbers with Even Number of Digits is:" + find.findNumbers(nums2))
        }
    }
}
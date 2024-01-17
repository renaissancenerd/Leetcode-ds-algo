/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 */
class SeachInsertPosition {
    fun Insert(nums: IntArray, low: Int, high: Int, target: Int): Int {
        if (low > high) return low

        val mid = (low + high) / 2
        return if (nums[mid] == target) {
            mid
        } else if (nums[mid] > target) {
            Insert(nums, low, mid - 1, target)
        } else {
            Insert(nums, mid + 1, high, target)
        }
    }

    fun searchInsert(nums: IntArray, target: Int): Int {
        return Insert(nums, 0, nums.size - 1, target)
    }
}

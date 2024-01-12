import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 *
 * Solution: time - O(NlogN)
 */



public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i< nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }

        }
        return false;
    }

    /**
     * solution 2
     * Time - O(N)
     * space - O(N)
     */
    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet();
        // iterate over nums array:
        for(int i = 0; i < nums.length; i++) {
            // get num from nums
            int num = nums[i];
            // check if num is already in HashSet, if true return true
            if(set.contains(num)) return true;
            // add num into HashSet
            set.add(num);
        }
        // return false if no duplicate found
        return false;
    }
}

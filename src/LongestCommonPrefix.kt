import java.util.*

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        Arrays.sort(strs)
        val s1 = strs[0]
        val s2 = strs[strs.size - 1]
        var idx = 0
        while (idx < s1.length && idx < s2.length) {
            if (s1[idx] == s2[idx]) {
                idx++
            } else {
                break
            }
        }
        return s1.substring(0, idx)
    }
}

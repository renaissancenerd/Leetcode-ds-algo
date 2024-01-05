import java.util.*

/**
 * Given two strings, write a method to check if one is a permutation of the other.
 *
 * Assumption: ASCII strings and case-sensitive
 */
class StringPermutation {
    fun sort(s: String): String {
        val content = s.toCharArray()
        Arrays.sort(content)
        return String(content)
    }

    fun permutation(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        return sort(s) == sort(t)
    }
}

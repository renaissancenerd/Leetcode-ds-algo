/**
 * Implement an algorithm to determine if a string has all unique characters. Do not use any additional data structures
 *
 * We will assume for the simplicity that the character set is ASCII. It could also be Unicode
 *
 *
 * Time complexity = O(N) where N is the length of the string
 * Space complexity = O(1)
 */
class StringHasAllUniqueChars {
    fun isUnique(str: String): Boolean {
        if (str.length > 256) return false

        val char_set = BooleanArray(256)
        for (i in 0 until str.length) {
            val `val` = str[i].code
            if (char_set[`val`]) { // already found the char in this string
                return false
            }
            char_set[`val`] = true
        }
        return true
    }
}

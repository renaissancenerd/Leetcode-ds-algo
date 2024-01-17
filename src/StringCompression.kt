/**
 * Implement a method to perform a basic string compression using the counts of repeated characters. For example, string aabcccaa would become a2b1c3a2
 * If the compressed string does not become smaller than the original string, return the original string
 */
class StringCompression {
    /**
     * Solution 1
     * we will use StringBuffer
     * Time complexity: O(N)
     * Space complexity: O(N)
     */
    fun compressBetter(str: String): String {
        /* check if compression would create a longer string */
        val size = countCompression(str)
        if (size >= str.length) {
            return str
        }

        val mystr = StringBuffer()
        var last = str[0]
        var count = 1
        for (i in 1 until str.length) {
            if (str[i] == last) { // found repeated character
                count++
            } else {
                // insert char count and update last character
                mystr.append(last) // insert char
                mystr.append(count) // insert count
                last = str[i]
                count = 1
            }
        }
        mystr.append(last)
        mystr.append(count)
        return mystr.toString()
    }

    fun countCompression(str: String?): Int {
        if (str == null || str.isEmpty()) return 0

        var last = str[0]
        var size = 0
        var count = 1
        for (i in 0 until str.length) {
            if (str[i] == last) {
                count++
            } else {
                last = str[i]
                size += 1 + count.toString().length
                count = 1
            }
        }
        size += 1 + count.toString().length
        return size
    }
}

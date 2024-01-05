import java.util.*

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * 1) Open brackets must be closed by the same type of brackets.
 * 2) Open brackets must be closed in the correct order.
 * 3) Every close bracket has a corresponding open bracket of the same type.
 */
class ValidParentheses {
    fun isValid(s: String): Boolean {
        val st = Stack<Char>()

        for (i in 0 until s.length) {
            val ch = s[i]
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch)
            } else {
                if (st.isEmpty()) {
                    return false
                }
                if ((st.peek() == '(' && ch == ')')
                    || (st.peek() == '{' && ch == '}')
                    || (st.peek() == '[' && ch == ']')
                ) {
                    st.pop()
                } else {
                    return false
                }
            }
        }
        return if (st.isEmpty()) {
            true
        } else {
            false
        }
    }
}

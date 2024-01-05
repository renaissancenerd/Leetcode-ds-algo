import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * 1) Open brackets must be closed by the same type of brackets.
 * 2) Open brackets must be closed in the correct order.
 * 3) Every close bracket has a corresponding open bracket of the same type.
 */



public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                if( (st.peek() == '(' && ch == ')')
                        ||(st.peek() == '{' && ch == '}')
                        ||(st.peek() == '[' && ch == ']')  ){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }else{return false;}

    }
}

import java.util.Arrays;

/**
 * Given two strings, write a method to check if one is a permutation of the other.
 *
 * Assumption: ASCII strings and case-sensitive
 */



public class StringPermutation {
    public String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public boolean permutation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }
}

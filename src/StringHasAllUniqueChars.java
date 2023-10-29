/**
 * Implement an algorithm to determine if a string has all unique characters. Do not use any additional data structures
 *
 * We will assume for the simplicity that the character set is ASCII. It could also be Unicode
 *
 *
 *Time complexity = O(N) where N is the length of the string
 * Space complexity = O(1)
 * */



public class StringHasAllUniqueChars {
    public boolean isUnique(String str){
        if(str.length() > 256) return false;

        boolean[] char_set = new boolean[256];
        for(int i=0; i< str.length(); i++){
            int val = str.charAt(i);
            if(char_set[val]){ // already found the char in this string
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}

/**
 * Implement a method to perform a basic string compression using the counts of repeated characters. For example, string aabcccaa would become a2b1c3a2
 * If the compressed string does not become smaller than the original string, return the original string
 */



public class StringCompression {
    /**
     * Solution 1
     * we will use StringBuffer
     * Time complexity: O(N)
     * Space complexity: O(N)
     */

    String compressBetter(String str){
        /* check if compression would create a longer string */
        int size = countCompression(str);
        if(size >= str.length()){
            return str;
        }

        StringBuffer mystr = new StringBuffer();
        char last = str.charAt(0);
        int count = 1;
        for(int i=1; i < str.length(); i++){
            if(str.charAt(i) == last){ // found repeated character
                count++;
            }
            else{
                // insert char count and update last character
                mystr.append(last); // insert char
                mystr.append(count); // insert count
                last = str.charAt(i);
                count=1;
            }
        }
        mystr.append(last);
        mystr.append(count);
        return mystr.toString();
    }

    int countCompression(String str){
        if(str == null || str.isEmpty()) return 0;

        char last = str.charAt(0);
        int size = 0;
        int count = 1;
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == last){
                count++;
            }
            else{
                last = str.charAt(i);
                size += 1 + String.valueOf(count).length();
                count = 1;
            }
        }
        size += 1 + String.valueOf(count).length();
        return size;

    }
}

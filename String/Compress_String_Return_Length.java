//LeetCode:- 443. String Compression

//Input: chars = ["a","a","b","b","c","c","c"]
//Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
//Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".


//Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
//Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
//Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".


package My_DSA_Journey.String;

public class Compress_String_Return_Length {
    public static int compress(char[] chars) {
        int idx = 0;


        for (int i = 0; i< chars.length; i++){
            char ch = chars[i];
            int count = 0;
            while(i < chars.length && chars[i] == ch){
                count++;
                i++;
            }

            if (count == 1){
                chars[idx++] = ch;
            } else {
                chars[idx++] = ch;
                String str = Integer.toString(count);
                for (char dig : str.toCharArray()){
                    chars[idx++] = dig;
                }
            }
            i--;
        }

        return idx;
    }

    public static void main(String[] args){
        char[] chars = {'a','a','b','b','c','c','c'};
//        String[] chars = {"a","a","b","b","c","c","c"};

        System.out.println(compress(chars));

    }
}

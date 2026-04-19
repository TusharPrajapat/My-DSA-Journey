package My_DSA_Journey.G_Recursion;

public class L_Remove_Duplicates_In_String {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, Boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main() {
        String str = "TusharPrajapat";
        removeDuplicates(str, 0, new StringBuilder(""), new Boolean[26]);
    }
}

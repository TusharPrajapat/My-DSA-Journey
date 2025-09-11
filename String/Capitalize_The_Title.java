//LeetCode --> 2129. Capitalize the Title

package My_DSA_Journey.String;

public class Capitalize_The_Title {
        public static String capitalizeTitle(String title) {
            String[] words = title.split(" ");

            StringBuilder output = new StringBuilder("");

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                if (word.length() <= 2) {
                    output.append(word.toLowerCase());

                } else {
                    output.append(Character.toUpperCase(word.charAt(0)));
                    output.append(word.substring(1).toLowerCase());
                }
                output.append(" ");
            }
            return output.toString().trim();
        }

        public static void main(String[] args){
//            String title = "capiTalIze tHe titLe";
//            String title = "First leTTeR of EACH Word";
            String title = "i lOve leetcode";

            System.out.println(capitalizeTitle(title));
        }
}

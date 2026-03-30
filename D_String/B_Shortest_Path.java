package My_DSA_Journey.D_String;

public class B_Shortest_Path {
    public static void check_Shortest_Path(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character == 'E') {
                x++;
            } else if (character == 'W') {
                x--;
            } else if (character == 'N') {
                y++;
            } else {
                y--;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;

        System.out.println("Shortest Distance is on (" + x + "," + y + ")" + " = " + Math.sqrt(X2 + Y2));
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        check_Shortest_Path(str);
    }
}

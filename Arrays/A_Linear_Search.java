package My_DSA_Journey.Arrays;

public class A_Linear_Search {
    public static int linear_search(int[] n, int key) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int find_Dish(String[] menu, String dish) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == dish) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] n = {2, 4, 6, 8, 10, 12, 14, 16};

        String[] menu = {"samosa", "dosa", "bhature", "edli"};
        String dish = "bhature";

        int Dish = find_Dish(menu, dish);

        if (Dish == -1) {
            System.out.println("Dish not found");
        } else {
            System.out.println("Dish found at index " + Dish);
        }

        int key = 10;
        int index = linear_search(n, key);

        if (index == -1) {
            System.out.println("Does not Found!");
        } else {
            System.out.println("Found at index " + index);
        }
    }
}

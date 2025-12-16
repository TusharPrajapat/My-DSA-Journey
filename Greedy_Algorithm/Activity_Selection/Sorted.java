package My_DSA_Journey.Greedy_Algorithm.Activity_Selection;

import java.util.ArrayList;

public class Sorted {
    public static void main(String[] args){
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(0);

        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++){
            if (start[i] >= lastEnd){
                //activity selection
                maxAct++;
                ans.add(i);
                lastEnd = end[i];

            }
        }

        System.out.println("Max activities = " + maxAct);

        for (int i = 0; i < ans.size(); i++){
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}

package org.example.tasks.SmallestPositive;

import java.util.HashSet;
import java.util.Set;

public class SmallPositive {

    public static int solution(int[] A) {
        Set<Integer> mySet = new HashSet<>(); //set take no duplicates

        for (int i : A) {
            mySet.add(i); //add non duplicates to set
        }

        for (int i = 1; i <= 100000; i++) {  //find first not existing in array
            if (!mySet.contains(i))
                return i; //return this number
        }
        return 0; //if not found return 0 - rather not possible
    }


    public static void main(String[] args) {

        int[] tab = {1, 3, 6, 4, 1, 2};
        int[] tab2 = {1, 2, 3};
        int[] tab3 = {-1, -3};

        System.out.println(solution(tab));
        System.out.println(solution(tab2));
        System.out.println(solution(tab3));

    }

}
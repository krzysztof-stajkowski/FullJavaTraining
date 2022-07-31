package org.example.tasks.oneToN;

public class OneToN {
    public static void main(String[] args) {

        int n = 10; //number of operations
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}

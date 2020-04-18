package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            if (n <= 0) {
                break;
            }
            int min = Integer.MAX_VALUE;
            for (int i=0;i<n;i++){
                int x = in.nextInt();
                if(x<min) {
                min=x;
                }
            }
            System.out.print(min);
        }
    }
}

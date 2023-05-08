package codeup;

import java.util.Scanner;

public class codeup1361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        **
//        0**
//        00**

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}

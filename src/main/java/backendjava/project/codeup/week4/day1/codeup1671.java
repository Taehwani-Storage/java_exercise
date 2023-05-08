package backendjava.project.codeup.week4.day1;

import java.util.Scanner;

public class codeup1671 {
    public String rockScisorPaper(int num1, int num2) {

        if (num1 == 1 && num2 == 2)
            return "win";
        else if (num1 == 0 && num2 == 1)
            return "win";
        else if (num1 == 2 && num2 == 0)
            return "win";
        else if (num1 == num2)
            return "tie";
        else
            return "lose";
    }

    public void printResult(int num1, int num2) {
        System.out.printf("%s", rockScisorPaper(num1, num2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        codeup1671 rcp = new codeup1671();
        rcp.printResult(num1, num2);
    }
}

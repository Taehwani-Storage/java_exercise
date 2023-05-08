package backendjava.project.codeup.week4.day1;

import java.util.Scanner;

public class RandomRockScissorPaper {
    public String RandomRSP(int user, int com) {

        switch (user + com) {
            case 1: //1 0(lose) or 0 1(win)
                if(user == 1) return "lose";
                else return "win";
            case 0, 2, 4:
                return "tie";
            case 3: // 1 2 (win) or 2 1(lose)
                if(user == 1) return "win";
                else return "lose";
            default:
                break;
        }
        return RandomRSP(user, com);
    }
    public void printResult(int user, int com){
        System.out.printf("유저: %d, 컴퓨터: %d, 승자는: %s", user, com, RandomRSP(user, com));
    }
    public static void main(String[] args) {
        RandomRockScissorPaper rrsp = new RandomRockScissorPaper();
        Scanner sc = new Scanner(System.in);
        int user1, com1;

        while (true) {
            user1 = sc.nextInt();
            com1 = sc.nextInt();

            rrsp.RandomRSP(user1, com1);
            rrsp.printResult(user1, com1);
//            이길 떄 종료
            if(rrsp.RandomRSP(user1, com1) == "win") {
                rrsp.printResult(user1, com1);
                break;
            }
        }
    }
}

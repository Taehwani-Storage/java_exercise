package backendjava.project.week4.day1;

public class Account {
//    int balance = 1000;
    int balance = 2000;
    public void printIsSufficient() {
        System.out.println("잔액이 충분합니다.");
    }
    public boolean isSufficient() {
        return balance >= 1500;
    }

}

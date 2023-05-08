package backendjava.project.week4.day1;

public class Payment {
    public static void main(String[] args) {
        Account account = new Account();
        boolean isSufficient = account.isSufficient();

        account.printIsSufficient();
        if(isSufficient) {
            System.out.println("결제 처리합니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}

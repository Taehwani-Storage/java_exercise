package backendjava.project.week4.day1;

public class MutsaMath {
//    약수의 합을 리턴하는 메소드
    public int sumOfFactors(int num) {

        int sum = 1;
        for(int i = 2; i <= num; i++) {
            if(num % i == 0)
                sum += i;
        }
        return sum;
    }
    void printResult(int num) {
        System.out.printf("%d의 약수의 합은 %d입니다.\n", num, sumOfFactors(num));
    }

    public static void main(String[] args) {
        MutsaMath mutsaMath = new MutsaMath();
//        int answer = mutsaMath.sumOfFactors();
        mutsaMath.printResult(12);
        mutsaMath.printResult(36);
        mutsaMath.printResult(48);
        mutsaMath.printResult(29);
        }
}

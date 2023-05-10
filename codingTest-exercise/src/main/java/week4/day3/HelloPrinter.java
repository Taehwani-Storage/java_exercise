package week4.day3;

public class HelloPrinter {
    Printer2 printer; // OCP(개방 폐쇄 원칙)에 의해 확장만 되는 곳

//    파일 저장, 콘솔 출력
    public void print(String message) {
        System.out.println(message);
    }
//    기능 1. 반복하는 기능 추가
    public void repeatMessage(int n, String message) {
        for(int i = 0; i < n; i++) {
            print(message);
        }
    }
    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter();
        hp.repeatMessage(5, "Hello");
    }
}

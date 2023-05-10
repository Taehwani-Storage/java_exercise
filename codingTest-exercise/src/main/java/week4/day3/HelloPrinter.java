package week4.day3;
import java.io.IOException;

public class HelloPrinter {
    //    파일 저장, 콘솔 출력
    // OCP(개방 폐쇄 원칙)에 의해 확장만 되는 곳
    Printer2 printer;
//    public void print(String message) {
//        System.out.println(message);
//    }
    public HelloPrinter(Printer2 printer) {
        this.printer = printer;
    }
//    기능 1. 반복하는 기능 추가
    public void repeatMessage(int n, String message) throws IOException {
        for(int i = 0; i < n; i++) {
            printer.print(message);
        }
    }
    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new FilePrinter());
        hp.repeatMessage(5, "Hello");
    }
}

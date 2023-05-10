package week4.day3;

public class HelloPrinter {
//    파일 저장, 콘솔 출력
    public void print(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        HelloPrinter hp = new HelloPrinter();
        hp.print("Hello");
        hp.print("Bye");
    }
}

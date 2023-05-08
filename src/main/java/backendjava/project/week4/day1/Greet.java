package backendjava.project.week4.day1;

public class Greet {
    public void printHello() {
        System.out.println("Hello");
    }
    public void printMessage(String message) {
        System.out.println(message);
    }
    public void printMessageWithName(String name, String message) {
        System.out.printf("%s %s\n", name, message);
    }

    public static void main(String[] args) {
        Greet greet = new Greet();
        greet.printMessage("안녕하세요.");
        greet.printMessageWithName("김경록", "좋은하루 되세요.");
    }
}

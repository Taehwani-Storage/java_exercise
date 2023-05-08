package backendjava.project.week4.day1;

public class Calculator {
    public void plus() {
        System.out.println(1 + 1);
    }
    public void printPlus(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public void printPlusOne(int num) {
        System.out.println(num + 1);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.plus();
        calculator.printPlusOne(30);
        calculator.printPlusOne(100);
        calculator.printPlusOne(350);

        calculator.printPlus(10, 20);
        calculator.printPlus(20, 30);
    }
}

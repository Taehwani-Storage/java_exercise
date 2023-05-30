package backend.week7.day1;

public class findLeapYear {

    public static void main(String[] args) {
//        1700, 2016, 2020, 1900, 2400, 2100, 2019
        int i = 1700;
        if(checkLeapYear(i))
            System.out.println(i + " O");
        else
            System.out.println(i + " X");
    }
    //      윤년은 4로 나누어지면서 100으로는 나누어지지 않는 경우
    public static boolean checkLeapYear (int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
//            System.out.printf("%d O", year);
//            System.out.printf("%d X", year);
    }
}

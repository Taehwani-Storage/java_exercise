package backend.week7.day1;

public class findLeapYear {

    public static void main(String[] args) {
//        1700, 2016, 2020, 1900, 2400, 2100, 2019
//        findLeapYear fly = new findLeapYear();
        checkLeapYear();
    }
    //      윤년은 4로 나누어지면서 100으로는 나누어지지 않는 경우
    private static void checkLeapYear () {
        int year = 2020;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.printf("%d O", year);
        else
            System.out.printf("%d X", year);
    }
}

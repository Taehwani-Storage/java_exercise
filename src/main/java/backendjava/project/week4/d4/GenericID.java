package backendjava.project.week4.d4;

import java.util.ArrayList;
import java.util.List;

public class GenericID {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("Bye");
        strList.add("1");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        for(String item : strList) {
            System.out.println(item);
        }

        for(int item : intList) {
            System.out.println(item);
        }
    }

}

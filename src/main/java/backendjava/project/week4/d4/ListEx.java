package backendjava.project.week4.d4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("Hello");
        l1.add(1);
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
        l1.remove(0);
        l1.remove(0);
        System.out.println(l1.isEmpty());

        int[] arr = new int[3];
        arr[0] = 1;
        arr[0] = 0; // 다시 0으로 초기화
//        arr[0] = null; // 이건 불가능
        System.out.println("-----------");
        for(var item : l1) {
//            System.out.println(item.split());
        }
    }
}

package codeup;

public class codeup1371 {
    public static String getRepeatSymbol(String symbol, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += symbol;
        }
        return answer;
    }
//    public String makeALine(int h, int i) {
//        int pivot = h / 2;
//
//        if(i <= pivot) {
////                피라미드 로직
//            return String.format("%s%s\n", getRepeatSymbol("0", h - i - 4), getRepeatSymbol("*", 2 * i + 1));
//        } else {
////                역피라미드 로직
//            return String.format("%s%s\n", getRepeatSymbol("0", i - pivot), getRepeatSymbol("*", 2 * (h - i) - 1));
//        }
//    }
    public static void main(String[] args) {
//        int h = 7;
//        int pivot = h / 2;
//        for(int i = 0; i < h; i++) {
//            System.out.print(makeALine(h, i));
//        }
        codeup1371Drawer c1341 = new codeup1371Drawer();
        c1341.printShape(7);

    }
}

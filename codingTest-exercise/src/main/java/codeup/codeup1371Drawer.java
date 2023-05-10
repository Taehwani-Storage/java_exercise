package codeup;

public class codeup1371Drawer extends ShapeDrawer {

    @Override
    public String makeALine(int h, int i) {
        int pivot = h / 2;

        if(i <= pivot) {
//                피라미드 로직
            return String.format("%s%s\n","0".repeat(h - i - 4), "*".repeat(2 * i + 1));
        } else {
//                역피라미드 로직
            return String.format("%s%s\n", "0".repeat(i - pivot), "*".repeat(2 * (h - i) - 1));
        }
    }
};

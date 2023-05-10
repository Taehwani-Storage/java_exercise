package codeup;

public abstract class ShapeDrawer {
    public abstract String makeALine(int h, int i);

    public void printShape(int h) {
        for(int i = 0; i < h; i++) {
            System.out.print(makeALine(h, i));
        }
    }
}

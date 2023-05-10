package codeup;

public class RitghtTriangleShapeDrawer extends ShapeDrawer2 {

    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ", "*".repeat(i));
    }

    public static void main(String[] args) {
        ShapeDrawer2 rightTriangle = new RitghtTriangleShapeDrawer();
        rightTriangle.printShape(5);
    }
}

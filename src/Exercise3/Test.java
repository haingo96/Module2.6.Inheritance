package Exercise3;

public class Test {
    public static void main(String[] args) {
        MovablePoint mPoint = new MovablePoint(0, 0, 1,1);
        mPoint.move();
        mPoint.move();
        mPoint.move();
        mPoint.move();

        System.out.println(mPoint.toString());
    }
}

package Exercise2;

public class Point2D {
    private float x, y;

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] result = new float[2];
        result[0] = getX();
        result[1] = getY();
        return result;
    }

    @Override
    public String toString() {
        return String.format("x = %s, y = %s", getX(), getY());
    }
}

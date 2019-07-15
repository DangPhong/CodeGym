public class Point {
    protected float x = 0;
    protected float y = 0;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
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

    public float[] getXY() {
        float[] arr = {getX(), getY()};
        return arr;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point có tọa độ (x,y): (" + getX() + "," + getY()+")";
    }

    public static void main(String[] args) {
        Point point = new Point(5, 6);
        System.out.println(point);
    }
}

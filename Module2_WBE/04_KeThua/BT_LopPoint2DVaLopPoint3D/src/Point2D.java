public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {

    }

    public Point2D(float x, float y) {
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


    public float[] getxy() {
        float[] xy = {getX(), getY()};
        return xy;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point có tọa độ x: " + getX() + " và tọa độ y: " + getY();
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 5);
        point2D.setXY(6, 5);
        System.out.println(point2D);
    }
}

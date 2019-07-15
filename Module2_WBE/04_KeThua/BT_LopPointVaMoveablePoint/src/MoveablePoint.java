public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arr = {getxSpeed(), getySpeed()};
        return arr;
    }

    @Override
    public String toString() {
        return super.toString() + " Có speed (" + getxSpeed() + ", " + getySpeed() + ")";
    }

    public MoveablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(6, 9, 8, 3);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}

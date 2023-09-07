public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println("X: " + ball.getX() +
                "; X: " + ball.getY() + ";\n");
        ball.move(0.5,-0.5);
        //Or use this
        System.out.println(ball.toString());
    }
}

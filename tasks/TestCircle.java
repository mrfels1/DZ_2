public class TestCircle {
    public static void main(String[] args) {
        Circle circl = new Circle(1.0, 2.0, 20);
        Circle circl2 = new Circle(1.0, 2.0, 10);
        System.out.println(circl.toString());
        circl.setCenter(10.0,20.0);
        circl.setRadius(2.0);
        System.out.println(circl.toString());
        if (circl.isBiggerthan(circl2)){
            System.out.println("is bigger than");
        }
        else {
            System.out.println("is less than");
        }
        System.out.println(circl2.toString());
    }
}

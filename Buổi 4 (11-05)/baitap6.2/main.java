package day3.truuTuong.baitap3;

public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Circle circle = new Circle(5.0);

        System.out.println(rectangle.toString());
        System.out.println("dien tich: "+rectangle.getArea());
        System.out.println("chu vi: "+ rectangle.getPerimeter());

        System.out.println(circle.toString());
        System.out.println("dien tich: "+circle.getArea());
        System.out.println("chu vi: "+ circle.getPerimeter());
    }
}

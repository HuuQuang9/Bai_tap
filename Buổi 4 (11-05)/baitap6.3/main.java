package day3.truuTuong.baitap4;

public class main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(5,5, 1, 1);

        System.out.println("Ban dau: "+movablePoint.toString());

        movablePoint.moveUp();
        System.out.println("Sau moveUp: "+ movablePoint.toString());

        movablePoint.moveDown();
        System.out.println("Sau moveDown: "+movablePoint.toString());

        movablePoint.moveLeft();
        System.out.println("Sau moveLeft: "+movablePoint.toString());

        movablePoint.moveRight();
        System.out.println("Sau moveRight: "+movablePoint.toString());
    }
}

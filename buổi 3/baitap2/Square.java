package day3.truuTuong.baitap2;

public class Square extends Rectangle{

    protected double side ;
    public Square(){};
    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, Boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side){
        super.width = side ;
    }
    public void setLength(double side){
        super.length = side ;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() +
                ']';
    }
}

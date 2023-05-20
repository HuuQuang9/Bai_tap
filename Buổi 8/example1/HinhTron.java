package day8.generic.example1;

public class HinhTron implements IHinhHoc{
    private double r = 1.0 ;

    public HinhTron(double r) {
        this.r = r;
    }

    public HinhTron() {
    }

    @Override
    public double tinhChuVi() {
        return 2* Math.PI * r ;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*r*r;
    }

    @Override
    public String toString() {
        return "HinhTron[" +
                "r=" + r +
                ']';
    }
}

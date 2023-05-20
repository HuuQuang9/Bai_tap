package day8.generic.example1;

public class HinhVuong implements IHinhHoc{
    private double canh  = 1.0;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return canh * 4;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }

    @Override
    public String toString() {
        return "HinhVuong[" +
                "canh=" + canh +
                ']';
    }
}

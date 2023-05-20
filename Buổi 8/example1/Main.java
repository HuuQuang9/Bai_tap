package day8.generic.example1;

public class Main {
    public static void main(String[] args) {
        HinhVuong hinhVuong = new HinhVuong(5);
        HinhTron hinhTron = new HinhTron(50);
        Drawable drawable = new Drawable();
        drawable.draw(hinhVuong);
        drawable.draw(hinhTron);
    }
}

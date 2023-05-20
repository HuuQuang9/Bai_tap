package day8.generic.example1;

public class Drawable {
    public Drawable() {
    }

    public void draw(IHinhHoc hinhHoc){
        System.out.println("Vẽ ra "+hinhHoc.toString());
    }
}

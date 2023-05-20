package day8.generic.example2;

public class Main {
    public static void main(String[] args) {
        TinhToanSoThuc tinhToanSoThuc = new TinhToanSoThuc();
        TinhToanPhanSo tinhToanPhanSo = new TinhToanPhanSo();
        double d1 = 5;
        double d2 = 7;
        System.out.print("Tinh toan so thuc: ");
        System.out.println(d1 + " + "+ d2 +" = "+tinhToanSoThuc.cong(5.0,7.0));
        System.out.println(d1 + " - "+ d2 +" = "+tinhToanSoThuc.tru(5.0,7.0));
        System.out.println(d1 + " * "+ d2 +" = "+tinhToanSoThuc.nhan(5.0,7.0));
        System.out.println(d1 + " / "+ d2 +" = "+tinhToanSoThuc.chia(5.0,7.0));
        PhanSo phanSo1 = new PhanSo(3,5);
        PhanSo phanSo2 = new PhanSo(1,5);
        PhanSo phanSo3 = new PhanSo(3,8);
        System.out.println("Tinh toan phan so cung mau so: ");
        System.out.println(phanSo1.toString()+" + "+phanSo2.toString()+" = "+ tinhToanPhanSo.cong(phanSo1,phanSo2));
        System.out.println(phanSo1.toString()+" - "+phanSo2.toString()+" = "+ tinhToanPhanSo.tru(phanSo1,phanSo2));
        System.out.println(phanSo1.toString()+" * "+phanSo2.toString()+" = "+ tinhToanPhanSo.nhan(phanSo1,phanSo2));
        System.out.println(phanSo1.toString()+" / "+phanSo2.toString()+" = "+ tinhToanPhanSo.chia(phanSo1,phanSo2));
        System.out.println("Tinh toan phan so khong cung mau so: ");
        System.out.println(phanSo1.toString()+" + "+ phanSo3.toString()+" = "+tinhToanPhanSo.cong(phanSo1,phanSo3) );
        System.out.println(phanSo1.toString()+" - "+ phanSo3.toString()+" = "+tinhToanPhanSo.tru(phanSo1,phanSo3) );
        System.out.println(phanSo1.toString()+" * "+ phanSo3.toString()+" = "+tinhToanPhanSo.nhan(phanSo1,phanSo3) );
        System.out.println(phanSo1.toString()+" / "+ phanSo3.toString()+" = "+tinhToanPhanSo.chia(phanSo1,phanSo3) );

    }
}
